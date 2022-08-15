<%--
  Created by IntelliJ IDEA.
  User: seif
  Date: 02/07/2022
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Models.Patient" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>


<main role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <div class="container">

            <h2 align="center"> Liste des patients</h2>
            <br>
            <table class="table table-dark">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nom</th>
                    <th scope="col">Prénom</th>
                    <th scope="col">Adresse</th>
                    <th scope="col">Téléphone</th>
                    <th scope="col"> Action</th>
                    <th scope="col"> </th>
                </tr>
                </thead>
                <tbody>

                <%
                    List<Patient> patientList = (List<Patient>) request.getAttribute("patients");

                    for(Patient p:patientList){
                %>
                <tr>
                    <td> <%=p.getId()%> </td>
                    <td> <%=p.getNom()%> </td>
                    <td> <%=p.getPrenom()%> </td>
                    <td> <%=p.getEmail()%> </td>
                    <td> <%=p.getTelephone()%> </td>
                    <td>
                        <a href="./supprimerpatient?pid=<%=p.getId()%>">Supprimer</a>
                    </td>

                    <td>
                        <a href="./modifierpatient?pid=<%=p.getId()%>">Modifier</a>
                    </td>

                </tr>
                <%
                    }
                %>

                </tbody>
            </table>

        </div>
    </div>
</main>

<!-- partie js -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>
