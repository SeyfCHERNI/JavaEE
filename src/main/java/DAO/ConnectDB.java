package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectDB {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public ConnectDB() {
        this.emf= Persistence.createEntityManagerFactory("testjpa");
        this.em= emf.createEntityManager();
    }
}
