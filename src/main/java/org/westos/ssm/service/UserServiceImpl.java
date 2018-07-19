package org.westos.ssm.service;

import org.springframework.stereotype.Service;
import org.westos.ssm.dao.UserMapper;
import org.westos.ssm.model.User;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}