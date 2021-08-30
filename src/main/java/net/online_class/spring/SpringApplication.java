package net.online_class.spring;

import net.online_class.spring.domain.Video;
import net.online_class.spring.domain.VideoOrder;
import net.online_class.spring.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 扫描指定的包，包括子包
        context.scan("net.online_class");
        // 里面完成初始化操作，核心方法
        context.refresh();

        // 通过注解或者XML 获取到Bean对象
        // VideoService videoService = (VideoService) context.getBean("videoService");
        // videoService.findById(2);

        // 通过注解或者XML 获取Bean对象 并验证init-method
        // Video video = (Video) context.getBean("video");
        // video.init();

        // 通过注解或者XML 获取Bean对象 并验证Scope属性
        // Video video1 = (Video) context.getBean("video");
        // Video video2 = (Video) context.getBean("video");
        // System.out.println(video1 == video2);

        // 通过Configuration&Bean注解 获取Bean对象
        // VideoOrder videoOrder = (VideoOrder) context.getBean("videoOrder");
        // System.out.println(videoOrder.toString());

        // Configuration PropertySource Value 从配置文件中加载Bean对象
        VideoService videoService = (VideoService) context.getBean("videoService");
        videoService.findById(2);
    }
}
