package beans.factory.support;

import beans.factory.config.BeanDefinition;

/**
 * @author chenchicheng
 * @date 2023/2/5
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
