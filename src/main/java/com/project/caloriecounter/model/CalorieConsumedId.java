package com.project.caloriecounter.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Embeddable
public class CalorieConsumedId implements Serializable {

    private Long personId;
    private LocalDate dateOfMeal;

    public CalorieConsumedId(){}

    /*public CalorieConsumedId(Long personId){
        this.personId = personId;
    }*/

    public CalorieConsumedId(Long personId, LocalDate dateOfMeal){
        this.personId = personId;
        this.dateOfMeal = dateOfMeal;
    }

    public Long getPersonId() {
        return personId;
    }

    public LocalDate getDateOfMeal() {
        return dateOfMeal;
    }
}
