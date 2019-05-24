<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   ResultSet libros = (ResultSet)request.getAttribute("datos");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body{
            
            background-image:url(https://forosdelavirgen.org/wp-content/uploads/2011/11/demonio.jpg) ;
            background-image: no-repeat; 
            background-attachment: fixed;
            background-position: center;
            
            
        }
          body h1 {

            color:whitesmoke;

        }
       

        
        body h3{

            color:darkblue ;

        }


        .contenedor{
            background-image:url(http://www.fondosni.com/images/2012-10-26/Tablas%20azules-191137.jpg) ;
            background-attachment: fixed;
            background-position:top;
            border: gold solid  ;
            border-radius: 15 px;
            color:whitesmoke;
        }
        .titulo{
            background-color: black;
        }
        
        
        
        
    </style>
    <body>
        
    <center><div>  
            <h1>Tabla de libros registrados:</h1>
        </div></center>
        <center><table width="50%" class="contenedor" border="1">
                <tr class="titulo">
                    
                    <td>Id</td>
                    <td>Titulo</td>
                    <td>Autor</td>
                    <td>Precio</td>
                </tr>
                
            <%
               while (libros.next()){ 
            %> 
            
                <tr>
                <td><%=libros.getInt("id")%></td>
                <td><%=libros.getString("titulo")%></td>
                 <td><%=libros.getString("autor")%></td>
                 <td><%=libros.getString("ISBN")%></td>
                <td><%=libros.getFloat("pvp")%>€</td>
             
            </tr>
            <a href="index.html">Volver</a>
          <% }%>
        </table></center>
    </body>
</html>
