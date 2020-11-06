package com.project.caloriecounter.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.TimeZone;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MealLog implements Serializable{

    public enum MealType{
        BREAKFAST, LUNCH, DINNER, SNACK
    }
    /*@Id
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Person person;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "person_id", nullable = false)
    private Long personId;
    private LocalDate dateOfMeal;
    private LocalTime timeOfMeal;
    @Enumerated(EnumType.STRING)
    private MealType mealType;
    private Long quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id", nullable = false)
    private Food food;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateOfMeal() {
        return dateOfMeal;
    }

    public void setDateOfMeal(LocalDate dateOfMeal) {
        this.dateOfMeal = dateOfMeal;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public LocalTime getTimeOfMeal() {
        return timeOfMeal;
    }

    public void setTimeOfMeal(LocalTime timeOfMeal) {
        this.timeOfMeal = timeOfMeal;
    }
}
