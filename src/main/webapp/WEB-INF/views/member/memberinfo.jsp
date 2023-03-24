<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="/resources/js/jquery-3.6.1.min.js"></script>


<h1>/info/</h1>

<h2> id : ${sessionScope.id}</h2>
<h2> pw : ${info.PW}</h2>

<h2>${info.NAME}</h2><br />
<h2>${info.ADDR1 }</h2><br />
<h2>${info.ADDR2 }</h2><br />
<h2>${info.BIRTH}</h2><br />
<h2>${info.REG}</h2><br />
<h2>${info.EMAIL}</h2><br />
<h2>${info.GEN}</h2><br />
<h2>${info.MEMO}</h2>
<input type="button" value="수정" onclick="window.location='/mp/memberinforead?seq=${info.MEMBER_SEQ}'"/>