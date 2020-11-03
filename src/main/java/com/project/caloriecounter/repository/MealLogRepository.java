package com.project.caloriecounter.repository;

import com.project.caloriecounter.model.MealLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealLogRepository extends JpaRepository<MealLog, Long> {

    public List<MealLog> findByPersonId(Long personId);
}
