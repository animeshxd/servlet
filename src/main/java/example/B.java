package example;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class B extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        int a = (int) context.getAttribute("a");
        int b = (int) context.getAttribute("b");
        int c = (int) context.getAttribute("c");
        resp.getWriter().println("This is class B: using ServletContext");
        resp.getWriter().printf("%d + %d= %d", a, b, c);


    }
    
}
