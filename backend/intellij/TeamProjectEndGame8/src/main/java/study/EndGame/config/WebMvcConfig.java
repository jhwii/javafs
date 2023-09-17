package study.EndGame.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//    private String resourcePath = "file:///D:/TeamProjectEndGame8/car/upload";
//    private String savePath = "file:///D:/TeamProjectEndGame8/src/main/resources/static/img";
//
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler(resourcePath)
//                .addResourceLocations(savePath);
//    }
//}
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Value("{uploadPath}")
    String uploadPath;

    //    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/images/item/");
//
//
//    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/item/**")
                .addResourceLocations("file:///D:/endcar2/item/");
    }
}