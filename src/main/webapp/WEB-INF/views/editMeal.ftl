<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Esamo patiekalo redagavimas</title>
	</head>
	<body>
		<form name="meal" action="/egzas/updateMeal" method="post">
			<input placeholder="Id" type="text" name="id" value="${meal.id}" readonly><p>
			<input placeholder="Grupe" type="text" name="group" value="${meal.group}"><p>
			<input placeholder="Pavadinimas" type="text" name="title" value="${meal.title}"><p>
			<input placeholder="Kalorijos" type="text" name="calories" value="${meal.calories}"><p>
			<input placeholder="Kaina" type="text" name="price" value="${meal.price}"><p>
			<input type="submit" value="Redaguoti">
		</form>
		<br>
		<a href="/egzas/menu">Atgal</a>
	</body>
</html>