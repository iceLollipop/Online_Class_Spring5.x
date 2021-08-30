package net.online_class.spring;

import net.online_class.spring.domain.Video;
import net.online_class.spring.domain.VideoExtend;
import net.online_class.spring.domain.VideoOrder;
import net.online_class.spring.service.VideoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Video video = (Video)applicationContext.getBean("video");
        // System.out.println(video.getTitle());

        // VideoOrder videoOrder = (VideoOrder)applicationContext.getBean("videoOrder");
        // System.out.println(videoOrder.toString());

        // 测试Bean的scope
        // testScope(applicationContext);

        // 测试Bean的scope
        // testInject(applicationContext);

        // 测试Bean之间的依赖和继承
        // testExtend(applicationContext);

        // 测试Bean实例化的生命周期
        // testInitAndDestroy(applicationContext);
        // ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();

        // 测试全局处理器BeanPostProcessor
        // testInject(applicationContext);

        // 测试Bean自动注入
        // testInject(applicationContext);

        // 测试AOP
        testAop(applicationContext);
    }

    public static void testScope(ApplicationContext applicationContext){
        Video video1 = (Video)applicationContext.getBean("video");
        Video video2 = (Video)applicationContext.getBean("video");

        System.out.println(video1 == video2);
    }

    public static void testInject(ApplicationContext applicationContext){
        Video video = (Video)applicationContext.getBean("video");
        System.out.println(video.toString());
        System.out.println(video.getTitle());
        VideoOrder videoOrder = (VideoOrder)applicationContext.getBean("videoOrder");
        System.out.println(videoOrder.toString());
        System.out.println(videoOrder.getVideo().getTitle());
    }

    public static void testExtend(ApplicationContext applicationContext){
        Video video1 = (Video)applicationContext.getBean("video");
        VideoExtend videoExtend = (VideoExtend)applicationContext.getBean("videoExtend");

        System.out.println(video1.toString());
        System.out.println(videoExtend.toString());
    }

    public static void testInitAndDestroy(ApplicationContext applicationContext){
        Video video = (Video)applicationContext.getBean("video");
        System.out.println(video.toString());
    }

    private static  void testAop(ApplicationContext applicationContext){
        VideoService  videoService = (VideoService)applicationContext.getBean("videoService");
        videoService.save(new Video());
        videoService.findById(33);
    }
}
