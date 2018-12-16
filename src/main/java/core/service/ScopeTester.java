package core.service;

import org.springframework.stereotype.Component;

@Component
public class ScopeTester {

    private final PrototypeBean prototypeBean;

    private final SingletonBean singletonBean;

    public ScopeTester(PrototypeBean prototypeBean, SingletonBean singletonBean) {
        this.prototypeBean = prototypeBean;
        this.singletonBean = singletonBean;
    }

    public void print() {
        System.out.println(prototypeBean.getMessage());
        System.out.println(singletonBean.getMessage());
    }

}