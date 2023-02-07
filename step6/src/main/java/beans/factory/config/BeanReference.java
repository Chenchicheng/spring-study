package beans.factory.config;

/**
 * @author chenchicheng
 * @date 2023/2/6
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
