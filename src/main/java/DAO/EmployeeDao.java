package DAO;

import Models.Employee;

import java.util.List;

public class EmployeeDao extends ConnectDB {

    public void save(Employee employee) {
        em.getTransaction().begin();
        em.persist(employee); // persist ----> insert into
        em.getTransaction().commit();


        }
        public List <Employee> findAll () {
            return em.createQuery("select  e from  Employee e ").getResultList();
    }
}
