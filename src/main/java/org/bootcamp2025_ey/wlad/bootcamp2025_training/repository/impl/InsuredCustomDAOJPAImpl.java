package org.bootcamp2025_ey.wlad.bootcamp2025_training.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.model.Insured;
import org.bootcamp2025_ey.wlad.bootcamp2025_training.repository.InsuredCustomDAOJPA;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class InsuredCustomDAOJPAImpl implements InsuredCustomDAOJPA {

    private static final String FIND_INSURED_FOR_CITY = "SELECT ins from Insured ins "
            + " where ins.customerAddress.city = :city ";

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public InsuredCustomDAOJPAImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public List<Insured> findInsuredsForCity(String city) {
        entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery(FIND_INSURED_FOR_CITY, Insured.class);
        query.setParameter("city", city);
        EntityTransaction transaction = entityManager.getTransaction();
        List insureds = Collections.emptyList();

        try {
            transaction.begin();
            insureds = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println(e.getMessage());
        }
        return insureds;
    }
}
