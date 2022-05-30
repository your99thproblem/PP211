import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo  = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());
        Cat catOne = (Cat) applicationContext.getBean("cat");
        Cat catTwo = (Cat) applicationContext.getBean("cat");
        boolean compateHW = bean == beanTwo;
        System.out.println(compateHW);
        boolean compareCats = catOne == catTwo;
        System.out.println(compareCats);


    }
}