<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Contact List</title>
</head>
<body>
<h1>Contact List</h1>

<ul>
	<c:forEach var="contact" items="${contactList}" varStatus="status">
		<li>
			<a href="contact.do?id=${status.index}">
				<c:out value="${contact}"></c:out>
			</a>
		</li>
	</c:forEach>
</ul>

</body>
</html>
