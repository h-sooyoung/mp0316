<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="/resources/js/jquery-3.6.1.min.js"></script>
<link rel="stylesheet" href="/resources/css/main.css" type="text/css">
<h1>/mcard/cardList</h1>
<div class="container">
	<div class="row">
	<c:forEach var="mcardDTO" items="${mcardList}">
		<div class="col">
			<div class="mcard">
				<h2 align="right" class="cname">${mcardDTO.scname}</h2>
				<span class="name"><br/>${mcardDTO.name} </span><span>${mcardDTO.sgrade}</span><br/>
				<span><b>M</b>: ${mcardDTO.phone}</span> <span><b>E</b>: ${mcardDTO.email}</span><br/>
				<span><b>T</b>: ${mcardDTO.tel}</span> <span><b>F</b>: ${mcardDTO.fax}</span><br/>
				<span class="addr">${mcardDTO.addr1} ${mcardDTO.addr2}</span>
			</div>
		</div>
	</c:forEach>
	</div>
</div>