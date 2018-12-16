package core.qualifier;

import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {

    @Override
    public void print() {
        System.out.println("IMPL 1");
    }

}