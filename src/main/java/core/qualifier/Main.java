package core.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Main {

    private final Service service;

    public Main(@Qualifier("serviceImpl") Service service) {
        this.service = service;
    }

    public void test() {
        service.print();
    }
}