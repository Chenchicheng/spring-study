package beans.factory.config;

/**
 * @author chenchicheng
 * @date 2023/2/4
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
