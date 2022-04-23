package springcore.springcore1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SpringCoreProgram3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringCoreProgram3.class);

        Car car = ctx.getBean(Car.class);
        car.setName("test");
        System.out.println();
    }
}
