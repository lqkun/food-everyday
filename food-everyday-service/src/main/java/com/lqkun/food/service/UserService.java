package com.lqkun.food.service;

import com.lqkun.food.pojo.bo.UserBO;
import com.lqkun.food.pojo.Users;

/**
 * @className: com.lqkun.food-> UserService
 * @description:
 * @author: LQKun
 * @date: 2022-03-27 0:44
 * @version: 1.0
 */
public interface UserService {

    /**
     * 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(String username);

    /**
     * 注冊用戶
     */
    public Users createUser(UserBO userBO);

    /**
     * 检索用户名和密码是否匹配，用于登录
     */
    public Users queryUserForLogin(String username, String password);

}
