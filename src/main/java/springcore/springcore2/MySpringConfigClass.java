package springcore.springcore2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfigClass {

    @Bean
    public Horse getHorse() {
        return new Horse();
    }

}
