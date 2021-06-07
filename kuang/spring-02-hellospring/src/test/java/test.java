import com.hellospring.zlx.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {

        //context 获取spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象现在都在Spring里管理，要使用，直接取出来
//        System.out.println(context.getBean("hello").toString());
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
