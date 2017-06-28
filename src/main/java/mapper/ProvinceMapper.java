package mapper;

import domain.Province;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * Created by wei62_000 on 2017/6/22.
 */
public interface ProvinceMapper {

    //根据身份id查询省份
    @SelectProvider(type = UserSQLProvider.class ,method = "getSelectSql")
    Province selectById(Integer id);
}
