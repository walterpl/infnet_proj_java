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
		<h2>Cadastro de Hoteis</h2>
		<form action="/Hospedagem/incluir" method="post">
		
			<div class="mb-3 mt-3">
				<label>Nome:</label> <input type="text" class="form-control"
					id="hotel" placeholder="Informe o nome" name="nome" value = "comanche">
			</div>
			
			<div class="mb-3 mt-3">
				<label for="pwd">Numero de Estrelas:</label> <input type="text"
					class="form-control" id="numstar" name="age" value="5" placeholder="Informe o numero de estrelas" >
			</div>
			
			<div class="mb-3 mt-3">
				<form>
					<div class="checkbox">
						<label><input type="checkbox" name = "concierge"> Concierge?</label>
					</div>
					
			</div>
			<div class="mb-3 mt-3">
				<label for="pwd">Data de Checkin:</label> <input type="text"
					class="form-control" id="data_ida"  value="21/05/2022" placeholder="Informa a data de checkin">
			</div>
			
			<div class="mb-3 mt-3">
				<label for="pwd">Data de Checkout:</label> <input type="text"
					class="form-control" id="data_retorno"  value="21/08/2022" placeholder="Informa a data de checkout">
			</div>
			
			<div class="mb-3 mt-3">
				<label for="pwd">Quantidade de Hospedes:</label> <input type="text"
					class="form-control" id="count_pessoas" value = 10 placeholder="Informa a quantidade de hospedes.">
			</div>
			
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>

