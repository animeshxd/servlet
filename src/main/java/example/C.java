package example;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/c", asyncSupported = true)
public class C extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final AsyncContext context = req.startAsync(req, resp);
        
        context.start( ()  -> {
            // Some Network Calls or Async IO operation
            HttpServletResponse respo= (HttpServletResponse) context.getResponse();
            try {
                respo.getWriter().println("This is async servlet");
            }catch (Exception e){}
            
            context.complete();
        } );
         
    }
    
    
}
