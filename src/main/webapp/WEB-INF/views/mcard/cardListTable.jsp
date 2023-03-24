<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/resources/js/jquery-3.6.1.min.js"></script>

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

<%-- 페이징 처리--%>
<center>
<c:forEach var="pageNum" begin="1" end="${countPage}" step="1">
	<a href="/mp/cardListTable?pageNum=${pageNum}">[${pageNum}]</a> 
</c:forEach>
</center>
<br/>
<button onclick="window.location='/mp/cardInsert'">등록하기</button>
<%-- 검색창 --%>
<center>
<form method="get" action="/mp/cardSearchResult">
	<select name="searchCol">
		<option value="name">이름</option>
		<option value="scname">회사</option>
		<option value="sgrade">직급</option>
		<option value="email">이메일</option>
	</select>
	<input type="text" name="searchValue"/>
	<input type="submit" value="검색"/>
</form>
</center>