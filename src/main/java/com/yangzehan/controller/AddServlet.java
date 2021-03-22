package com.yangzehan.controller;

import com.yangzehan.dao.userdao;
import com.yangzehan.service.userservice;
import com.yangzehan.user.user;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        user user = new user(username, password, email, sex, null);
        WebApplicationContext ctx = null;
        ServletContext sc = getServletContext();
        ctx=WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
        System.out.println("容器对象"+ctx);
  userservice dao= (userservice) ctx.getBean("userService");
        int num=dao.add(user);
        System.out.println(num);
        if (num!=0){
request.getRequestDispatcher("fanhui.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
