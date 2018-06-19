<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Meniu</title>
	</head>
	<body class="container">
		<div class="table-responsive">
			<caption>Patiekalu sarasas</caption>
			<table class="table table-triped">
				<tr>
					<th>Id</th>
					<th>Grupe</th>
					<th>Pavadinimas</th>
					<th>Kalorijos</th>
					<th>Kaina</th>
					<th>Redaguoti</th>
				</tr>
				<#list meals as meal>
					<tr>
						<td><a href="/egzas/meal/${meal.id}">${meal.id}</a></td>
						<td>${meal.group}</td>
						<td>${meal.title}</td>
						<td>${meal.calories}</td>
						<td>${meal.price}</td>
						<td><a href="/egzas/delete/${meal.id}">Trinti</a></td>
						<td><a href="/egzas/update/${meal.id}">Redaguoti</a></td>
					</tr>
				</#list>
			</table>
		</div>
		<br>
		<a href="/egzas/createMeal">Kurti nauja</a>
	</body>
</html>