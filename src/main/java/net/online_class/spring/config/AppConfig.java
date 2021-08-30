package net.online_class.spring.config;

import net.online_class.spring.domain.VideoOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@Configuration标注在类上，相当于把该类作为spring的xml配置文件中的，作用为：配置spring容器(应用上下文)
public class AppConfig {
    // 使用@Bean注解，表明这个bean交个spring 进行管理
    // @Bean注解：用于告诉方法产生一个Bean对象，然后这个Bean对象交给Spring管理，Spring将会将这个Bean对象放在自己的IOC容器中
    // 注意点:SpringIOC容器管理一个或者多个bean，这些bean都需要在@Configuration注解下进行创建
    // 如果没有指定名称，默认采用 方法名 + 第一个字母小写 作为bean的名称
    @Bean(name = "videoOrder")  //initMethod = "init",destroyMethod = "destroy"
//    @Scope
    public VideoOrder videoOrder(){
        return new VideoOrder();
    }
}
