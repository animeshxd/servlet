package example;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class A extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a = Integer.parseInt(req.getParameter("x"));
        int b = Integer.parseInt(req.getParameter("y"));
        int c = a + b;
        ServletContext context = req.getServletContext();
        context.setAttribute("a", a);
        context.setAttribute("b", b);
        context.setAttribute("c", c);
        resp.sendRedirect("b");
    }
    
}
