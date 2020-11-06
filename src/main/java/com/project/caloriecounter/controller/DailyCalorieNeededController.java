package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.DailyCalorieNeeded;
import com.project.caloriecounter.security.service.DailyCalorieNeededService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("calorieNeeded")
public class DailyCalorieNeededController {

    @Autowired
    private DailyCalorieNeededService dailyCalorieNeededService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<DailyCalorieNeeded> getAll(){ return dailyCalorieNeededService.getAll(); }

    @GetMapping("{personId}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public DailyCalorieNeeded getByPersonId(@PathVariable Long personId){
        return dailyCalorieNeededService.getByPersonId(personId);
    }
}
