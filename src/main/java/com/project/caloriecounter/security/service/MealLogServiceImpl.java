package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.MealLog;
import com.project.caloriecounter.repository.MealLogRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

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

    @Override
    public List<MealLog> getByPersonIdAndDate(Map<String, Object> personAndDate){
        Long personId = Long.parseLong(personAndDate.get("personId").toString());
        LocalDate dateOfMeal = LocalDate.parse(personAndDate.get("dateOfMeal").toString());
        return mealLogRepository.findByPersonIdAndDateOfMeal(personId, dateOfMeal);
    }
}
