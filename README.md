# jee4a-feign-api


spring cloud 之 声明式接口调用 feign<br> 
依赖公共的 api 接口： jee4a-user-service-api<br> 

1、<br>
前提：<br>
需启动服务注册中心：jee4a-eureka-server <br>
启动两个user-service实例: jee4a-user-service <br>

2、<br>
打包：<br>
cd jee4a-feign-api<br>
mvn clean install -D maven.test.skip=true<br>


3、<br>
启动：<br>
java -jar target/jee4a-feign-api-0.0.1-SNAPSHOT.jar<br>

4、<br>
访问：<br>
负载均衡：  http://localhost:8090/userinfo/1<br>
断熔器：http://localhost:8090/userinfo-1/1<br>
