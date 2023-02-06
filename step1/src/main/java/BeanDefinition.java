/**
 * @author chenchicheng
 * @date 2023/2/4
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object object) {
        this.bean = object;
    }

    public Object getBean() {
        return bean;
    }
}
