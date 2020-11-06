package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.DailyCalorieConsumed;

import java.util.List;
import java.util.Map;

public interface DailyCalorieConsumedService {
    List<DailyCalorieConsumed> getAll();
    List<DailyCalorieConsumed> getByPersonId(Long personId);
    DailyCalorieConsumed getByPersonIdAndDate(Map<String, Object> personAndDate);
}
