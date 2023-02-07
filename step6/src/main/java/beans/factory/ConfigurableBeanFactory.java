package beans.factory;

import beans.factory.config.BeanPostProcessor;
import beans.factory.config.SingletonBeanRegistry;

/**
 * @author chenchicheng
 * @date 2023/2/7
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
