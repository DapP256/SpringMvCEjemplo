<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 
<html>
<head>
    <title>Spring MVC Hello World</title>
</head>
 
<body>
    <h2>Alumnos en el Sistema</h2>
 
    <table border="1">
        <tr>
            <th>Alumno Id</th>
            <th> Nombre</th>
            <th> Apellido</th>
        </tr>
        <c:forEach items="${listadoAlumnos}" var="al">
            <tr>
                <td>${al.id}</td>
                <td>${al.nombre}</td>
                <td>${al.apellido}</td>
            </tr>
        </c:forEach>
    </table>

  
 
</body>
</html>