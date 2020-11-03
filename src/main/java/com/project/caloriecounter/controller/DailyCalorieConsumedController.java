package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.CalorieConsumedId;
import com.project.caloriecounter.model.DailyCalorieConsumed;
import com.project.caloriecounter.model.Person;
import com.project.caloriecounter.repository.DailyCalorieConsumedRepository;
import com.project.caloriecounter.service.DailyCalorieConsumedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("calorieConsumed")
public class DailyCalorieConsumedController {

    @Autowired
    private DailyCalorieConsumedService dailyCalorieConsumedService;

    @GetMapping
    public List<DailyCalorieConsumed> getAll(){ return dailyCalorieConsumedService.getAll(); }

    @GetMapping("person/{personId}")
    public List<DailyCalorieConsumed> getByPersonId(@PathVariable Long personId){
        return dailyCalorieConsumedService.getByPersonId(personId);
    }

    @GetMapping("personAndDate")
    public List<DailyCalorieConsumed> getByPersonIdAndDate(@RequestBody Map<String, Object> personAndDate){
        return dailyCalorieConsumedService.getByPersonIdAndDate(personAndDate);
    }
}
