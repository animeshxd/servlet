package example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class A extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a = Integer.parseInt(req.getParameter("x"));
        int b = Integer.parseInt(req.getParameter("y"));
        int c = a + b;
        HttpSession session = req.getSession();
        session.setAttribute("a", a);
        session.setAttribute("b", b);
        session.setAttribute("c", c);
        resp.sendRedirect("b");
    }
    
}
