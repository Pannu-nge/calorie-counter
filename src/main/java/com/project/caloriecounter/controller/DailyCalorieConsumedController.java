package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.DailyCalorieConsumed;
import com.project.caloriecounter.security.service.DailyCalorieConsumedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("calorieConsumed")
public class DailyCalorieConsumedController {

    @Autowired
    private DailyCalorieConsumedService dailyCalorieConsumedService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<DailyCalorieConsumed> getAll(){ return dailyCalorieConsumedService.getAll(); }

    @GetMapping("person/{personId}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<DailyCalorieConsumed> getByPersonId(@PathVariable Long personId){
        return dailyCalorieConsumedService.getByPersonId(personId);
    }

    @GetMapping("personAndDate")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public DailyCalorieConsumed getByPersonIdAndDate(@RequestBody Map<String, Object> personAndDate){
        return dailyCalorieConsumedService.getByPersonIdAndDate(personAndDate);
    }
}
