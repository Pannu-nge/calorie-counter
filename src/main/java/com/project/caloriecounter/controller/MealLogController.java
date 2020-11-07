package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.MealLog;
import com.project.caloriecounter.security.service.MealLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("mealLog")
public class MealLogController {

    @Autowired
    private MealLogService mealLogService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<MealLog> getAll(){return mealLogService.getAll();}

    @GetMapping("{id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public MealLog getById(@PathVariable Long id){
        return mealLogService.getById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public MealLog create(@RequestBody MealLog mealLog){
        return mealLogService.create(mealLog);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @PreAuthorize("hasRole('USER')")
    public MealLog update(@RequestBody MealLog mealLog){
        return mealLogService.update(mealLog);
    }

    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    @PreAuthorize("hasRole('USER')")
    public void deleteById(@PathVariable Long id){
        mealLogService.deleteById(id);
    }

    @GetMapping("person/{personId}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<MealLog> getByPersonId(@PathVariable Long personId){
        return mealLogService.getByPersonId(personId);
    }

    @GetMapping("personAndDate")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<MealLog> getByPersonIdAndDate(@RequestBody Map<String, Object> personAndDate){
        return mealLogService.getByPersonIdAndDate(personAndDate);
    }
}
