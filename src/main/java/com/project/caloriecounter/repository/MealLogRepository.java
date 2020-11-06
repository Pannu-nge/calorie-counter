package com.project.caloriecounter.repository;

import com.project.caloriecounter.model.DailyCalorieConsumed;
import com.project.caloriecounter.model.MealLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MealLogRepository extends JpaRepository<MealLog, Long> {

    public List<MealLog> findByPersonId(Long personId);

    public List<MealLog> findByPersonIdAndDateOfMeal(Long personId, LocalDate dateOfMeal);
}
