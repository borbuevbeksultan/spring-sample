package kg.iceknight.config;

import kg.iceknight.service.Summator;
import kg.iceknight.service.impl.DefaultSummator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Summator getSummator() {
        return new DefaultSummator();
    }

}
