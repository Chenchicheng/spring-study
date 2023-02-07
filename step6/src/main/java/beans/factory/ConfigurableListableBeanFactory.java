package beans.factory;

import beans.exception.BeansException;
import beans.factory.config.BeanDefinition;
import beans.factory.config.BeanPostProcessor;

/**
 * @author chenchicheng
 * @date 2023/2/7
 */
public interface ConfigurableListableBeanFactory extends ConfigurableBeanFactory, AutowireCapableBeanFactory, ListAbleBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
