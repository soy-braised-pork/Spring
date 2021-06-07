import com.zlx.config.MyConfig;
import com.zlx.config.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //如果完全使用了配置类方式，只能通过AnnotationConfigApplicationContext来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//       User getUser= (User) context.getBean("getUser");
        User getUser = (User) context.getBean("user");
        System.out.println(getUser.getAge());
        System.out.println(getUser.getName());
    }
}
