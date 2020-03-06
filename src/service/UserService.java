package service;

import domain.User;

/**
 *用户管理的业务接口
 */
public interface UserService {
    /**
     * 登录方法
     */
    User login(User user);
}
