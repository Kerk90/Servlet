/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet{
    @Override  
protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
    throws ServletException, IOException{
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>Hello user!</h1>");
        writer.write("<h2>Hello user!</h2>");
        writer.write("<h3>Hello user!</h3>");
    }    
}
