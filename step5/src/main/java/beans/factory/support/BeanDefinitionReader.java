package beans.factory.support;

import cn.hutool.core.bean.BeanException;
import core.io.Resource;
import core.io.ResourceLoader;

/**
 *
 * @author chenchicheng
 * @date 2023/2/6
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeanException;

    void loadBeanDefinitions(Resource... resources) throws BeanException;

    void loadBeanDefinitions(String location) throws BeanException;
}
