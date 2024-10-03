package com.example.ss13b1.controller;

import com.example.ss13b1.service.IClassesService;
import com.example.ss13b1.service.impl.ClassesServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/classes")
public class ClassesController extends HttpServlet {
    IClassesService classesService=new ClassesServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String action=req.getParameter("action");
      action=action==null?"":action;
      switch (action){
          case "add":
          {
              break;
          }
          default:
              req.setAttribute("classes",classesService.fillAll());
              req.getRequestDispatcher("/WEB-INF/views/classes/classes.jsp").forward(req,resp);
      }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
