package beans.context;

import beans.exception.BeansException;

/**
 * @author chenchicheng
 * @date 2023/2/7
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
