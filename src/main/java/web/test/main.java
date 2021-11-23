package web.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.model.User;
import web.service.UserService;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = context.getBean(UserService.class);
        service.save(new User("Ivan", "ivan@mail.ru", 21));
        context.close();
    }
}
