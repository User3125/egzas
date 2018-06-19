package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.MealDao;
import entity.Meal;

public class MealServiceImpl implements MealService {

	@Autowired
	public MealDao mealDao;
	
	//@Override
	public List<Meal> getAll() {
		return mealDao.getAll();
	}

	//@Override
	public void save(Meal meal) {
		mealDao.save(meal);
	}

	//@Override
	public Meal getById(int id) {
		return mealDao.getById(id);
	}

	//@Override
	public void update(Meal meal) {
		mealDao.update(meal);
	}

	//@Override
	public void delete(int id) {
		mealDao.delete(id);
	}

}
