package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 网页重定向
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-10 15:04:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-10      zk           v1.0.0               新建
 **/
@WebServlet("/PageRedirect")
public class PageRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //要重定向到的新位置
        String site = new String("http://www.runoob.com");

        resp.setStatus(resp.SC_MOVED_PERMANENTLY);
        resp.setHeader("Location",site);
    }
}
