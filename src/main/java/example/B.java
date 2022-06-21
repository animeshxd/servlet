package example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class B extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int a = (int) session.getAttribute("a");
        int b = (int) session.getAttribute("b");
        int c = (int) session.getAttribute("c");
        resp.getWriter().println("This is class B: ");
        resp.getWriter().printf("%d + %d= %d", a, b, c);


    }
    
}
