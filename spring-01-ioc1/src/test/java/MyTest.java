import com.easy.zlx.dao.UserDaoImpl;
import com.easy.zlx.dao.UserDaoMysqlImpl;
import com.easy.zlx.service.UserService;
import com.easy.zlx.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
//        //用户实际调用的是业务层
//        UserService userService = new UserServiceImpl();
//
//        /*
//        IOC
//        调用主动权在用户
//        获得依赖对象的方式反转了
//        * */
////        UserServiceImpl userService1 = new UserServiceImpl();
////        userService1.setUserDao1(new UserDaoMysqlImpl());
//        ((UserServiceImpl) userService).setUserDao1(new UserDaoMysqlImpl());
//
//        userService.getUser();

        //获取ApplicationContext,拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //拿到容器，需要什么，get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
