#JavaTutorial（Java教程）
在成长的过程中，会学到许多新的知识；在项目实践过程中，经常需要学习新的技术。但经过一段时间后，这些知识点和技术又忘得差不多了，等到要用的时候又要搜索很多的资料从头到尾学习一次，浪费很多的时间，没有沉淀和积累。

在这里，通过文章和代码，把这些知识点和技术的主要内容记录并汇总，供自己快速回顾，也分享给他人。涉及的内容有：
* Java基础
* Java中级
* Java高级
* Java企业开发

#Java基础
##数据结构
* [Map接口及其实现类的关系图](src/cn/aofeng/demo/java/util/map/Map接口及其实现类.ucls)

##数据库
* [Apache DbUtils - JDBC Utility Component](src/cn/aofeng/demo/dbutils)

##Redis
* [Redis客户端Jedis使用示例](src/cn/aofeng/demo/redis/JedisDemo.java)


#Java中级
##反射
* [获取构造方法、普通方法、字段和注解](src/cn/aofeng/demo/java/lang/reflect/ClassAnalyze.java)
* [使用构造方法创建对象实例](src/cn/aofeng/demo/java/lang/reflect/CreateInstance.java)
* [调用方法](src/cn/aofeng/demo/java/lang/reflect/InvokeMethod.java)
* [获取/设置字段值](src/cn/aofeng/demo/java/lang/reflect/InvokeField.java)

##序列化与反序列化
###Json
####Gson
#####代码
* [普通对象-序列化与反序列化](src/cn/aofeng/demo/json/gson/SimpleObjectSerialize.java)
* [数组-序列化](src/cn/aofeng/demo/json/gson/ArraySerialize.java)
* [数组-反序列化](src/cn/aofeng/demo/json/gson/ArrayDeserialize.java)
* [集合-序列化](src/cn/aofeng/demo/json/gson/CollectionsSerialize.java)
* [集合-反序列化](src/cn/aofeng/demo/json/gson/CollectionDeserialize.java)
* [自定义序列化](src/cn/aofeng/demo/json/gson/CustomSerialize.java)
* [自定义反序列化](src/cn/aofeng/demo/json/gson/CustomDeserialize.java)

