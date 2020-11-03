package com.project.caloriecounter.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DailyCalorieConsumed implements Serializable {

    @EmbeddedId
    private CalorieConsumedId id;

    private Long totalCalories;

    public DailyCalorieConsumed(){}

    public CalorieConsumedId getId() {
        return id;
    }

    public void setId(CalorieConsumedId id) {
        this.id = id;
    }

    public Long getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(Long totalCalories) {
        this.totalCalories = totalCalories;
    }

}
