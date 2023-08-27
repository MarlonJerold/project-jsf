package com.myprojects.erp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import java.beans.BeanProperty;

public class aplication {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project", null);
        EntityManager em = emf.createEntityManager();

        em.close();
        emf.close();

    }
}
