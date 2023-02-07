import cn.hutool.core.io.IoUtil;
import core.io.DefaultResourceLoader;
import core.io.Resource;
import org.junit.Before;
import org.junit.Test;
import sun.nio.ch.IOUtil;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author chenchicheng
 * @date 2023/2/6
 */
public class ResourceTest {

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_classpath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:test.properties");
        InputStream inputStream = resource.getInputStream();
        String s = IoUtil.readUtf8(inputStream);
        System.out.println(s);
    }

    @Test
    public void test_file() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/resource/test.properties");
        InputStream inputStream = resource.getInputStream();
        String s = IoUtil.readUtf8(inputStream);
        System.out.println(s);
    }


}
