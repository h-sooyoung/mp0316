<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
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