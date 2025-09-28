package com.example.lab6;

import com.example.lab6.dao.CustomerBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class TestBai1
//        extends HttpServlet
{

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("./bean.xml");

        System.out.println("=== Constructor Injection ===");
        CustomerBusiness cb1 = (CustomerBusiness) context.getBean("customerBusinessConstructorMySQL");
        cb1.getCustomer();

        System.out.println("=== Setter Injection ===");
        CustomerBusiness cb2 = (CustomerBusiness) context.getBean("customerBusinessSetter");
        cb2.getCustomer();
    }
//    private String message;
//
//    public void init() {
//        message = "Hello World!";
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }
//
//    public void destroy() {
//    }
}