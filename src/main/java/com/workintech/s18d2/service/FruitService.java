package com.workintech.s18d2.service;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;

public interface FruitService {
    Fruit save(Fruit fruit);

    List<Fruit> findAll();

    Fruit findById(Long id);

    List<Fruit> findByPriceAsc();

    Fruit delete(Long id);

    List<Fruit> searchByName(String name);

    Fruit update(Long id, Fruit fruit);

}
