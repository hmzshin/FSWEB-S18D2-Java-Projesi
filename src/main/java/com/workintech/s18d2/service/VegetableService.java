package com.workintech.s18d2.service;

import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    Vegetable save(Vegetable vegetable);

    List<Vegetable> findAll();

}
