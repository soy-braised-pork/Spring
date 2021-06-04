import com.zlx.easy.Student;
import com.zlx.easy.User;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }


    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        User user1 = (User) context.getBean("user1");
        // singleton 单例模式  有并发问题，适合单线程  spring默认
        // prototype 原型模式  每次从容器中get的时候，都会产生一个新对象
        // 缺：浪费资源     适合多线程
        System.out.println(user==user1);
        System.out.println(user.hashCode()+"  "+user1.hashCode());
        System.out.println(user);
        System.out.println(user1);
    }
}
