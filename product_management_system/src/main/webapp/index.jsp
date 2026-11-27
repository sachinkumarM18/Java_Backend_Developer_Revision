
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>

	<h2>Add New Product</h2>

	<form action="addProduct" method="post">

		<label>Product Name:</label> <input type="text" name="name" required>
		<br>
		<br> <label>Price:</label> <input type="number" name="price"
			step="0.01" required> <br>
		<br> <label>Category:</label> <input type="text" name="category"
			required> <br>
		<br> <label>Quantity:</label> <input type="number"
			name="quantity" required> <br>
		<br>

		<button type="submit">Add Product</button>

	</form>

</body>
</html>
