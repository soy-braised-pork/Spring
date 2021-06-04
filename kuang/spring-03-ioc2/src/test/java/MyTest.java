import com.zlx.easy.User;
import com.zlx.easy.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        //在配置文件初始化时，对象就已经创建了
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml","applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");
        User user2= (User) context.getBean("abc");
        user.show();
        //spring容器，取的是同一个对象  单例模式
        System.out.println(user==user1);
        System.out.println(user.equals(user1));
        System.out.println(user2.getName());  //别名

        UserT userT=new UserT();
        System.out.println(userT.getName());
        System.out.println(userT);

    }
}
