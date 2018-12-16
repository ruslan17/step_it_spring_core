package core.qualifier;

import org.springframework.stereotype.Component;

@Component("service-impl-2")
public class ServiceImpl2 implements Service {

    @Override
    public void print() {
        System.out.println("IMPL 2");
    }

}