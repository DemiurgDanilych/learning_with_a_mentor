package springcore.springcore1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class SpringCoreProgram2 {

    /*
    NoSuchBeanDefinitionException
    NoUniqueBeanDefinitionException
     */

    @Bean
    public Processor getProcessor() {
        return new Processor("Intel i9");
    }

//    @Bean
//    public Processor getSecondProcessor() {
//        return new Processor("AMD Ryzen");
//    }

    @Bean
    public SpringComputer getComputer(Processor processor) {
        return new SpringComputer("Lenovo Yoga", processor);
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringCoreProgram2.class);

        SpringComputer computer = ctx.getBean(SpringComputer.class);
        System.out.println(computer.getModel());
    }
}
