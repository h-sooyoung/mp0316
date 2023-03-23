<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/resources/js/jquery-3.6.1.min.js"></script>
<script>
$(function(){
	
});

function delCompany(num1) {
	num1 = num1*1;
	$.ajax({
		type : "get",
		url : "/mp/delete1CompanyBySeq",
		data : {company_seq : num1},
		success : function(){
			location.reload();
		}
	});
}
</script>
<form method="post" action="/mp/companyListPro">
<table class="table">
	<tr>
		<th>
			<input type="checkbox" id="allCheck" />
		</th>
		<th>
			회사
		</th>
		<th>
			주소
		</th>
		<th>
			<input type="submit" value="선택삭제"/>
		</th>
	</tr>
	<c:forEach var="companyDTO" items="${companyList}">
	<tr>
		<td>
			<input type="checkbox" value="${companyDTO.company_seq}"/>
		</td>
		<td>
			${companyDTO.name}
		</td>
		<td>
			${companyDTO.addr1} ${companyDTO.addr2}
		</td>
		<td>
			<button type="button" onclick="delCompany(${companyDTO.company_seq})">삭제</button>
		</td>
	</tr>
	</c:forEach>
</table>
</form>