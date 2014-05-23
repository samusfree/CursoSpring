<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<h3>Agregar Cuentas</h3>
	<form action="agregarCuenta" method="post">
		
		<form:errors path="cuenta.descripcion" />
		<label for="descripcion">Descripcion: </label><br />
		<textarea name="descripcion" id="descripcion" rows="5" cols="100"></textarea>
		<br /> 
		
		<form:errors path="cuenta.valor" />
		<label id="valor">Valor:</label> <input type="text"
			name="valor" id="valor" value="0.0"/>
		<br /> 
		
		
		<label for="tipo">Tipo:</label> 
		<br />
		<select name="tipo" id="tipo">
			<option value="INGRESO" selected="selected">Ingreso</option>
			<option value="SALIDA">Salída</option>
		</select> 
		<br /> 
		
		<br /> 
		<input type="submit" value="Agregar" />
	</form>
</body>
</html>