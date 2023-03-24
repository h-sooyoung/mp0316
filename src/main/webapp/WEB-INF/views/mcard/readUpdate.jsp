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

<form action="/mp/readUpdatePro" method="post">
<input type="hidden" name="mcard_seq" value="${mcardDTO.mcard_seq}"/>
<table class="table">
	<tr>
		<td>
			이름: 
		</td>
		<td><input name="name" type="text" value="${mcardDTO.name}" readonly/>
		</td>
	</tr>
	<tr>
		<td>
			휴대전화: 
		</td>
		<td><input name="phone" type="text" value="${mcardDTO.phone}"/>
		</td>
	</tr>
	<tr>
		<td>
			전화번호: 
		</td>
		<td><input name="tel" type="text" value="${mcardDTO.tel}"/>
		</td>
	</tr>
	<tr>
		<td>
			팩스번호: 
		</td>
		<td><input name="fax" type="text" value="${mcardDTO.fax}"/>
		</td>
	</tr>
	<tr>
		<td>
			이메일: 
		</td>
		<td><input name="email" type="text" value="${mcardDTO.email}"/>
		</td>
	</tr>

	<tr>
		<td>
			성별: 
		</td>
		<td>
			<select name="gender"
        		style="background-color:#D8D8D8" 
        		onFocus="this.initialSelect = this.selectedIndex;" 
        		onChange="this.selectedIndex = this.initialSelect;">
				<option value="${mcardDTO.gender}">${mcardDTO.sgender}</option>
			</select>
		</td>
	</tr>
		<tr>
		<td>
			직급: 
		</td>
		<td>
			<select name="grade">
				<option value="${mcardDTO.grade}">${mcardDTO.sgrade}</option>
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
					<option value="${mcardDTO.cname}">${mcardDTO.scname}</option>
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
		<td><input name="addr1" id="addr1" type="text" value="${mcardDTO.addr1}"/>
		</td>
	</tr>
	<tr>
		<td>
			상세주소: 
		</td>
		<td><input name="addr2" id="addr2" type="text" value="${mcardDTO.addr2}"/>
		</td>
	</tr>
	<tr>
		<td>
			명함 공개 여부:
		</td>
		<td>
			<select name="status">
				<option value="${mcardDTO.status}">${mcardDTO.sstatus}</option>
				<c:forEach var="statusDTO" items="${statusList}">
					<option value="${statusDTO.mcstatus_seq}">${statusDTO.name}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="수정"/>
		</td>
	</tr>
</table>
</form>