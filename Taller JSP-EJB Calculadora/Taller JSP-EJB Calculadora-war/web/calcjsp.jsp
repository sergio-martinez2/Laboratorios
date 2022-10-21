<%-- 
    Document   : calcjsp
    Created on : Oct 21, 2022, 1:26:34 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Calculadora | U Piloto Metodos Formales</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estilos.css">
    </head>
    <body>
        <h1>Ingresa los numeros de la operacion a realizar</h1>
        <div class= "formstyle"> 
        <form action="calcservlet" name="form1" method="POST">
            
            <input id = "calc" type ="text" name = "answer"> <br> <br>
            <input type="button" value="1" onClick="form1.answer.value += '1' ">
            <input type="button" value="2" onClick="form1.answer.value += '2' ">
            <input type="button" value="3" onClick="form1.answer.value += '3' ">
            <input type="button" value="+" onclick="form1.answer.value += '+' "> <br>
            <input type="button" value="4" onClick="form1.answer.value += '4' ">
            <input type="button" value="5" onClick="form1.answer.value += '5' ">
            <input type="button" value="6" onClick="form1.answer.value += '6' ">
            <input type="button" value="-" onclick="form1.answer.value += '-' "> <br>
            <input type="button" value="7" onClick="form1.answer.value += '7' ">
            <input type="button" value="8" onClick="form1.answer.value += '8' ">
            <input type="button" value="9" onClick="form1.answer.value += '9' ">
            <input type="button" value="*" onclick="form1.answer.value += '*' "> 
            <input type="button" value="0" onClick="form1.answer.value += '0' ">
            
            <input type="button" value="=" onclick="form1.answer.value = eval(form1.answer.value) ">  <br>    
            <input type="button" value="C" onclick="form1.answer.value = ' ' " id= "clear" >  
  <br>
            
        </form>  
</div> 
        
    </body>
</html>
