package cn.bdqn.kbms.dao;

import cn.bdqn.kbms.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @PackageName:cn.bdqn.kbms.dao
 * @ClassName:UserMapper
 * @Description:
 * @author:木子羽
 * @date:2020/6/29 19:15
 */
@Mapper
public interface UserMapper {
    public User checkLoginUser(@Param("userName") String userName, @Param("password")String password);
}
