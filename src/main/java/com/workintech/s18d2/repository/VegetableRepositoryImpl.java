package com.workintech.s18d2.repository;


import com.workintech.s18d2.entity.Vegetable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class VegetableRepositoryImpl implements VegetableRepository {

    private EntityManager entityManager;

    @Autowired
    public VegetableRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public Vegetable save(Vegetable vegetable) {
        entityManager.persist(vegetable);
        return vegetable;
    }


    @Override
    public List<Vegetable> findAll() {
        TypedQuery<Vegetable> query = entityManager.createQuery("SELECT e FROM Vegetable e", Vegetable.class);

        return query.getResultList();
    }
}
