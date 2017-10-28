<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工信息</title>
</head>
<body>
<% String path=request.getContextPath(); %>
	<table border="1" cellpadding="0" cellspacing="0">
	<thead>
		<tr ><th>考勤信息记录表</th></tr>
		<tr>
			<th>员工姓名</th>
			<th>所属部门</th>
			<th>考勤日期</th>
			<th>考勤状态</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${userList}" var="info" varStatus="vs">
		<c:if test="${vs.index%2==0 }">
		   <tr>
		</c:if>
		<c:if test="${vs.index%2!=0 }">
		<tr style="background-color:red">
		</c:if>
				<td>${info.empname}</td>
				<td>${info.dept}</td>
				<td>${info.chkdate}</td>
				<td>${info.status}</td>
		</tr>
			</c:forEach>
	</tbody>
	
</table>
<a href="<%=path%>/view/AddList.jsp"><input type="button" value="考勤登记"/></a>
</body>
</html>