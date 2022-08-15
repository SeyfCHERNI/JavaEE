<%@ page import="Models.Employee" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: seif
  Date: 26/06/2022
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Lits des employés</h2>

<br>
<table align="center" width="60%">
    <tr>
        <td> # </td>
        <td>Nom</td>
        <td>Prenom</td>
        <td> Action </td>
        <td>Update</td>
    </tr>

    <%
        List<Employee> employees = (List<Employee>) request.getAttribute("employees");
        for(Employee emp:employees){
    %>
    <tr>
        <td><%=emp.getCin()%></td>
        <td><%=emp.getNom()%></td>
        <td><%=emp.getPrenom()%></td>

        <td>

            <a href="./SupprimerEmployee?idemp=<%=emp.getCin()%>">Supprimer</a>

        </td>

        <td>

            <a href="./UpdateEmployee?idemp=<%=emp.getCin()%>">Update</a>

        </td>
    </tr>
    <%
        }
    %>

</table>

</body>
</html>
