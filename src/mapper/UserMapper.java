package mapper;

import domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * Created by wei62_000 on 2017/6/23.
 */
public interface UserMapper {


    //查询用户是否存在
    @Select("SELECT user_name userName,user_pwd userPwd FROM users " +
            "WHERE user_name = #{param1} AND user_pwd = #{param2}")
    User selectUser(String name,String password);

    //插入用户
    @Insert("INSERT INTO users(user_name,user_pwd) VALUES(#{userName},#{userPwd})")
    int insertUser(User user);
}
