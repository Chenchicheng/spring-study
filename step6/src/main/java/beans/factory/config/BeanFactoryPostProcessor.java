package beans.factory.config;

import beans.exception.BeansException;
import beans.factory.ConfigurableListableBeanFactory;

/**
 * @author chenchicheng
 * @date 2023/2/7
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的BeanDefinition加载完成后，实例化Bean对象前，提供修改BeanDefinition属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
