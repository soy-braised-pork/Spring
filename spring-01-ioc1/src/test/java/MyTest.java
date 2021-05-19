import com.easy.zlx.dao.UserDaoImpl;
import com.easy.zlx.service.UserService;
import com.easy.zlx.service.UserServiceImpl;

public class MyTest {

    public static void main(String[] args) {
        //用户实际调用的是业务层
        UserService userService = new UserServiceImpl();

        userService.getUser();
    }
}
