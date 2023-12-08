package lk.ijse.gdse66.hello.api.servletlifecycle;

import javax.servlet.http.HttpServlet;

public class Hello extends HttpServlet {
    static {
        System.out.println("Hello class is loaded");
    }

    public void Servlet(){
        System.out.println("Servlet()");
    }

    @Override
    public void init() {
        System.out.println("init()");
    }

    @Override
    public void destroy(){
        System.out.println("Hello object is destroyed");
    }
}
