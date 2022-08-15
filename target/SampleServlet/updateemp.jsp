<%--
  Created by IntelliJ IDEA.
  User: seif
  Date: 26/06/2022
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="emp" scope="request" class="Models.Employee"></jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Formulaire employee</h2>
<br>
<form method="post" action="./manageemployee">

    <div>
        <label> Identifiant</label>
        <input type="text" id="cin" name="cin"
               value="<jsp:getProperty name="emp" property="cin"/>" readonly>
    </div>

    <div>
        <label> Nom</label>
        <input type="text" id="nom" name="nom"
               value="<jsp:getProperty name="emp" property="nom"/>">
    </div>

    <div>
        <label> Prenom</label>
        <input type="text" id="prenom" name="prenom"
               value="<jsp:getProperty name="emp" property="prenom"/>">
    </div>

    <input type="submit" value="Submit">

</form>

</body>
</html>
