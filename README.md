# WXMPDemoBackend
微信小程序测试用后端

src/main/resources/application.properties

```properties
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://ip:port/schema?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8
spring.datasource.username=username
spring.datasource.password=password
mybatis.mapper-locations=classpath:mapper/mbg/*.xml
```

