<%@ page language="java" contentType="text/html; charset=ISO-8859-1; charset=uft-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="uft-8">
<title>New product</title>
</head>
<body>
<form action="/hibernate/AjoutProduit"method ="post">
<div>
<label>product Name</label>
<input type="text" name ="name" placeholder="ajoutez un nom de produit">
</div>
<div>
<label>Product decription</label>
<textarea name="description" placeholder="ajoutez une description"></textarea>
</div>
<input type="submit" value="soumettre">
</form>

</body>
</html>