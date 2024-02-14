package com.workintech.s18d2.service;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;

public interface FruitService {
    Fruit save(Fruit fruit);

    List<Fruit> findAll();

    Fruit findById(Integer id);

    Fruit delete(Integer id);

    List<Fruit> searchByName(String name);

    Fruit update(Integer id, Fruit fruit);

}
