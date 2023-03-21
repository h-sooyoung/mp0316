<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/resources/js/jquery-3.6.1.min.js"></script>

<script>
$(function(){
	//회사 선택시 주소 가져오기
	$("#company").change(function(){
		$.ajax({
			type : "get",
			url : "/mp/getAddrByCompany_seq",
			data : {company_seq : $("#company").val()},
			success : function(value){
			    $("#addr1").attr("value", value.addr1);
			    $("#addr2").attr("value", value.addr2);
			}
		});
		
	});	
});
</script>

<form action="/mp/cardInsertPro" method="post">
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
			<select name="cname" id="company">
					<option value="0">회사선택</option>
				<c:forEach var="companyDTO" items="${companyList}">
					<option value="${companyDTO.company_seq}">${companyDTO.name}</option>
				</c:forEach>
			</select>
			<button type="button" onclick="window.open('/mp/companyInsert', 'window_name', 'width=430, height=500, location=no, status=no, scrollbars=yes');">회사 목록 추가하기</button>
		</td>
	</tr>
		<tr>
		<td>
			주소: 
		</td>
		<td><input name="addr1" id="addr1" type="text" value=""/>
		</td>
	</tr>
	<tr>
		<td>
			상세주소: 
		</td>
		<td><input name="addr2" id="addr2" type="text" value=""/>
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
