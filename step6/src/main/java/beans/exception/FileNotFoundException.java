package beans.exception;

/**
 * @author chenchicheng
 * @date 2023/2/6
 */
public class FileNotFoundException extends RuntimeException{

    public FileNotFoundException(String message) {
        super(message);
    }
}
