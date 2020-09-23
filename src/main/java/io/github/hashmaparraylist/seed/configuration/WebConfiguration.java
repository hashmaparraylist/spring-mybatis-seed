package io.github.hashmaparraylist.seed.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web 相关配置
 *
 * @author Sebastian Qu
 * @date 2020/9/23
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    /**
     * 配置 Web 跨域设置
     * @param registry CORS registration
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*");
    }
}
