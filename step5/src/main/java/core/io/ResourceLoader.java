package core.io;

/**
 * @author chenchicheng
 * @date 2023/2/6
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
