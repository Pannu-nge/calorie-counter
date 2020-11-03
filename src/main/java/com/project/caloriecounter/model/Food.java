package com.project.caloriecounter.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long caloriesPerServing;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.REMOVE,
            fetch = FetchType.LAZY,
            mappedBy = "food")
    private Set<MealLog> mealLogs = new HashSet<MealLog>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public void setCaloriesPerServing(Long caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }

    public Set<MealLog> getMealLogs() {
        return mealLogs;
    }

    public void setMealLogs(Set<MealLog> mealLogs) {
        this.mealLogs = mealLogs;
    }
}
