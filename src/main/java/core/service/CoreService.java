package core.service;

import org.springframework.stereotype.Service;

@Service
public class CoreService {

    private final PrototypeBean prototypeBean;

    private final SingletonBean singletonBean;

    public CoreService(PrototypeBean prototypeBean, SingletonBean singletonBean) {
        this.prototypeBean = prototypeBean;
        this.singletonBean = singletonBean;
    }

    public void print() {
        prototypeBean.setMessage("prototype");
        singletonBean.setMessage("singleton");

        System.out.println(prototypeBean.getMessage());
        System.out.println(singletonBean.getMessage());
    }

}