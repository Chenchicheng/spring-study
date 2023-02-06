import java.util.HashMap;
import java.util.Map;

/**
 * @author chenchicheng
 * @date 2023/2/6
 */
public class UserDao {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("10001", "chenchicheng");
        map.put("10002", "xieguijia");
        map.put("10003", "chenmuqing");
    }

    public String queryName(String uId) {
        return map.get(uId);
    }
}
