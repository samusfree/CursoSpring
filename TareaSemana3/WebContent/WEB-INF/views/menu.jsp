<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>
	<h2>Pagina inicial de la lista decuentas</h2>
	<p>Bienvenido, ${usuarioLogueado.login}</p>
	<ul>
		<li><a href="listarCuentas">Clic aquí</a> para acceder a la lista
			de cuentas. http://www.academias.joedayz.pe</li>
		<li>
			<a href="logout">Cerrar Sesión</a>
		</li>	
	</ul>
</body>
</html>
