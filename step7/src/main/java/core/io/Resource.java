package core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author chenchicheng
 * @date 2023/2/6
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
