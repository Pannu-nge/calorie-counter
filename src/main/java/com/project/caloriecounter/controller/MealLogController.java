package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.Account;
import com.project.caloriecounter.model.Food;
import com.project.caloriecounter.model.MealLog;
import com.project.caloriecounter.service.MealLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("mealLog")
public class MealLogController {

    @Autowired
    private MealLogService mealLogService;

    @GetMapping
    public List<MealLog> getAll(){return mealLogService.getAll();}

    @GetMapping("{id}")
    public MealLog getById(@PathVariable Long id){
        return mealLogService.getById(id);
    }

    @PostMapping
    public MealLog create(@RequestBody MealLog mealLog){
        return mealLogService.create(mealLog);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public MealLog update(@RequestBody MealLog mealLog){
        return mealLogService.update(mealLog);
    }

    @RequestMapping(path = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        mealLogService.deleteById(id);
    }

    @GetMapping("person/{personId}")
    public List<MealLog> getByPersonId(@PathVariable Long personId){
        return mealLogService.getByPersonId(personId);
    }
}
