package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Meal;

public class MealMapper implements RowMapper<Meal> {

	//@Override
	public Meal mapRow(ResultSet rs, int arg1) throws SQLException {
		Meal meal = new Meal();
		meal.setId(rs.getInt("id"));
		meal.setGroup(rs.getString("gruppe"));
		meal.setTitle(rs.getString("title"));
		meal.setCalories(rs.getInt("calories"));
		meal.setPrice(rs.getDouble("price"));
		return meal;
	}

}
