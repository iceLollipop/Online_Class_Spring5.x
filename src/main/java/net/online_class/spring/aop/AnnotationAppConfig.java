package net.online_class.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("net.online_class")
@EnableAspectJAutoProxy  //开启了spring对aspect的支持
public class AnnotationAppConfig {

}
