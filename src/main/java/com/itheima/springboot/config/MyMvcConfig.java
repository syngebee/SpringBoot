package com.itheima.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//扩展mvc功能,实现WebMvcConfigurer类 加上Configuration类
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //由原先的写配置文件声明,变为重写方法

    //声明地区分析器,返回自己写的类
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }

    //声明拦截器,加入自己写的拦截器类
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerinterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/index.html","/user/login","/","/js/**","/css/**","/img/**");
    }

    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("main.html").setViewName("dashboard");
    }
}
