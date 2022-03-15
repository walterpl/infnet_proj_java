<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>App serviço</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastro de Contrato</h2>
		<form action="/Contratacao/incluir" method="post">
			<div class="mb-3 mt-3">
				<label >Data:</label> <input type="text"
					class="form-control" id="nome" placeholder="Informe o nome"
					name="nome">
			</div>
			<div class="mb-3">
				<label for="pwd">Destino:</label> <input type="text"
					class="form-control" id="pwd" placeholder="Informe a idade"
					name="age">
			</div>
			<div class="mb-3">
				<label for="pwd">Loja:</label> <input type="text"
					class="form-control" id="card" placeholder="Informe o numero do cartão"
					name="cardnum">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>

