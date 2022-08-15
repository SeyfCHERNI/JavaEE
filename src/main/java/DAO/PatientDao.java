package DAO;

import Models.Patient;

import java.util.List;

public class PatientDao extends ConnectDB{

    public void save(Patient patient) {

        //JPQL : java persistance query language //
        //HQL: hibernate query language//
        //SQL//

        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit();
    }

    public Patient get(long id) {
        em.getTransaction().begin();
        Patient patient = em.find(Patient.class, id);
        em.getTransaction().commit();
        return patient;
    }

    public void update(Patient patient){
        em.getTransaction().begin();
        em.merge(patient);
        em.getTransaction().commit();
    }

    public void delete (long id){

        Patient patient= get(id);

        if(patient != null){
            em.getTransaction().begin();
            em.remove(patient);
            em.getTransaction().commit();
        }

    }

    public List<Patient> findAll(){
        return em.createQuery("select p from Patient p").getResultList();
    }
}
