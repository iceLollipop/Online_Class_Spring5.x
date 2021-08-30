package net.online_class.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("ProcessBeforeInitialization Before Init"+beanName);
        return bean;
        // return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("ProcessBeforeInitialization After Init"+beanName);
        return bean;
        // return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
