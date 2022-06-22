package example;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "B", 
    urlPatterns = "/b",
    initParams = @WebInitParam(name = "data", value = "This data is only available for class B")
)
public class B extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig context = getServletConfig();
        String data = context.getInitParameter("data");
        resp.getWriter().println(data);
        resp.getWriter().println("This is class B");
    }
    
}
