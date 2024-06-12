package sexy.criss.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sexy.criss.spring.models.Island2;
import sexy.criss.spring.models.Wood3;

@Configuration
@ComponentScan(basePackages = "sexy.criss.spring")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
}