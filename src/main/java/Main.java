import org.example.springcorehw1.model.Home;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        Home home=context.getBean("home", Home.class);
        home.setId(1);
        System.out.println(home);
    }
}
