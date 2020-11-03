package com.project.caloriecounter.service;

import com.project.caloriecounter.model.MealLog;
import com.project.caloriecounter.repository.MealLogRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealLogServiceImpl implements MealLogService{

    @Autowired
    private MealLogRepository mealLogRepository;

    @Override
    public List<MealLog> getAll(){
        return mealLogRepository.findAll();
    }

    @Override
    public MealLog getById(Long id){
        return mealLogRepository.getOne(id);
    }

    @Override
    public MealLog create(MealLog mealLog){
        return mealLogRepository.save(mealLog);
    }

    @Override
    public MealLog update(MealLog mealLog){
        MealLog oldMealLog = mealLogRepository.getOne(mealLog.getId());
        BeanUtils.copyProperties(mealLog, oldMealLog, "id");
        return mealLogRepository.saveAndFlush(oldMealLog);
    }

    @Override
    public void deleteById(Long id){
        mealLogRepository.deleteById(id);
    }

    @Override
    public List<MealLog> getByPersonId(Long personId){
        return mealLogRepository.findByPersonId(personId);
    }
}
