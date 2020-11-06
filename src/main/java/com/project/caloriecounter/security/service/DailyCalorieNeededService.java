package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.DailyCalorieNeeded;

import java.util.List;

public interface DailyCalorieNeededService {
    List<DailyCalorieNeeded> getAll();
    DailyCalorieNeeded getByPersonId(Long personId);
}
