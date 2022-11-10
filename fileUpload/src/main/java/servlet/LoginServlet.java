package servlet;

import dao.User;
import dao.UserDao;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录功能、连接数据库查询用户
 * 缺少了 一个jar包
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-10 11:51:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-10      zk           v1.0.0               新建
 **/
public class LoginServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
        //页面传递过来的用户信息
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //封装User对象
        User user = new User(username,password);
        //创建JDBC类的对象
        UserDao userDao = new UserDao();
        //调用查询方法
        User loginUser = userDao.login(user);
        //判断是否有该用户
        if(loginUser != null) {
            response.sendRedirect("success.html");
            System.out.println("登录成功");
        }else {
            response.sendRedirect("login.html");
            System.out.println("登录失败");
        }

    }
}

