package beans.factory;

import beans.exception.BeansException;

/**
 * @author chenchicheng
 * @date 2023/2/4
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
