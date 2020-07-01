package cn.bdqn.kbms.service;

import cn.bdqn.kbms.pojo.User;

/**
 * @PackageName:cn.bdqn.kbms.service
 * @ClassName:UserService
 * @Description:
 * @author:木子羽
 * @date:2020/6/29 19:18
 */
public interface UserService {
    public User login(String userName, String password);
}
