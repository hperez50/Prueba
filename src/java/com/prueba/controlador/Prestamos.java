/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.controlador;

import com.prueba.dao.SociosDao;
import com.prueba.modelo.Creditos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author heibe
 */
@WebServlet(name = "Prestamos", urlPatterns = {"/Prestamos"})
public class Prestamos extends HttpServlet {
    
    @EJB
    private SociosDao sociosDao;

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
        
        String action = request.getParameter("action");
        Creditos creditos = null;
        
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int n=36;
        int id;
        
//      String y="Juan";
//	String y1="Andres";
//	String y2="Maria";
	int m1=5000000,m2=7500000,m3=3000000;
	double x1=0.015,x2=0.02,x3=0.012;
	int vf1=0,vf2=0,vf3=0;
	int cuota_mensual;
		
	 //System.out.println("Ingrese el valor del monto");
	 int monto = scanner.nextInt();
         
        if("calcular".equalsIgnoreCase(action)){
           // request.setAttribute("todoslosSocios", sociosDao.getAllCreditos());
            //id=creditos.getId();
            // while(monto!=0) {
			 	 
		 if(monto<=m1 && x1<x2 && x1>x3) {
			 vf1 = (int) (monto*(1+n*x1));
			 //System.out.println(vf1);
			 
			
			 if(monto<=m2 && x2>x1 && x2>x3) {
				 vf2 = (int) (monto*(1+n*x2));
				 //System.out.println(vf2);
			 						 
			 	}
			 
			 	if(monto<=m3 && x3<x1 && x3<x2) {
				 vf3 = (int) (monto*(1+n*x3));
				 //System.out.println(vf3);
			
                                        }
//                                if(monto>m1 &&monto>m2 &&monto>m3){
//                                    System.out.println("No hay socio disponible");
//                                            
//                                }        
			 	 			 	
			 	 if(vf1<vf2) {
					 //System.out.println("Socio del prestamo Juan");
					 System.out.println(vf1);	
					 //System.out.println("La cuota mensual del credito es "+ vf1/n);
				 }
					 if(vf2<vf3) {
						// System.out.println("Socio del prestamo Andres");
						 System.out.println(vf2);
						 //System.out.println("La cuota mensual del credito es "+ vf2/n);
					 }
						 if(vf3<vf2) {
							// System.out.println("Socio del prestamo María");
							 System.out.println(vf3);
							 //System.out.println("La cuota mensual del credito es "+ vf3/n);
						 }
		 }
		 
//		 vf1 = (int) (monto*(1+n*x1));
//		 vf2 = (int) (monto*(1+n*x2));
//		 vf3 = (int) (monto*(1+n*x3));
		
		 
//        if(x1<x2 && x1<x3){
//        	        	
//            System.out.println("La tasa de"
//            		+ " interes menor es: "+x1);
//            System.out.println("El socio es el siguiente: "+y);
//            pago = (int) (monto*(1+n*x1));
//            System.out.println(pago);
//            cuota_mensual = pago/n;
//            System.out.println(cuota_mensual);
//            
//                  
//        }if(x2<x1 && x2<x3){
//        	System.out.println("La tasa de interes menor es: "+x2);
//        	System.out.println("El socio es el siguiente: "+y1);
//        	pago = (int) (monto*(1+n*x2));
//        	System.out.println(pago);
//            cuota_mensual = pago/n;
//            System.out.println(cuota_mensual);
//        }if(x3<x2 && x3<x1){
//        	System.out.println("La tasa de interes menor es: "+x3);
//        	System.out.println("El socio es el siguiente: "+y2);
//        	pago = (int) (monto*(1+n*x3));
//        	System.out.println(pago);
//            cuota_mensual = pago/n;
//            System.out.println(cuota_mensual);
//        }
            
            
            
        }
        
        
        
        
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
