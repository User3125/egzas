<#import "templates/spring.ftl" as spring/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Naujo patiekalo kurimas</title>
	</head>
	<body>
		<@spring.bind "meal"/>
		<#if noErrors??>
			Ivesti duomenys<br>
			Grupe: ${meal.group}<br>
			Pavadinimas: ${meal.title}<br>
			Kalorijos: ${meal.calories}<br>
			Kaina: ${meal.price}<p>
			<a href="/egzas/menu">Atgal</a>
		<#else>
			<form name="newmeal" action="/egzas/createMeal" method="post">
				Grupe:<br>
				<@spring.formInput "meal.group"/>
				<@spring.showErrors "<br>"/><p>
				Pavadinimas:<br>
				<@spring.formInput "meal.title"/>
				<@spring.showErrors "<br>"/><p>
				Kalorijos:<br>
				<@spring.formInput "meal.calories"/>
				<@spring.showErrors "<br>"/><p>
				Kaina:<br>
				<@spring.formInput "meal.price"/>
				<@spring.showErrors "<br>"/><p>
				<input type="submit" value="Prideti">
			</form>
		</#if>
		<br>
	</body>
</html>