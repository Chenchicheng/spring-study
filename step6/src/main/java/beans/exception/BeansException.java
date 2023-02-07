package beans.exception;

/**
 * @author chenchicheng
 * @date 2023/2/5
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Exception e) {
        super(message, e);
    }
}
