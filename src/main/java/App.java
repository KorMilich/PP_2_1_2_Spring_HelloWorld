import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean2 =
                applicationContext.getBean("helloworld", HelloWorld.class);

        Cat bean3 = applicationContext.getBean("cat", Cat.class);
        Cat been4 = applicationContext.getBean("cat", Cat.class);
        bean3.sayMeow();
        been4.sayMeow();

        System.out.println(bean1 == bean2);
        System.out.println("-----");
        System.out.println(bean3 == been4);

        System.out.println(bean1.getMessage());
    }
}