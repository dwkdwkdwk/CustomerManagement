package dao;

import domain.User;

import java.util.List;
import java.util.Map;

/**
 * 管理员登录的DAO
 */
public interface UserDao {

    User findUserByUsernameAndPassword(String username, String password);

}
