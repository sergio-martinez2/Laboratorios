<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : response
    Created on : 17/09/2022, 01:42:17 PM
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LABORATORIO JSP | U Piloto Metodos Formales</title>
        <link rel="stylesheet" href="estilos.css">
    </head>
    <body>

        <jsp:useBean id="myBean" scope="session" class="co.unipiloto.NameHandler" />
        <jsp:useBean id="clock" scope="session" class="co.unipiloto.NameHandler" />

        <jsp:setProperty name="myBean" property="nombre"/>
        <jsp:setProperty name="myBean" property="fechaNacimiento"/>
        <jsp:setProperty name="myBean" property="edadStr" value="{<%=myBean%>}"/>
        <jsp:setProperty name="clock" property="tiempoahora"/>
        <div class="text-center">
        <h1>**************************************************</h1> 
        <h1>*___________________Bienvenid@ <jsp:getProperty name="myBean" property="nombre"/>___________________*</h1> 
        <h1>**************************************************</h1>
          
            <br> 
            <c:choose>
                <c:when test="${clock.tiempoahora<=12 && clock.tiempoahora>=1}">  
                    <h2>Buenos Dias</h2>
                </c:when>
                <c:when test="${clock.tiempoahora>=19 && clock.tiempoahora<=23}"> 
                    <h2>Buenas noches</h2>
                </c:when>
                <c:otherwise>
                    <h2>Buenas tardes</h2>
                </c:otherwise>
            </c:choose>
                   
                     <br>
               <h2>A continuacion Mostraremos algunos datos de tu interes</h2>     
            Tu nombre es: <jsp:getProperty name="myBean" property="nombre"/>
           
            
             <br> Tu fecha de nacimiento es:<jsp:getProperty name="myBean" property="fechaNacimiento"/>
             <br> Tu edad es: <jsp:getProperty name="myBean" property="edadStr"/>
           
        </div>
    </body>
</html>
