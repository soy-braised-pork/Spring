import com.zlx.easy.User;
import com.zlx.easy.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");
        user.show();
        //spring容器，取的是同一个对象  对象池
        System.out.println(user==user1);
        System.out.println(user.equals(user1));

        UserT userT=new UserT();
        System.out.println(userT.getName());
        System.out.println(userT);

    }
}
