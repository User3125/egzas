package service;

import java.util.List;

import entity.Meal;

public interface MealService {
	
	List<Meal> getAll();
	
	void save(Meal meal);
	
	Meal getById(int id);
	
	void update(Meal meal);
	
	void delete(int id);

}
