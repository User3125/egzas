package entity;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

public class Meal {
	
	private int id;
	
	@Pattern(regexp="[A-Ža-ž0-9]{5,30}", message="Nuo 5 iki 30 simboliu!")
	private String group;
	
	@Pattern(regexp="[A-Ža-ž0-9]{5,30}", message="Nuo 5 iki 30 simboliu!")
	private String title;
	
	//@Pattern(regexp="[0-9]{1,4}", message="Tik skaičiai!")
	@Digits(fraction = 0, integer = 4, message = "Iki 4 skaitmenų")
	private int calories;
	
	//@Pattern(regexp="[0-9]{1,13}(\\.[0-9]*)?", message="Tik skaičiai!")
	@Digits(fraction = 2, integer = 4, message = "Iki 4 skaitmenų, plius ne daugiau 2 po kablelio")
	private double price;
	
	public Meal() {
		
	}

	public Meal(int id, String group, String title, int calories, double price) {
		super();
		this.id = id;
		this.group = group;
		this.title = title;
		this.calories = calories;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
