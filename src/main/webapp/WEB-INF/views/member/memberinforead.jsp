<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script src="/resources/js/jquery-3.6.1.min.js"></script>

<form action="/mp/memberupdate" method="post" id="memberinforead">
<input type="hidden" name="member_seq" value="${dto.member_seq}"/>
<table class="table table-hover">
	
	<tr>
		<td>아이디</td>
		<td><input type="text" name="memid" value="${dto.memid}"/></td>
	<tr/>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name" value="${dto.name}"/></td>
	<tr/>
	<tr>
		<td>이메일</td>
		<td><input type="text" name="email" value="${dto.email}"></tr>
	<tr/>
	<tr>
		<td>생일</td>
		<th><fmt:formatDate value="${dto.birth}" type="date"/></th>
	</tr>
	<tr>
		<td>전화번호</td>
		<th><input type="text" name="tel" value="${dto.tel}"/></th>
	</tr>
	<tr>
		<td><input type="text" name="addr1" value="${dto.addr1}"></td>
		<td colspan="1"><input type="text" name="addr2" value="${dto.addr2}"></td>
		
	</tr>
	<tr>
		<th>가입일 <fmt:formatDate value="${dto.reg}" type="date"/>  </th>
	</tr>
	<tr>
		<td>
			<input type="submit" value="수정"/>
			<input type="button" value="명함목록" onclick="window.location='/mp/cardListTable'"/>
		</td>
	</tr>
</table>
</form>