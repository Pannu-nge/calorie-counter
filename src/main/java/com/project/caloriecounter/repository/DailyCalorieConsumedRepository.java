package com.project.caloriecounter.repository;

import com.project.caloriecounter.model.CalorieConsumedId;
import com.project.caloriecounter.model.DailyCalorieConsumed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface DailyCalorieConsumedRepository extends JpaRepository<DailyCalorieConsumed, CalorieConsumedId> {

    //public List<DailyCalorieConsumed> findByPersonId(Long personId);

    //@Query(value = "select * from daily_calorie_consumed where person_id = :personId", nativeQuery = true)
    //public List<DailyCalorieConsumed> findByPersonId(@Param("personId") Long personId);

    public List<DailyCalorieConsumed> findAllByIdPersonIdAndIdDateOfMeal(Long personId, LocalDate dateOfMeal);

    public List<DailyCalorieConsumed> findAllByIdPersonId(Long personId);
}
