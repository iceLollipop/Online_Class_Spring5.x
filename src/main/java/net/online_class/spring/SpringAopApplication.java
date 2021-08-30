package net.online_class.spring;

import net.online_class.spring.aop.AnnotationAppConfig;
import net.online_class.spring.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopApplication {
    public static void main(String[] args) {
        // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 扫描指定的包，包括子包
        // context.scan("net.online_class");
        // 里面完成初始化操作，核心方法
        // context.refresh();

        // AOP扫描类,不再需要配置scan & refresh
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);

        VideoService videoService = (VideoService) context.getBean("videoService");
        videoService.findById(2);
    }
}
