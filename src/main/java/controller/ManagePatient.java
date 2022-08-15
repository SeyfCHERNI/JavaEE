package controller;

import DAO.PatientDao;
import Models.Patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ManagePatient", value = "/managepatient")
public class ManagePatient extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //chargement des données//
        PatientDao dao= new PatientDao();
        List<Patient> patientList = dao.findAll();

        //redirection vers la BD//
        request.setAttribute("patients", patientList);
        RequestDispatcher rd= getServletContext().getRequestDispatcher("/patients.jsp");
        rd.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
