package com.project.caloriecounter.service;

import com.project.caloriecounter.model.Food;
import com.project.caloriecounter.repository.FoodRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService{

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public List<Food> getAll(){return foodRepository.findAll(); }

    @Override
    public Food getById(Long id){
        return foodRepository.getOne(id);
    }

    @Override
    public Food create(Food food){
        return foodRepository.save(food);
    }

    @Override
    public Food update(Food food){
        Food oldFood = foodRepository.getOne(food.getId());
        BeanUtils.copyProperties(food, oldFood, "id");
        return foodRepository.saveAndFlush(oldFood);
    }

    @Override
    public void deleteById(Long id){
        foodRepository.deleteById(id);
    }
}
