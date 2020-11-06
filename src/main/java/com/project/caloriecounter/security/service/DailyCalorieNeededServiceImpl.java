package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.DailyCalorieNeeded;
import com.project.caloriecounter.repository.DailyCalorieNeededRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyCalorieNeededServiceImpl implements DailyCalorieNeededService {

    @Autowired
    private DailyCalorieNeededRepository dailyCalorieNeededRepository;

    @Override
    public List<DailyCalorieNeeded> getAll(){
        return dailyCalorieNeededRepository.findAll();
    }

    @Override
    public DailyCalorieNeeded getByPersonId(Long personId){
        return dailyCalorieNeededRepository.getOne(personId);
    }
}
