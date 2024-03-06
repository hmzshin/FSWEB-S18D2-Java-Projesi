package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.service.VegetableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/vegetables")
public class VegetableController {

    private final VegetableService vegetableService;

    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping
    public List<Vegetable> findAll() {
        return vegetableService.findAll();
    }

    @PostMapping
    public Vegetable save(@PathVariable Vegetable vegetable) {
        vegetableService.save(vegetable);

        return vegetable;
    }

}
