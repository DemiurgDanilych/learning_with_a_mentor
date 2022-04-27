package springcore.springcore3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    @Autowired
    private Battery battery;

    public void getBatteryInfo(){
        System.out.println(battery.getModel());
    }

}
