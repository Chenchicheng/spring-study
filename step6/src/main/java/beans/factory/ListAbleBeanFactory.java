package beans.factory;

import beans.exception.BeansException;

import java.util.Map;

/**
 * @author chenchicheng
 * @date 2023/2/7
 */
public interface ListAbleBeanFactory extends BeanFactory {

    /**
     * 按照类型返回Bean实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;


    /**
     * 返回注册表中所有的Bean名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
