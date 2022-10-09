/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipiloto.edu.controller;

import com.unipiloto.edu.Student;
import com.unipiloto.edu.dao.StudentDaoLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergio
 */
@WebServlet(name = "StudentServerlet", urlPatterns = {"/StudentServerlet"})
public class StudentServerlet extends HttpServlet {
    @EJB
    private StudentDaoLocal studentDao;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action =request.getParameter("action");
        String studentIdStr = request.getParameter("studentId");
        int studentId=0;
        if(studentIdStr!=null && !studentIdStr.equals(""))
            studentId=Integer.parseInt(studentIdStr); 
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String yearLevelStr = request.getParameter("yearLevel");
        int yearLevel = 0; 
        if(yearLevelStr!=null && !yearLevelStr.equals(""))
            yearLevel=Integer.parseInt(yearLevelStr);
        Student student = new Student(studentId,firstname,lastname,yearLevel);
       
        
        if("Add".equalsIgnoreCase(action)){
            studentDao.addStudent(student);
        }else if ("Edit".equalsIgnoreCase(action)){
            studentDao.editStudent(student);
        }else if ("Delete".equalsIgnoreCase(action)){
            studentDao.deleteStudent(studentId);
        }else if ("Search".equalsIgnoreCase(action)){
            student = studentDao.getStudent(studentId);
        }
        request.setAttribute("student", student);
        request.setAttribute("allStudent", studentDao.getAllStudents());
        request.getRequestDispatcher("studentinfo.jsp").forward(request, response);
    
    
    }}
        