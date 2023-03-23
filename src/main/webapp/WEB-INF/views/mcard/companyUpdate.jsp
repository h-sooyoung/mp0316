<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/resources/js/jquery-3.6.1.min.js"></script>
<form method="post" action="/mp/companyUpdatePro">
<input type="hidden" name="company_seq" value="${companyDTO.company_seq}"/>
<table class="table">
	<tr>
		<td>
			회사 이름: 
		</td>
		<td>
			<input type="text" name="name" value="${companyDTO.name}"/>
		</td>
	</tr>
	<tr>
		<td>
			주소: 
		</td>
		<td>
			<input type="text" name="addr1" value="${companyDTO.addr1}"/>
		</td>
	</tr>
	<tr>
		<td>
			상세주소: 
		</td>
		<td>
			<input type="text" name="addr2" value="${companyDTO.addr2}"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="수정"/>
		</td>
	</tr>
</table>
</form>