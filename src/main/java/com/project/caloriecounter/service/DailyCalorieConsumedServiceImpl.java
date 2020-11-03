package com.project.caloriecounter.service;

import com.project.caloriecounter.model.CalorieConsumedId;
import com.project.caloriecounter.model.DailyCalorieConsumed;
import com.project.caloriecounter.repository.DailyCalorieConsumedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DailyCalorieConsumedServiceImpl implements DailyCalorieConsumedService{

    @Autowired
    private DailyCalorieConsumedRepository dailyCalorieConsumedRepository;

    @Override
    public List<DailyCalorieConsumed> getAll(){
        return dailyCalorieConsumedRepository.findAll();
    }

    @Override
    public List<DailyCalorieConsumed> getByPersonId(Long personId){
        //CalorieConsumedId id = new CalorieConsumedId(personId);
        //return dailyCalorieConsumedRepository.findByPersonId(id.getPersonId());
        return dailyCalorieConsumedRepository.findAllByIdPersonId(personId);
    }

    @Override
    public List<DailyCalorieConsumed> getByPersonIdAndDate(Map<String, Object> personAndDate){
        Long personId = Long.parseLong(personAndDate.get("personId").toString());
        LocalDate dateOfMeal = LocalDate.parse(personAndDate.get("dateOfMeal").toString());
        return dailyCalorieConsumedRepository.findAllByIdPersonIdAndIdDateOfMeal(personId, dateOfMeal);
    }
}
