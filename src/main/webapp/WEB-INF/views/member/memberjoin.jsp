<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script src="/resources/js/jquery-3.6.1.min.js"></script>

<form action="/mp/memberjoinPro" method="post">
<table class="table table-hover">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id" /></td>
	<tr/>
	<tr>
		<td>비밀번호</td>
		<td><input type="text" name="pw" /></td>
	<tr/>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name" /></td>
	<tr/>
	<tr>
		<td>이메일</td>
		<td><input type="text" name="email" ></tr>
	<tr/>
	<tr>
		<td>생일</td>
		<th><input type="date" name="birth"/></th>
	</tr>
	
	<tr>
		<td>성별</td>
		<td><input type="radio" name="gen" value="1" />남자 &nbsp;&nbsp;&nbsp;<input type="radio" name="gen" value="2" />여자</td>
	</tr>
	
	<tr>
		<td>전화번호</td>
		<th><input type="text" name="tel" /></th>
	</tr>
	
	<tr>
		<td>주소</td>
		<td><input type="text" name="addr1" ></td>
	</tr>
	<tr>
		<td>상세주소</td>
		<td><input type="text" name="addr2" ></td>
		
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="submit" value="가입"/>
		</td>
	</tr>
</table>
</form>