package controller;

import Models.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdateEmployee", value = "/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long idemp = Long.parseLong(request.getParameter("idemp"));


        //récuperer l'objet//

        Employee employee= new Employee(idemp, "cherni", "Seyf");

        //injection des donnés//
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/updateemp.jsp");
        rd.forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
