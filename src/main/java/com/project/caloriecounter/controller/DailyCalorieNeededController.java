package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.DailyCalorieConsumed;
import com.project.caloriecounter.model.DailyCalorieNeeded;
import com.project.caloriecounter.repository.DailyCalorieNeededRepository;
import com.project.caloriecounter.service.DailyCalorieNeededService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("calorieNeeded")
public class DailyCalorieNeededController {

    @Autowired
    private DailyCalorieNeededService dailyCalorieNeededService;

    @GetMapping
    public List<DailyCalorieNeeded> getAll(){ return dailyCalorieNeededService.getAll(); }

    @GetMapping("{personId}")
    public DailyCalorieNeeded getByPersonId(@PathVariable Long personId){
        return dailyCalorieNeededService.getByPersonId(personId);
    }
}
