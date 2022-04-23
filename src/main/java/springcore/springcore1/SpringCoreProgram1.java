package springcore.springcore1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreProgram1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        SpringComputer springComputer = ctx.getBean(SpringComputer.class);
        System.out.println(springComputer.getModel());
    }
}
