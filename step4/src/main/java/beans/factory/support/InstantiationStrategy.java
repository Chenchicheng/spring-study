package beans.factory.support;

import beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author chenchicheng
 * @date 2023/2/5
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args);
}
