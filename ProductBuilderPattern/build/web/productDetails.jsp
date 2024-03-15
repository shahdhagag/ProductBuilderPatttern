<%-- 
    Document   : productDetails.jsp
    Created on : Mar 14, 2024, 5:11:03 PM
    Author     : dell
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h2>Product Details</h2>
    <p>Name: ${product.name}</p>
    <p>Price: ${product.price}</p>
    <p>Category: ${product.category}</p>
    <p>In Stock: ${product.inStock}</p>
</body>
</html>