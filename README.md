# graduation_project
这个项目是关于摄影网站的。技术选型是SpringBoot+Dubbo(zookeeper)。前端框架BootStrap+Angularjs，模板引擎Thymeleaf。HikariCP
Log4j2,UnderTow。
现在只写了HomePage这一项。可以运行。所选依赖都是自己亲自并引入，不敢随便添加。但是本人能力有限不属于高手，只是一个小小应届生。登录中重定向到主页面有bug，目前猜测是因为
index.html中动态特效未正确加载。解决办法可以跳转其他页面。
如果大佬想加zookeeper集群那就随便加，就个配置backup。
其他功能都未实现，可以把这个项目拿来玩和加以补充。其他功能环境都是搭建好的，但是你想要什么技术来实现，自己再添加依赖。
包括日志各种方面，完全可以自己补充变得复杂，比如把日志打印到文件生成文件或者用日志收集各种实现技术实现，玩法多样，仅是抛砖引玉。
自己因为毕设没有那么复杂，而且图片是要拿出来不能编译的，需要单独作一个服务器，为的是简单。
说明一下吧，谁爱纳就拿。而且用webjars也不行，没有解决掉css失效bug
代码就别看了，简单和垃圾和普通。就是熟悉下依赖和配置