
package com.servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>Welcome</h2>");
        String name=req.getParameter("first_name");
        String name1=req.getParameter("last_name");
        String name2=req.getParameter("user_email");
        String name3=req.getParameter("user_password");
        String name4=req.getParameter("user_age");
        String name5=req.getParameter("gender");
        
        String cond=req.getParameter("user_agree");
        
        if(cond!=null){
            if(cond=="checked"){
                System.out.println("First Name: "+name);
                out.println("Last Name: "+name1);
                out.println(name2);
                out.println(name3);
                out.println(name4);
                out.println(name5);
            
        
          
        }
        }
        else{
            out.println("Please Check the Box");
        
        }
    }
}
    
