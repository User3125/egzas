package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.Meal;
import mapper.MealMapper;

public class MealDaoImpl implements MealDao {
	
	public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MealDaoImpl (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//@Override
	public List<Meal> getAll() {
		String sql = "SELECT * FROM menu";
		return jdbcTemplate.query(sql, new MealMapper());
	}

	//@Override
	public void save(Meal meal) {
		String sql = "INSERT INTO menu (gruppe, title, calories, price) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, meal.getGroup(), meal.getTitle(), meal.getCalories(), meal.getPrice());
	}

	//@Override
	public Meal getById(int id) {
		String sql = "SELECT * FROM menu WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new MealMapper(), id);
	}

	//@Override
	public void update(Meal meal) {
		String sql = "UPDATE menu SET gruppe = ?, title = ?, calories = ?, price = ? WHERE id = ?";
		jdbcTemplate.update(sql, meal.getGroup(), meal.getTitle(), meal.getCalories(), meal.getPrice(), meal.getId());
	}

	//@Override
	public void delete(int id) {
		String sql = "DELETE FROM menu WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

}
