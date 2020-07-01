package cn.bdqn.kbms.service.impl;

import cn.bdqn.kbms.dao.UserMapper;
import cn.bdqn.kbms.pojo.User;
import cn.bdqn.kbms.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @PackageName:cn.bdqn.kbms.service.impl
 * @ClassName:UserServiceImpl
 * @Description:
 * @author:木子羽
 * @date:2020/6/29 19:19
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper uMapper;

    public UserMapper getuMapper() {
        return uMapper;
    }

    public void setuMapper(UserMapper uMapper) {
        this.uMapper = uMapper;
    }

    @Override
    public User login(String userName, String password) {

        return uMapper.checkLoginUser(userName, password);
    }
}
