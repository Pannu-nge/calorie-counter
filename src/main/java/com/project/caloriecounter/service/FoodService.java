package com.project.caloriecounter.service;

import com.project.caloriecounter.model.Food;

import java.util.List;

public interface FoodService {
    List<Food> getAll();
    Food getById(Long id);
    Food create(Food food);
    Food update(Food food);
    void deleteById(Long id);
}
