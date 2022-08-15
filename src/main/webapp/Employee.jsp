<%--
  Created by IntelliJ IDEA.
  User: seif
  Date: 26/06/2022
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2> Formulaire Employee</h2>

<br>
Query Time : <%=request.getAttribute("querytime")%>
<br>

<h2> Details de l'employee</h2>

Cin : <%=request.getParameter("cin")%>

<br>
Nom : <%=request.getParameter("nom")%>
<br>
Prenom: <%=request.getParameter("prenom")%>
<br>

</body>
</html>
