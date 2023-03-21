<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="/resources/js/jquery-3.6.1.min.js"></script>
<h1>/mcard/cardListTable</h1>

<table class="table">
	<tr>
		
		<th>
			회사
		</th>
		<th>
			이름
		</th>
		<th>
			직급
		</th>
		<th>
			이메일
		</th>
	</tr>
	<c:forEach var="mcardDTO" items="${mcardList}">
	<tr>
		<td>
			${mcardDTO.scname}
		</td>
		<td>
			<a href="/mp/readUpdate?mcard_seq=${mcardDTO.mcard_seq}">${mcardDTO.name}</a>
		</td>
		<td>
			${mcardDTO.sgrade}
		</td>
		<td>
			${mcardDTO.email}
		</td>
	</tr>
	</c:forEach>
</table>