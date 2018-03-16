<%-- 
    Document   : cotizacion
    Created on : 16/03/2018, 09:47:59 AM
    Author     : heibe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compañia de Financiamiento</title>
    </head>
    <body>
    <from action="./Prestamos" method="POST">
        <h1>Compañia de Financiamiento</h1>
        
        <table>
            <tr>
                <td>Monto:</td>
                <td><input type="text" name="monto" />
            </tr>
            
            <tr>
                <td>
                    <input type="submit" name="action" value="calcular"/>
                </td>
                
            </tr>
            
        </table>
        
        
        
       </from> 
    </body>
</html>
