<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>App serviço</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container mt-3">
  <h2>Login</h2>
  	
  	<c:if test="${not empty mensagem}">
	    <div class="alert alert-warning">
	   	 <strong>Falha na Autenticação!</strong> ${mensagem}
	  	</div>
	</c:if>
  <form action="/login" method= "post">
    <div class="mb-3 mt-3">
      <label>Email:</label>
      <input type="email" class="form-control" placeholder="Informe email de Acesso." name="email" value = "walter@infnet.com">
    </div>
    <div class="mb-3">
      <label>Password:</label>
      <input type="password" class="form-control"placeholder="Informe a senha" name="senha"value = "walter@infnet.com" >
    </div>
    <button type="submit" class="btn btn-primary">Entrar</button>
  </form>
</div>
</body>
</html>