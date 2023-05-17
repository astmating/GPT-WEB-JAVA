package com.chat.java.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chat.java.model.User;
import com.chat.java.model.res.UserInfoRes;
import com.chat.java.model.res.AdminHomeRes;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户表(User)表数据库访问层
 *
 * @author  
 * @since 2022-03-12 14:35:54
 */
public interface UserDao extends BaseMapper<User> {

    UserInfoRes getUserInfo(@Param("userId") Long userId);

    AdminHomeRes adminHome();

    User findUser(String mobile);
}
