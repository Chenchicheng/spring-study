import org.junit.Test;

/**
 * @author chenchicheng
 * @date 2023/2/4
 */
public class ApiTest {

    @Test
    public void test_getBean() {
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
