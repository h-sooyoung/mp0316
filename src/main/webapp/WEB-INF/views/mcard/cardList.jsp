<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/resources/js/jquery-3.6.1.min.js"></script>
<link rel="stylesheet" href="/resources/css/main.css" type="text/css">
<div class="container">
	<div class="row">
	<c:forEach var="mcardDTO" items="${mcardList}">
		<div class="col">
			<div class="mcard">
				<h3 align="right" class="cname">${mcardDTO.scname}</h3>
				<span class="name"><br/>${mcardDTO.name} </span><span>${mcardDTO.sgrade}</span><br/>
				<span><b>M</b>: ${mcardDTO.phone}</span> <span><b>E</b>: ${mcardDTO.email}</span><br/>
				<span><b>T</b>: ${mcardDTO.tel}</span> <span><b>F</b>: ${mcardDTO.fax}</span><br/>
				<span class="addr">${mcardDTO.addr1} ${mcardDTO.addr2}</span>
			</div>
		</div>
	</c:forEach>
	</div>
</div>
<%-- 페이지 처리 --%>