<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% HttpSession sessionad = request.getSession(false);
String user = (String) sessionad.getAttribute("username");
String rolename = (String) sessionad.getAttribute("rolename");
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accommodation Portal</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
body {
  background-color: lightgray;
}
.container{
padding-top: 10px;
}
.card{
padding-top: 5px;
}
.table{
padding-top: 5px;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
    <a class="navbar-brand" href="#">Welcome <%=user %> </a>
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="addaccommodations">Accommodations</a>
      </li>
    </ul>
   <form class="form-inline my-2 my-lg-0"  action="logout"  method="post">
      <button class="btn btn-outline-default my-2 my-sm-0" type="submit">Logout</button>
    </form>
  </div>
</nav>
</body>
<!-- <footer>
 <strong>Copyright &copy; 2020 <a href="http://adminlte.io">Mishal</a>.</strong>
    All rights reserved.
    <div class="float-right d-none d-sm-inline-block">
      <b>Version</b> 1.0.0
    </div>
</footer> -->
</html>