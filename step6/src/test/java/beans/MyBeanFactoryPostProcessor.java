package beans;

import beans.exception.BeansException;
import beans.factory.ConfigurableListableBeanFactory;
import beans.factory.PropertyValue;
import beans.factory.PropertyValues;
import beans.factory.config.BeanDefinition;
import beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author chenchicheng
 * @date 2023/2/7
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为西山居"));
    }
}
