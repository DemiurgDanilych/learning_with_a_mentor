package springcore.springcore3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AutowiringApp {

    @Bean
    public Battery getBattery() {
        return new Battery("Duracell");
    }

//    @Bean
//    public String model() {
//        return "Energizer";
//    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AutowiringApp.class);
        Radio radio = ctx.getBean(Radio.class);
        radio.getBatteryInfo();

        Phone phone = ctx.getBean(Phone.class);
        phone.getBatteryInfo();

    }
}
