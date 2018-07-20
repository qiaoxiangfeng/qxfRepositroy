package com.readingClub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
	
	private static final String VIEW_PREFIX = "/";// 视图前缀
    private static final String VIEW_SUFFIX = ".html";// 视图后缀
    private static final String VIEW_CONTENT_TYPE = "text/html;charset=UTF-8";//视图的内容类型。

	/**
     * 配置 视图解析器
     * @return
     */
    @Bean
    public ViewResolver viewResolver(){

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setCache(true);
        resolver.setPrefix(VIEW_PREFIX);
        resolver.setSuffix(VIEW_SUFFIX);
        resolver.setExposeContextBeansAsAttributes(true);
        resolver.setContentType(VIEW_CONTENT_TYPE);
        return resolver;
    }

}
