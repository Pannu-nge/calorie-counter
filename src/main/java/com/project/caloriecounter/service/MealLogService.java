package com.project.caloriecounter.service;

import com.project.caloriecounter.model.MealLog;

import java.util.List;

public interface MealLogService {
    List<MealLog> getAll();
    MealLog getById(Long id);
    MealLog create(MealLog mealLog);
    MealLog update(MealLog mealLog);
    void deleteById(Long id);
    List<MealLog> getByPersonId(Long personId);
}
