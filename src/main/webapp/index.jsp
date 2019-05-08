<!--
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 08/05/2019
Objetivo sucinto do programa: Implementa pagina web principal
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Sistema de Filmes</title>
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
  </head>

  <body>

	<jsp:include page="/resources/templates/navbar.jsp" />

    <!-- Begin page content -->
    <div class="container">
      <div class="page-header">
        <h1>Filmes Brazilian</h1>
      </div>
      <p class="lead">Sistema de filmes para web.</p>
      <h1>Bem vindo ao melhor site sobre filmes</h1>
    </div>

	<jsp:include page="/resources/templates/rodape.jsp"></jsp:include>

    <!-- Core JS -->
    <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
  </body>
</html>
