package com.project.caloriecounter.repository;

import com.project.caloriecounter.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
