package core;

import core.qualifier.Main;
import core.qualifier.Service;
import core.service.CoreService;
import core.service.ScopeTester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * https://habr.com/post/222579/
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    private CoreService service;

    private ScopeTester scopeTester;

    private Main main;

        @Bean
    public Service serviceImpl3() {
        return new Service() {
            @Override
            public void print() {
                System.out.println("IMPL 3");
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        service.print();
//
//        scopeTester.print();
//
//        main.test();
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
     * Этапы поднятия контекста на основе аннотаций
     * и сканирования
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
     * Этим занимается BeanFactory.
     * PS: касается синглтонов
     * в случае с PROTOTYPE инициализация происходит во
     * время вызова
     *
     * 5. Создаётся мэпка состоящая из бинов,
     *  где в качестве ключа у вас имя бина,
     *  а в качестве значения бин.
     *
     * 6. Контекст поднялся
     *
     * -------
     * Все бины синглтоны по умолчанию
     * Существую бин скоупы(bean scopes)
     *
     *
     *
     */


    @Autowired
    public void setScopeTester(ScopeTester scopeTester) {
        this.scopeTester = scopeTester;
    }

    @Autowired
    public void setMain(Main main) {
        this.main = main;
    }

    @Autowired
    public void setService(CoreService service) {
        this.service = service;
    }
}