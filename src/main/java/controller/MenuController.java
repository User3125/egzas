package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Meal;
import service.MealService;

@Controller
@RequestMapping("/")
public class MenuController {
	
	@Autowired
	public MealService mealService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/menu")
	public String getAllMeals(Model model) {
		model.addAttribute("meals", mealService.getAll());
		return "menu";	
	}
	
	@GetMapping("/meal/{id}")
	public String getById(@PathVariable("id") int id, Model model) {
		model.addAttribute("meal", mealService.getById(id));
		return "showMeal";	
	}
	
	@PostMapping("/createMeal")
	public String addMeal(@Valid Meal meal, BindingResult bindingResult, Model model) {
		if (!bindingResult.hasErrors()) {
			model.addAttribute("noErrors", true);
			mealService.save(meal);
		}
		return "createMeal";
	}
	
	@GetMapping("/createMeal")
	public String createMealPage(Model model) {
		model.addAttribute("meal", new Meal());
		return "createMeal";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		model.addAttribute("meal", mealService.getById(id));
		return "editMeal";
	}
	
	@PostMapping("/updateMeal")
	public String updateMeal(@ModelAttribute("meal") Meal meal) {
		mealService.update(meal);
		return "redirect:/meal/" + meal.getId();
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		mealService.delete(id);
		return "redirect:/menu";
	}
}
