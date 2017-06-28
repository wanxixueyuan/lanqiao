package main;

import domain.City;
import domain.Province;
import mapper.ProvinceMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by wei62_000 on 2017/6/22.
 */
public class test {

    @Test
    public void select() throws Exception {
        Reader reader = Resources.getResourceAsReader("MyBatis.cfg.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
        SqlSession ss = ssf.openSession();

        ProvinceMapper pm = ss.getMapper(ProvinceMapper.class);
        Province p = pm.selectById(3);

        for(City c:p.getCities())
            System.out.println(c);

        Assert.assertNotNull(p);
        Assert.assertEquals(p.getCities().size(),3);
    }
}
