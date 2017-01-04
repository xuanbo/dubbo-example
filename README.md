# 说明

dubbo 的入门例子。

消费方可以使用mvc做restful服务，调用暴露的接口即可。

# 流程

*   首先安装 zookeeper，配置后并启动
*   启动provider模块的App Main方法
*   启动consumer模块的App Main方法

# dubbo-admin

*   github上clone dubbo源码
*   进入dubbo-admin文件夹，mvn jetty:run -Ddubbo.registry.address=zookeeper://127.0.0.1:2181
*   浏览器输入http://localhost:8080即可

根据实际情况修改IP和端口号。

# dubbo的不足

任何技术都有其使用范围和局限性，dubbo也不例外。dubbo主要是对Provider提供的服务进行服务治理、负载均衡、灰度发布提供支撑；不负责consumer对外提供的服务，我们一般用nginx或者F5来实现它的负载均衡。nginx提供热reload，这样已经够用了。如果要对nginx实现负载均衡的话，可以使用DNS的方式。