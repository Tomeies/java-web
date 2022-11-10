package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 点击计数器
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-10 15:14:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-10      zk           v1.0.0               新建
 **/
public class PageHitCounter extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private int hitCount;

    @Override
    public void init() throws ServletException {
        hitCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        //增加hit次数
        hitCount++;
        PrintWriter out = resp.getWriter();
        String title = "统计点击次数";
        String docType =  "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align=\"center\">" + hitCount + "</h2>\n" +
                "</body></html>");
    }
}
