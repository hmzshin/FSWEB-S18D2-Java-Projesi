package com.workintech.s18d2.service;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.exception.FruitException;
import com.workintech.s18d2.repository.FruitRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }

    @SuppressWarnings("null")
    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }

    @SuppressWarnings("null")
    @Override
    public Fruit findById(Integer id) {

        Optional<Fruit> fruitOpt = fruitRepository.findById(id);

        if (fruitOpt.isEmpty()) {
            throw new FruitException("There is no fruit with given id: " + id, HttpStatus.NOT_FOUND);
        }
        return fruitOpt.get();

    }

    @Override
    @SuppressWarnings("null")
    public Fruit delete(Integer id) {
        Fruit foundFruit = findById(id);
        fruitRepository.delete(foundFruit);
        return foundFruit;
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }

    @Override
    public Fruit update(Integer id, Fruit fruit) {
        fruitRepository.update(id, fruit);
        return findById(id);
    }

}
