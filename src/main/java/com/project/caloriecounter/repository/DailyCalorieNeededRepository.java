package com.project.caloriecounter.repository;

import com.project.caloriecounter.model.DailyCalorieNeeded;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyCalorieNeededRepository extends JpaRepository<DailyCalorieNeeded, Long> {
}
