/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.servlet;

import com.DB.DBConnect;
import com.entity.ItemDetails;
import comDAO.ItemDAOImpl;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author User
 */
@WebServlet("/addnew")
@MultipartConfig
public class AddItems extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String item_name = req.getParameter("iname");
            String price = req.getParameter("iprice");
            String size = req.getParameter("isize");
            String category = req.getParameter("icategory");
            Part part = req.getPart("iphoto");
            String fileName = part.getSubmittedFileName();
            
            ItemDetails i = new ItemDetails(item_name,fileName,size, category, price);
            
            ItemDAOImpl dao = new ItemDAOImpl(DBConnect.getConn());
            
            
            boolean f = dao.addItems(i);
            
            HttpSession session = req.getSession();
            
            if(f){
                
                String path = getServletContext().getRealPath("") + "items";
            
                File file = new File(path);
            
                part.write(path + File.separator + fileName);
                
                session.setAttribute("succMsg", "Item add successfully");
                resp.sendRedirect("addnew.jsp");
            } 
            else {
               session.setAttribute("failedMsg", "Something wrong on server");
               resp.sendRedirect("addnew.jsp"); 
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
