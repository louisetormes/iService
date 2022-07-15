<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>iService</title>
<link rel="icon" href="imagens/iservice.png">
<link rel="stylesheet" href="css-style.css">
</head>
<body>
<div class="fundocadastro">
<div class="cadastro">
<img src="imagens/iservice.png" width=30%>
<h1>Cadastro Prestador de Serviços</h1>



	
	<form name="frmCadastro" action="/Teste/insert">
		<table>
			<tr>
				<td><input type="text" name="nomeempresa" placeholder="nome empresa" class="caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="fone" placeholder="fone" class="caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="email" placeholder="email" class="caixa1"></td>
			</tr>
			<tr>
				<td><input type="password" name="password" placeholder="password" class="caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="tiposervico" placeholder="tipo de serviço" class="caixa1"></td>
			</tr>
			<tr>
				<td><input type="password" name="confirmpassword" placeholder="confirme sua password" class="caixa1"></td>
			</tr>
		</table>
		<input type="button" value="Cadastrar" class="botao1" onclick="validar()">
		</div>
		</div>
	</form>
	<script src="scripts/validador.js"></script>
	<script src="scripts/validadorpassword.js"></script>
</body>
</html>