package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.service.FruitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping
    public Fruit save(@RequestBody Fruit fruit) {
        fruitService.save(fruit);
        return fruit;
    }

    @GetMapping
    public List<Fruit> findAll() {
        return fruitService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Fruit findById(@PathVariable Long id) {
        return fruitService.findById(id);
    }

    @GetMapping(path = "/priceasc")
    public List<Fruit> getByPrice() {
        return fruitService.findByPriceAsc();
    }

    @DeleteMapping(path = "/{id}")
    public Fruit deleteById(@PathVariable Long id) {
        return fruitService.delete(id);
    }

    @PutMapping(path = "/{id}")
    public Fruit updateById(@PathVariable Long id, @RequestBody Fruit fruit) {
        return fruitService.update(id, fruit);
    }

}
