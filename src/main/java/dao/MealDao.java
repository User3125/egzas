package dao;

import java.util.List;

import entity.Meal;

public interface MealDao {

	List<Meal> getAll();
	
	void save(Meal meal);
	
	Meal getById(int id);
	
	void update(Meal meal);
	
	void delete(int id);
}
