package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableRepository {

    Vegetable save(Vegetable vegetable);

    List<Vegetable> findAll();
}
