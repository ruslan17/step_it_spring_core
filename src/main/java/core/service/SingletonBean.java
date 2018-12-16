package core.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}