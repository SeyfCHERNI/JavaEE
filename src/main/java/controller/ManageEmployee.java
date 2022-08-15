package controller;

import DAO.EmployeeDao;
import Models.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "ManageEmployee", value = "/manageemployee")
public class ManageEmployee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1234 , "Seyf", "cherni"));
        employees.add(new Employee(0256 , "ala", "aloui"));
        employees.add(new Employee(1122 , "brahim", "khaled"));*/

        EmployeeDao dao = new EmployeeDao();
        List<Employee>  employees = dao.findAll();

 request.setAttribute("employees", employees);
 RequestDispatcher rd = getServletContext().getRequestDispatcher("/Employees.jsp");
 rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     long cin = Long.parseLong(request.getParameter("cin"));
     String nom = (request.getParameter("nom"));
        String prenom = (request.getParameter("prenom"));

        Employee employee= new Employee();
        employee.setNom(nom);
        employee.setPrenom(prenom);
        employee.setCin(cin);

        //confirmer l'enregistrement//

       /* try (PrintWriter writer = response.getWriter()){
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<body>");
            writer.println("cin :" +employee.getCin());
            writer.println("nom :" +employee.getNom());
            writer.println("prenom: "+employee.getPrenom());
            writer.println("</body>");
            writer.println("</html>");
        }*/

       /* request.setAttribute("querytime",new Date().toString());
   RequestDispatcher rd = getServletContext().getRequestDispatcher("/Employee.jsp");
   rd.forward(request,response);*/

        EmployeeDao dao = new EmployeeDao();
        dao.save(employee);

        //redirection vers la liste//

response.sendRedirect("./manageemployee");

    }
}
