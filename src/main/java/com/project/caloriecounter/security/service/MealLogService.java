package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.DailyCalorieConsumed;
import com.project.caloriecounter.model.MealLog;

import java.util.List;
import java.util.Map;

public interface MealLogService {
    List<MealLog> getAll();
    MealLog getById(Long id);
    MealLog create(MealLog mealLog);
    MealLog update(MealLog mealLog);
    void deleteById(Long id);
    List<MealLog> getByPersonId(Long personId);
    List<MealLog> getByPersonIdAndDate(Map<String, Object> personAndDate);
}
