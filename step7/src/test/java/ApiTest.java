import beans.MyBeanFactoryPostProcessor;
import beans.MyBeanPostProcessor;
import beans.UserService;
import beans.context.support.ClassPathXmlApplicationContext;
import beans.factory.support.DefaultListableBeanFactory;
import beans.factory.xml.XmlBeanDefinitionReader;
import core.io.DefaultResourceLoader;
import org.junit.Before;
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
        // 2.读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // 3. BeanDefinition 加载完成 & Bean 实例化之前，修改 BeanDefinition 的属性值
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        // 4. Bean 实例化之后，修改 Bean 属性信息
        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        // 3.获取Bean对象调用方法
        UserService userService = (UserService) beanFactory.getBean("userService", UserService.class);
        String s = userService.queryUserInfo();
        System.out.println(s);
    }

    @Test
    public void test_context() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        // 3.获取Bean对象调用方法
        UserService userService = (UserService) context.getBean("userService", UserService.class);
        String s = userService.queryUserInfo();
        System.out.println(s);
    }

}
