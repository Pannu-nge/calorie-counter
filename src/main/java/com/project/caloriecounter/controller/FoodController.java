package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.Food;
import com.project.caloriecounter.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> getAll(){
        return foodService.getAll();
    }

    @GetMapping("{id}")
    public Food getById(@PathVariable Long id){
        return foodService.getById(id);
    }

    @PostMapping
    public Food create(@RequestBody Food food){
        return foodService.create(food);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Food update(@RequestBody Food food){
        return foodService.update(food);
    }

    @RequestMapping(path = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        foodService.deleteById(id);
    }

}
