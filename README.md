#JavaTutorial（Java教程）
在成长的过程中，会学到许多新的知识；在项目实践过程中，经常需要学习新的技术。但经过一段时间后，这些知识点和技术又忘得差不多了，等到要用的时候又要搜索很多的资料从头到尾学习一次，浪费很多的时间，没有沉淀和积累。

在这里，通过文章和代码，把这些知识点和技术的主要内容记录并汇总，供自己快速回顾，也分享给他人。

## 数据结构
* [在控制台输出类似目录树的结构](src/cn/aofeng/demo/tree)

## 定时器
* [Timer](src/cn/aofeng/demo/java/util/timer/TimerDemo.java)
* [ScheduledExecutorService](src/cn/aofeng/demo/java/util/concurret/ScheduledExecutorServiceDemo.java)

## 数据库
* [Apache DbUtils - JDBC Utility Component](src/cn/aofeng/demo/dbutils)
* [JDBC元数据使用示例](src/cn/aofeng/demo/jdbc/MetaDataExample.java)
* [MyBatis3使用示例](src/cn/aofeng/demo/mybatis)

## XML
* [XPath](src/cn/aofeng/demo/xml/XPathDemo.java)

## 序列化与反序列化
### Gson
* [普通对象-序列化与反序列化](src/cn/aofeng/demo/json/gson/SimpleObjectSerialize.java)
* [数组-序列化](src/cn/aofeng/demo/json/gson/ArraySerialize.java)
* [数组-反序列化](src/cn/aofeng/demo/json/gson/ArrayDeserialize.java)
* [集合-序列化](src/cn/aofeng/demo/json/gson/CollectionsSerialize.java)
* [集合-反序列化](src/cn/aofeng/demo/json/gson/CollectionDeserialize.java)
* [自定义序列化](src/cn/aofeng/demo/json/gson/CustomSerialize.java)
* [自定义反序列化](src/cn/aofeng/demo/json/gson/CustomDeserialize.java)
* [Gson教程-序列化与反序列化基础操作](http://aofengblog.com/2015/08/12/Gson-%E5%BA%8F%E5%88%97%E5%8C%96%E4%B8%8E%E5%8F%8D%E5%BA%8F%E5%88%97%E5%8C%96%E5%9F%BA%E7%A1%80%E6%93%8D%E4%BD%9C/)
* [Gson教程-自定义序列化](http://aofengblog.com/2015/08/14/Gson-%E8%87%AA%E5%AE%9A%E4%B9%89%E5%BA%8F%E5%88%97%E5%8C%96/)
* [Gson教程-自定义反序列化](http://aofengblog.com/2015/08/17/Gson-%E8%87%AA%E5%AE%9A%E4%B9%89%E5%8F%8D%E5%BA%8F%E5%88%97%E5%8C%96/)

## 单元测试
* [单元测试 - JUnit+Ant自动化执行单元测试并生成报告 | How to Automated Unit Testing with JUnit and Ant](http://aofengblog.com/2013/02/27/%E5%8D%95%E5%85%83%E6%B5%8B%E8%AF%95-JUnit-Ant%E8%87%AA%E5%8A%A8%E5%8C%96%E6%89%A7%E8%A1%8C%E5%8D%95%E5%85%83%E6%B5%8B%E8%AF%95%E5%B9%B6%E7%94%9F%E6%88%90%E6%8A%A5%E5%91%8A/)
* [单元测试 - JUnit+Ant+Cobertura生成单元测试代码覆盖率 | How to Generate Code Coverage Report With Junit And Cobertura](http://aofengblog.com/2013/02/27/%E5%8D%95%E5%85%83%E6%B5%8B%E8%AF%95-JUnit-Ant-Cobertura%E7%94%9F%E6%88%90%E5%8D%95%E5%85%83%E6%B5%8B%E8%AF%95%E4%BB%A3%E7%A0%81%E8%A6%86%E7%9B%96%E7%8E%87/)
* [使用Jetty实现Http Server Mock作单元测试](src/cn/aofeng/demo/jetty)

### EasyMock
* [使用EasyMock作单元测试](src/cn/aofeng/demo/easymock)

### WireMock
* [使用WireMock实现Http Server Mock作单元测试](src/cn/aofeng/demo/wiremock)

### Mockito
* [使用Mockito作单元测试](src/cn/aofeng/demo/mockito)


## 网络＆I/O
* [多线程网络echo服务](src/cn/aofeng/demo/io/MultiThreadEchoServer.java)
* [线程池网络echo服务](src/cn/aofeng/demo/io/ThreadPoolEchoServer.java)
* [NIO 缓冲区](src/cn/aofeng/demo/nio/BufferIO.java)
* [NIO 内存映射](src/cn/aofeng/demo/nio/MemoryMapper.java)
* [NioEchoServer](src/cn/aofeng/demo/nio/NioEchoServer.java)
* [NIO - 入门篇](http://aofengblog.com/2008/10/21/Java-NIO%E5%85%A5%E9%97%A8%E7%AF%87/)
* [NIO - 文件锁](http://aofengblog.com/2008/10/27/Java-NIO%E6%96%87%E4%BB%B6%E9%94%81/)
* [缓冲区操作和内存映射](http://aofengblog.com/2013/09/29/Java-%E7%BC%93%E5%86%B2%E5%8C%BA%E6%93%8D%E4%BD%9C%E5%92%8C%E5%86%85%E5%AD%98%E6%98%A0%E5%B0%84/)
* [Java网络处理模型-阻塞I/O+多线程](http://aofengblog.com/2013/10/22/Java%E7%BD%91%E7%BB%9C%E5%A4%84%E7%90%86%E6%A8%A1%E5%9E%8B-%E9%98%BB%E5%A1%9EI-O-%E5%A4%9A%E7%BA%BF%E7%A8%8B/)
* [Java网络处理模型-阻塞I/O+线程池](http://aofengblog.com/2013/10/24/Java%E7%BD%91%E7%BB%9C%E5%A4%84%E7%90%86%E6%A8%A1%E5%9E%8B-%E9%98%BB%E5%A1%9EI-O-%E7%BA%BF%E7%A8%8B%E6%B1%A0/)
* [Reactor模式与非阻塞I/O | Reactor Pattern and NIO](http://aofengblog.com/2013/11/04/Reactor%E6%A8%A1%E5%BC%8F%E4%B8%8E%E9%9D%9E%E9%98%BB%E5%A1%9EI-O/)

### HTTP
* [使用Fluent API发起HTTP请求（Get和Post）](src/cn/aofeng/demo/httpclient/FluentApi.java)
* [使用HttpClient发起HTTP请求（Get, Post和上传文件）](src/cn/aofeng/demo/httpclient/FluentApi.java)
* [使用JDK中的API建立简单的HTTP Server](src/cn/aofeng/demo/httpclient/server/SimpleHttpServer.java)

### Netty 4.0.x
* [EchoServer](src/cn/aofeng/demo/netty40x/echo/EchoServer.java)
* [EchoClient](src/cn/aofeng/demo/netty40x/echo/EchoClient.java)


## 线程＆并发
* [fork/join](src/cn/aofeng/demo/java/util/forkjoin/HelloForkJoin.java)
* [Future](src/cn/aofeng/demo/java/util/future/HelloFuture.java)
* [Future接口关系图](src/cn/aofeng/demo/java/util/future/Future.ucls)
* [Servlet的线程安全问题](http://aofengblog.com/2008/11/16/Servlet%E7%9A%84%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A8%E9%97%AE%E9%A2%98/)
* [多线程池执行异步任务](http://aofengblog.com/2014/03/31/%E5%A4%9A%E7%BA%BF%E7%A8%8B%E6%B1%A0%E6%89%A7%E8%A1%8C%E5%BC%82%E6%AD%A5%E4%BB%BB%E5%8A%A1/)
* [事件驱动的异步化框架:event4j](http://aofengblog.blog.163.com/blog/static/63170212014102463624267/)
* [JDK HashMap源码分析 | HashMap Source Code Analysis](http://aofengblog.com/2014/08/14/JDK-HashMap%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90/)

## 反射＆代理
* [获取构造方法、普通方法、字段和注解](src/cn/aofeng/demo/java/lang/reflect/ClassAnalyze.java)
* [使用构造方法创建对象实例](src/cn/aofeng/demo/java/lang/reflect/CreateInstance.java)
* [调用方法](src/cn/aofeng/demo/java/lang/reflect/InvokeMethod.java)
* [获取/设置字段值](src/cn/aofeng/demo/java/lang/reflect/InvokeField.java)
* [静态代理＆动态代理](src/cn/aofeng/demo/proxy/AccountServiceClient.java)

## 脚本语言
* [在Java中执行JavaScript脚本](src/cn/aofeng/demo/script/ScriptRunPerformence.java)
* [多个脚本引擎执行JavaScript的性能比较](src/cn/aofeng/demo/script/MultiScriptEngineCompare.java)
* [在JVM中编译脚本提升运行性能](http://aofengblog.com/2013/12/12/%E5%9C%A8JVM%E4%B8%AD%E7%BC%96%E8%AF%91%E8%84%9A%E6%9C%AC%E6%8F%90%E5%8D%87%E6%80%A7%E8%83%BD/)

## 加密解密
* [Blowfish加密与解密](src/cn/aofeng/demo/encrypt/Blowfish.java)
* [AES加密与解密](src/cn/aofeng/demo/encrypt/AES.java)
* [Blowfish, AES性能比较](src/cn/aofeng/demo/encrypt/PerformanceCompare.java)
* [HMAC-SHA1签名算法](src/cn/aofeng/demo/encrypt/HmacSha1.java)

## 开源组件
### Redis
* [Redis客户端Jedis使用示例](src/cn/aofeng/demo/redis/JedisDemo.java)

### SSH
* [Struts2 - 支持JSON / Using json in struts2](http://aofengblog.com/2010/08/23/Struts2-%E6%94%AF%E6%8C%81JSON/)
* [Struts2 - Unable to load configuration. - bean 错误解决](http://aofengblog.blog.163.com/blog/static/631702120103184042768/)
* [Spring IBatis Struts2 集成之一：Spring与IBatis集成 | Spring IBatis Struts2 Integration I: Spring Integrates with IBatis](http://aofengblog.com/2011/03/19/Spring-IBatis-Struts2-%E9%9B%86%E6%88%90%E4%B9%8B%E4%B8%80%EF%BC%9ASpring%E4%B8%8EIBatis%E9%9B%86%E6%88%90/)
* [Spring IBatis Struts2 集成之二：Spring与Struts2集成 | Spring IBatis Struts2 Integration II: Spring Integrates with Struts2](http://aofengblog.com/2011/03/22/Spring-IBatis-Struts2-%E9%9B%86%E6%88%90%E4%B9%8B%E4%BA%8C%EF%BC%9ASpring%E4%B8%8EStruts2%E9%9B%86%E6%88%90/)

### Tomcat
* [JMX管理Tomcat/Resin](http://aofengblog.com/2008/08/17/Tomcat-JMX%E7%AE%A1%E7%90%86Tomcat-Resin/)

### JBoss
* [JBoss5.1.0 GA - 部署项目类库兼容和类库冲突问题解决方法](http://aofengblog.blog.163.com/blog/static/631702120113674626533/)

## EJB
* [EJB3 - 使用Eclipse和JBoss开发和部署Session Bean | How to create Session Bean using JBoss and Eclipse](http://aofengblog.com/2011/03/14/EJB3-%E4%BD%BF%E7%94%A8Eclipse%E5%92%8CJBoss%E5%BC%80%E5%8F%91%E5%92%8C%E9%83%A8%E7%BD%B2Session-Bean/)
* [EJB3 - 使用Eclipse和JBoss开发和部署Entity Bean | How to create Entity Bean using JBoss and Eclipse](http://aofengblog.com/2011/03/14/EJB3-%E4%BD%BF%E7%94%A8Eclipse%E5%92%8CJBoss%E5%BC%80%E5%8F%91%E5%92%8C%E9%83%A8%E7%BD%B2Entity-Bean/)

## 设计模式
* [事件驱动](src/cn/aofeng/demo/eventdriver_normal)
* [事件驱动改进版](src/cn/aofeng/demo/eventdriver_improve)
* [Reactor](src/cn/aofeng/demo/reactor)

## Java工具
* [在Linux上安装JDK](http://aofengblog.com/2008/11/17/%E5%9C%A8Linux%E4%B8%8A%E5%AE%89%E8%A3%85JDK/)
* [在Linux上安装Ant](http://aofengblog.blog.163.com/blog/static/631702120081017113327582/)
* [Java程序以后台方式在Linux上运行](http://aofengblog.blog.163.com/blog/static/631702120081014104934762/)
* [Java使用SSH从远程服务器下载文件](http://aofengblog.blog.163.com/blog/static/6317021201362975846986/)
* [Java实现在控制终端显示的字符进度条](http://aofengblog.com/2013/07/27/Java-%E5%AE%9E%E7%8E%B0%E5%9C%A8%E6%8E%A7%E5%88%B6%E7%BB%88%E7%AB%AF%E6%98%BE%E7%A4%BA%E7%9A%84%E5%AD%97%E7%AC%A6%E8%BF%9B%E5%BA%A6%E6%9D%A1/)
* [VisualGC+Jstatd实时监控远程JVM](http://aofengblog.com/2013/06/29/Java-VisualGC-Jstatd%E5%AE%9E%E6%97%B6%E7%9B%91%E6%8E%A7%E8%BF%9C%E7%A8%8BJVM/)
* [获取主机信息](src/cn/aofeng/demo/misc/GetHostInfo.java)

