package mapper;

/**
 * Created by wei62_000 on 2017/6/22.
 */
public class UserSQLProvider {

    public String getSelectSql(String name){
        return new StringBuilder()
                .append("SELECT userid, username, password ")
                .append("FROM users ")
                .append("WHERE username LIKE '%").append(name).append("%'")
                .append("   OR password LIKE '%").append(name).append("%'")
                .toString();
    }
}
