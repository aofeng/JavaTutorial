/**
 * 创建时间：2016-8-5
 */
package cn.aofeng.demo.httpclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/**
 * 简单的HTTP Server。
 * 
 * @author <a href="mailto:aofengblog@163.com">聂勇</a>
 */
public class SimpleHttpServer {

    private static Logger _logger = Logger.getLogger(SimpleHttpServer.class);
    
    private static String _charset = "utf-8";
    
    static class MyHandler implements HttpHandler {
        
        @Override
        public void handle(HttpExchange httpEx) throws IOException {
            InetSocketAddress remoteAddress = httpEx.getRemoteAddress();
            _logger.info("收到来自"+remoteAddress.getAddress().getHostAddress()+":"+remoteAddress.getPort()+"的请求");
            
            URI rUri = httpEx.getRequestURI();
            _logger.info("请求地址:"+rUri.toString());
            
            String method = httpEx.getRequestMethod();
            _logger.info("请求方法:"+method);
            
            Headers headers = httpEx.getRequestHeaders();
            Set<Entry<String, List<String>>> headerSet = headers.entrySet();
            _logger.info("请求头:");
            for (Entry<String, List<String>> header : headerSet) {
                _logger.info(header.getKey()+":"+header.getValue());
            }
            
            // 获取请求内容
            InputStream ins = httpEx.getRequestBody();
            String content = URLDecoder.decode(
                    IOUtils.toString(ins, _charset), _charset);
            _logger.info("请求内容:"+content);
            IOUtils.closeQuietly(ins);
            
            // 返回响应
            String rc = "冒号后面是收到的请求，原样返回:"+content;
            byte[] temp = rc.getBytes(_charset);
            Headers outHeaders = httpEx.getResponseHeaders();
            outHeaders.set("ABC", "123");
            httpEx.sendResponseHeaders(200, temp.length);
            OutputStream outs = httpEx.getResponseBody();
            outs.write(temp);
            IOUtils.closeQuietly(outs);
        }
        
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        int port = 8888;
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(port), 128);
            server.createContext("/get", new MyHandler());
            server.createContext("/post", new MyHandler());
            server.start();
            _logger.info("http server already started, listen port:"+port);
        } catch (IOException e) {
            _logger.error("", e);
        }
    }

}
