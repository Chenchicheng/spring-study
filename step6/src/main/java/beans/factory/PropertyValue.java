package beans.factory;

/**
 * @author chenchicheng
 * @date 2023/2/6
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }
}
