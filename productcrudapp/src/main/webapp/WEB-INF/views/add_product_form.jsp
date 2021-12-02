<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
			
				<h1 class="text-center mb-3">Fill the product details</h1>
				<form action="handle-product" method="post">
					<div class="form-group">
						<label for="name">Product name</label><input type="text"
						class="form-control" id="name" aria-describedby="emailHelp"
						name="name" placeholder="enter the product name here">
					</div>
					<div class="form-group">
						<label for="name">Product description</label><textarea
						class="form-control" id="description" rows="5"
						name="description" placeholder="enter the product name here"></textarea>
					</div>
					<div class="form-group">
						<label for="name">Product price</label><input type="text"
						class="form-control" id="price" 
						name="price" placeholder="enter the product price">
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
						class="brn btn-outline-danger">back</a>
						<button type="submit" class="btn btn-primary">add</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>