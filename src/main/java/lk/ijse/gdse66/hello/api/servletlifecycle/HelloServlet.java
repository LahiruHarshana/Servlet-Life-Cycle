package lk.ijse.gdse66.hello.api.servletlifecycle;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    static {
        System.out.println("HelloServlet class is loaded");
    }

    public void Servlet(){
        System.out.println("Servlet()");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init(ServletConfig)");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init()");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do Get");
    }

    @Override
    public void destroy(){
        System.out.println("HelloServlet object is destroyed");
    }
}