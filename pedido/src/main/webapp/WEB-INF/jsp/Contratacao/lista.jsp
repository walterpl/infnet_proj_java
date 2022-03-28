<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>App serviço</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastro de Contratos</h2>
		<form action="Contratacao" method="get">
			<button type="submit" class="btn btn-primary">Novo Contrato</button>
		</form>

		<p>Lista de Contratos(99)</p>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Data</th>
					<th>Destino</th>
					<th>Loja</th>
					<th>Serviço</th>
					<th>Cliente</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>