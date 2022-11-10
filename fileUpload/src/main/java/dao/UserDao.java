package dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * 连接数据库
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-10 11:37:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-10      zk           v1.0.0               新建
 **/
public class UserDao {
    //连接数据库，查询是否有该用户信息
    public User login(User user) {
        String sql = "select * from user where username=? and password=?";
        //创建连接池，获取连接池对象
        QueryRunner qr =  new QueryRunner(new ComboPooledDataSource());

        User loginUser=null;
        try {
            //通过查询，返回查询结果
            loginUser = qr.query(sql, new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(loginUser);
        return loginUser;
    }
}

