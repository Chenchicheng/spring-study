/**
 * @author chenchicheng
 * @date 2023/2/5
 */
public class UserService {

    private String uId;
    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息:" + userDao.queryName(uId));
    }

}
