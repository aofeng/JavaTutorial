/**
 * 创建时间：2016-8-5
 */
package cn.aofeng.demo.httpclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
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
            
            InputStream ins = httpEx.getRequestBody();
            String content = IOUtils.toString(ins, "utf-8");
            _logger.info("请求内容:"+content);
            IOUtils.closeQuietly(ins);
            
            String rc = "Hello, 汉字";
            byte[] temp = rc.getBytes("utf-8");
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
