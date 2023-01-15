package top.sharehome.javaee.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.sharehome.javaee.interceptor.LoginInterceptor;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/4 20:34
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/index").addPathPatterns("/").addPathPatterns("/to/**").excludePathPatterns("/to/login/page");
    }
}
