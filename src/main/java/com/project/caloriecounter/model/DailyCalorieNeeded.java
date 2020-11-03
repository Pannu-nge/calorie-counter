package com.project.caloriecounter.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DailyCalorieNeeded implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", updatable = false, nullable = false)
    private Long personId;
    private Long dailyCalorieNeed;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getDailyCalorieNeed() {
        return dailyCalorieNeed;
    }

    public void setDailyCalorieNeed(Long dailyCalorieNeed) {
        this.dailyCalorieNeed = dailyCalorieNeed;
    }
}
