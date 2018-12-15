package core;

import core.service.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * https://habr.com/post/222579/
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    private CoreService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    public void setService(CoreService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        service.print();
    }

    /**
     * Плюсы спринга
     * 1. Легковесность
     * 2. IOC - DI
     * 3. AOP
     * 4. Множество готовых классов
     *
     * Spring CORE:
     * 1. Beans
     * 2. Core
     * 3. Context
     * 4. SpEL - Spring Expression Language
     *
     * Этапы поднятия контекста
     *
     * BeanFactory
     * ApplicationContext
     *
     * 1. Определяется тип контекста:
     * xml, java config, annotation config ...
     *
     * 2. Сканирование наших пакетов на
     * предмет наличия бинов(Component, Service ... etc)
     *
     * 3. Создаётся мэпка где в качестве ключа
     * у вас имя бина, а в качестве значения BeanDefinition
     *
     * 4. Происходит настройка бинов.
     * Этим занимается BeanFactory
     *
     * 5. Создаётся мэпка состоящая из бинов,
     *  где в качестве ключа у вас имя бина,
     *  а в качестве значения бин.
     *
     *
     *
     *
     */

}