#####文章
* [Gson教程-序列化与反序列化基础操作](http://aofengblog.blog.163.com/blog/static/6317021201571275718825/)
* [Gson教程-自定义序列化](http://aofengblog.blog.163.com/blog/static/631702120157148122062/)
* [Gson教程-自定义反序列化](http://aofengblog.blog.163.com/blog/static/631702120157178202587/)

##定时器
###代码
* [Timer](src/cn/aofeng/demo/java/util/timer/TimerDemo.java)
* [ScheduledExecutorService](src/cn/aofeng/demo/java/util/concurret/ScheduledExecutorServiceDemo.java)

##设计模式
* [事件驱动](src/cn/aofeng/demo/eventdriver_normal)
* [事件驱动改进版](src/cn/aofeng/demo/eventdriver_improve)
* [Reactor](src/cn/aofeng/demo/reactor)

##单元测试
###文章
* [单元测试 - JUnit+Ant自动化执行单元测试并生成报告 | How to Automated Unit Testing with JUnit and Ant](http://aofengblog.blog.163.com/blog/static/6317021201312734058296/)
* [单元测试 - JUnit+Ant+Cobertura生成单元测试代码覆盖率 | How to Generate Code Coverage Report With Junit And Cobertura](http://aofengblog.blog.163.com/blog/static/6317021201312763630878/)
* [使用Jetty实现Http Server Mock作单元测试](src/cn/aofeng/demo/jetty)
* [使用WireMock实现Http Server Mock作单元测试](src/cn/aofeng/demo/wiremock)

##其他
* [获取主机信息](src/cn/aofeng/demo/misc/GetHostInfo.java)

#Java高级
##网络与I/O
###代码
* [多线程网络echo服务](src/cn/aofeng/demo/io/MultiThreadEchoServer.java)
* [线程池网络echo服务](src/cn/aofeng/demo/io/ThreadPoolEchoServer.java)
* [NIO 缓冲区](src/cn/aofeng/demo/nio/BufferIO.java)
* [NIO 内存映射](src/cn/aofeng/demo/nio/MemoryMapper.java)
* [NioEchoServer](src/cn/aofeng/demo/nio/NioEchoServer.java)
* [netty4.x-DiscardServer]()
* [netty4.x-DiscardServer]()
* [netty4.x-DiscardServer]()

###文章
* [NIO - 入门篇（笔记）](http://aofengblog.blog.163.com/blog/static/6317021200892145321884/)
* [NIO - 文件锁（笔记）](http://aofengblog.blog.163.com/blog/static/631702120089276182626/)
* [缓冲区操作和内存映射](http://aofengblog.blog.163.com/blog/static/6317021201382925314705/)
* [Java网络处理模型-阻塞I/O+多线程](http://aofengblog.blog.163.com/blog/static/6317021201392153148393/)
* [Java网络处理模型-阻塞I/O+线程池](http://aofengblog.blog.163.com/blog/static/63170212013921758425/)
* [Reactor模式与非阻塞I/O | Reactor Pattern and NIO](http://aofengblog.blog.163.com/blog/static/6317021201310293953286/)

##线程与并发
###代码
* [fork/join](src/cn/aofeng/demo/java/util/forkjoin/HelloForkJoin.java)
* [Future](src/cn/aofeng/demo/java/util/future/HelloFuture.java)
* [Future接口关系图](src/cn/aofeng/demo/java/util/future/Future.ucls)

###文章
* [Servlet的线程安全问题](http://aofengblog.blog.163.com/blog/static/631702120081016102531434/)
* [多线程池执行异步任务](http://aofengblog.blog.163.com/blog/static/6317021201423193434810/)
* [事件驱动的异步化框架:event4j](http://aofengblog.blog.163.com/blog/static/63170212014102463624267/)

##源码分析
* [JDK HashMap源码分析 | HashMap Source Code Analysis](http://aofengblog.blog.163.com/blog/static/631702120147148919858/)

## 脚本语言
###代码
* [在Java中执行JavaScript脚本](src/cn/aofeng/demo/script/ScriptRunPerformence.java)

###文章
* [在JVM中编译脚本提升运行性能](http://aofengblog.blog.163.com/blog/static/6317021201311143045607/)

##加密解密
* [加密解密基础类](src/cn/aofeng/demo/encrypt/EncryptAndDecrypt.java)
* [Blowfish加密与解密](src/cn/aofeng/demo/encrypt/Blowfish.java)


#Java企业开发
##开源框架
* [Struts2 - 支持JSON / Using json in struts2](http://aofengblog.blog.163.com/blog/static/6317021201072311443715/)
* [Struts2 - Unable to load configuration. - bean 错误解决](http://aofengblog.blog.163.com/blog/static/631702120103184042768/)
* [Spring IBatis Struts2 集成之一：Spring与IBatis集成 | Spring IBatis Struts2 Integration I: Spring Integrates with IBatis](http://aofengblog.blog.163.com/blog/static/6317021201121911105510/)
* [Spring IBatis Struts2 集成之二：Spring与Struts2集成 | Spring IBatis Struts2 Integration II: Spring Integrates with Struts2](http://aofengblog.blog.163.com/blog/static/6317021201122172525296/)

## EJB
* [EJB3 - 使用Eclipse和JBoss开发和部署Session Bean | How to create Session Bean using JBoss and Eclipse](http://aofengblog.blog.163.com/blog/static/6317021201121310318552/)
* [EJB3 - 使用Eclipse和JBoss开发和部署Entity Bean | How to create Entity Bean using JBoss and Eclipse](http://aofengblog.blog.163.com/blog/static/631702120112147279187/)

##Tomcat
* [JMX管理Tomcat/Resin](http://aofengblog.blog.163.com/blog/static/6317021200871711013857/)

##Jetty
* []()

##JBoss
* [JBoss5.1.0 GA - 部署项目类库兼容和类库冲突问题解决方法](http://aofengblog.blog.163.com/blog/static/631702120113674626533/)


#Java工具
* [在Linux上安装JDK](http://aofengblog.blog.163.com/blog/static/6317021200810172817818/)
* [在Linux上安装Ant](http://aofengblog.blog.163.com/blog/static/631702120081017113327582/)
* [Java程序以后台方式在Linux上运行](http://aofengblog.blog.163.com/blog/static/631702120081014104934762/)
* [Java使用SSH从远程服务器下载文件](http://aofengblog.blog.163.com/blog/static/6317021201362975846986/)
* [Java实现在控制终端显示的字符进度条](http://aofengblog.blog.163.com/blog/static/6317021201362723025426/)
* [VisualGC+Jstatd实时监控远程JVM](http://aofengblog.blog.163.com/blog/static/63170212013529818373/)
