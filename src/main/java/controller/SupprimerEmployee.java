package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SupprimerEmployee", value = "/SupprimerEmployee")
public class SupprimerEmployee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long idemp = Long.parseLong(request.getParameter("idemp"));
        response.getWriter().println("Suppression de l'employee ID:" +idemp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
