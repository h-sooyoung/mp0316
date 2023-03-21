<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/resources/js/jquery-3.6.1.min.js"></script>

<form method="post" action="/mp/companyInsertPro">
<table class="table">
	<tr>
		<td>
			회사 이름: 
		</td>
		<td>
			<input type="text" name="name" />
		</td>
	</tr>
	<tr>
		<td>
			주소: 
		</td>
		<td>
			<input type="text" name="addr1" />
		</td>
	</tr>
	<tr>
		<td>
			상세주소: 
		</td>
		<td>
			<input type="text" name="addr2" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="등록"/>
		</td>
	</tr>
</table>
</form>