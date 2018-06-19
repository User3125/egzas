<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Patiekalo info</title>
	</head>
	<body class="container">
		<div class="table-responsive">
			<caption>Patiekalo informacija</caption>
			<table class="table table-triped">
				<tr>
					<td><b>Id:</b></td>
					<td>${meal.id}</td>
				</tr>
				<tr>
					<td><b>Grupe:</b></td>
					<td>${meal.group}</td>
				</tr>
				<tr>
					<td><b>Pavadinimas:</b></td>
					<td>${meal.title}</td>
				</tr>
				<tr>
					<td><b>Kalorijos:</b></td>
					<td>${meal.calories}</td>
				</tr>
				<tr>
					<td><b>Kaina:</b></td>
					<td>${meal.price}</td>
				</tr>
			</table>
		</div>
		<br>
		<a type="button" href="/egzas/menu" class="button">Atgal</a>
	</body>
</html>