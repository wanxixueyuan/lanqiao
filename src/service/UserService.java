package service;

import domain.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wei62_000 on 2017/6/23.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //查询用户是否存在
    public User selectUser(String name ,String password){
        return userMapper.selectUser(name,password);
    }
}
