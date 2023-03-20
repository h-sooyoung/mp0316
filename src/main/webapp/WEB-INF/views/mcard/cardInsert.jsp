<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="/resources/js/jquery-3.6.1.min.js"></script>
<h1>/mcard/cardInsert</h1>
<form action="" method="post">
<input name="" type="hidden" value=""/>
<table class="table">
	<tr>
		<td>
			이름: 
		</td>
		<td><input name="name" type="text"/>
		</td>
	</tr>
	<tr>
		<td>
			휴대전화: 
		</td>
		<td><input name="phone" type="text"/>
		</td>
	</tr>
	<tr>
		<td>
			전화번호: 
		</td>
		<td><input name="tel" type="text"/>
		</td>
	</tr>
	<tr>
		<td>
			팩스번호: 
		</td>
		<td><input name="fax" type="text"/>
		</td>
	</tr>
	<tr>
		<td>
			이메일: 
		</td>
		<td><input name="email" type="text"/>
		</td>
	</tr>

	<tr>
		<td>
			성별: 
		</td>
		<td>
		<%-- 프로젝트 합친 후 genderDTO 옵션에 넣어주기 --%>
			<select name="gender">
				<c:forEach var="genderDTO" items="${genderList}">
					<option value="${genderDTO.gen_seq}">${genderDTO.name}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
		<tr>
		<td>
			직급: 
		</td>
		<td>
			<select name="grade">
				<c:forEach var="cgradeDTO" items="${cgradeList}">
					<option value="${cgradeDTO.cgrade_seq}">${cgradeDTO.name}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			회사명: 
		</td>
		<td>
			<select name="cname">
				<c:forEach var="companyDTO" items="${companyList}">
					<option value="${companyDTO.company_seq}">${companyDTO.name}</option>
				</c:forEach>
			</select>
			<button>회사 목록 추가하기</button>
		</td>
	</tr>
		<tr>
		<td>
			주소: 
		</td>
		<td><input name="addr1" type="text"/>
		</td>
	</tr>
	<tr>
		<td>
			상세주소: 
		</td>
		<td><input name="addr2" type="text"/>
		</td>
	</tr>
	<tr>
		<td>
			명함 공개 여부
		</td>
		<td>
			<select name="status">
				<c:forEach var="statusDTO" items="${statusList}">
					<option value="${statusDTO.mcstatus_seq}">${statusDTO.name}</option>
				</c:forEach>
				
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="등록"/>
		</td>
	</tr>
</table>
</form>
