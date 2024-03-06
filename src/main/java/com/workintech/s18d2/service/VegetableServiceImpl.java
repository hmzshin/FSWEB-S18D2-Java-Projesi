package com.workintech.s18d2.service;

import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.repository.VegetableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableServiceImpl implements VegetableService {

    private final VegetableRepository vegetableRepository;

    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        vegetableRepository.save(vegetable);
        return vegetable;
    }

    @Override
    public List<Vegetable> findAll() {
        return vegetableRepository.findAll();
    }

}
