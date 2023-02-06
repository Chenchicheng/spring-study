import beans.factory.config.BeanDefinition;
import beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author chenchicheng
 * @date 2023/2/5
 */
public class ApiTest {

    @Test
    public void test_getBean() {
        // 1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.获取Bean
        UserService userService = (UserService)beanFactory.getBean("userService", "chenchicheng");
        userService.queryUserInfo();
    }

}
