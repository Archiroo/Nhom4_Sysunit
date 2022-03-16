package GreenBackend;

import com.greentrade.common.utils.LoggingUtil;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    private static Logger logger = LoggingUtil.createLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    @Bean
    public WebMvcConfigurer corsConfiguer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/apitest").allowedOrigins("*");
            }
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
