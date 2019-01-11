# blog
个人博客
2019-01-08  
    18:01 一个配置文件搞了很久 
           遇见问题
           1. 不清楚springboot和web的区别, 前者文件时放在/resource/ static 和templates文件下的
                不需要配置web.xml文件,后者是放在  WEB-INFO 下的 需要配置web.xml
           2. @RestController和@Controller的区别: 前者只会输出字符串,相当于后者加上@ResponseBody
                所以导致第一个问题
           3. maven配置问题,因为没有 一下的 2.*的版本 --> 处理方法 在pom.xml文件上手动加上 3.0.11的版本
           <dependency>
                 <groupId>org.thymeleaf</groupId>
                 <artifactId>thymeleaf-spring5</artifactId>
                 <version>${thymeleaf.version}</version>
             </dependency>
            4. (不确定) 在导入到本地时候,多配置了东西.(在使用金庆雨的程序的时候,多配置了tomcat导致程序找不到主类的问题)
  01-09
    11:16
    将#primaryBlog   博客给删除了 重新设置一个(小项目使用maven多模块)
    参考 <href>https://jingyan.baidu.com/article/9c69d48fe68cce13c9024e9c.html</href>
    11:29
    idea启动spring boot 项目不报错直接退出
    <dependency>  
           <groupId>org.springframework.boot</groupId>  
           <artifactId>spring-boot-starter-tomcat</artifactId>  
            <scope>provided</scope> (去掉就可以了)
    </dependency>  
  
  01-10
    14:29
    上网参考了其他的一些博客,如JFinal(另一个轻量级框架,不准备使用) 里边有很多知识可以借鉴(如一些验证为空方法判断等其中的模式思路)  
    写该博客主要目标是为了做一个适合自己的工作学习及日程等方面的记录平台,另一方面目的是为了学习及巩固Java方面相关的知识  
  01-11
    10:15
    thymeleaf 引入css的时候因为路径的问题需要 适当的加上   /(根目录)  或 ../(上级目录) 如  
    <link rel="stylesheet" href="static/blog/css/class_css.css"/>--应该为-->  
    <link rel="stylesheet" href="/static/blog/css/class_css.css"/>(相当于根目录或者在前边加../(上一级目录))
        --> 只是在idea上可以连接到该css文件
    结果还是不生效: -->  原因:  在thymeleaf中默认是在staitc目录下的 使用 th:href="@{/blog/css/class_css.css}"