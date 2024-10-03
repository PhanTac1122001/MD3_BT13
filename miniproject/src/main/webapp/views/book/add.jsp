<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/3/2024
  Time: 12:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<form:form action="add-book" modelAttribute="book" method="post">
    <input type="hidden"  id="id">
    <div class="form-group">

        <label>Category</label>
        <select name="category_id"> <!-- Thêm name cho select -->
            <c:forEach items="${categories}" var="category" >
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>

    </div>
    <div class="form-group">

        <label >Name</label>
        <input type="text" id="name" name="name">

    </div>
    <div class="form-group">

        <label >Price</label>
        <input type="text" id="price" name="price">

    </div>
    <div class="form-group">

        <label >Stock</label>
        <input type="text" id="stock" name="stock">

    </div>
    <div class="form-group">

        <label >Total Pages</label>
        <input type="text" id="totalPages" name="totalPages">

    </div>
    <div class="form-group">

        <label >Year Created</label>
        <input type="text" id="yearCreated" name="yearCreated">

    </div>
    <div class="form-group">

        <label >Author</label>
        <input type="text" id="author" name="author">

    </div>
    <div class="form-group">
        <label>STATUS</label>
        <input type="radio" id="status-active" name="status" value="true" checked />
        <label for="status-active">Hoạt động</label>

        <input type="radio" id="status-inactive" name="status" value="false" />
        <label for="status-inactive">Không hoạt động</label>
    </div>
    <button type="submit">Them</button>
</form:form>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
