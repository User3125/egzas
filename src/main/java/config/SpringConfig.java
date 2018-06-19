package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.MealDao;
import dao.MealDaoImpl;
import service.MealService;
import service.MealServiceImpl;

@Configuration
public class SpringConfig {

	@Bean JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/db5");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}
	
	@Bean MealDao getMealDao() {
		return new MealDaoImpl(getJdbcTemplate());
	}

	@Bean
	public MealService getMealService() {
		return new MealServiceImpl();
	}
}
