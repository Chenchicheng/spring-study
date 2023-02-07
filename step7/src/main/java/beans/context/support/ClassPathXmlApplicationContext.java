package beans.context.support;

import beans.exception.BeansException;

/**
 * @author chenchicheng
 * @date 2023/2/7
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {

    private final String[] configLocations;

    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        refresh();
    }

    public ClassPathXmlApplicationContext(String configLocations) throws BeansException {
        this(new String[]{configLocations});
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
