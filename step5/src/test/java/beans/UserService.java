package beans;

/**
 * @author chenchicheng
 * @date 2023/2/5
 */
public class UserService {

    private String uId;
    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryName(uId);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
