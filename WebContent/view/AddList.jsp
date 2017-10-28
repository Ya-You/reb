<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script  type="text/javascript" src="jquery-1.8.3.js"></script>
<script type="text/javascript">
	function attce(){
		var name=$("#name").val();
		var dept=$("#peth").val();
		var date=$("#datetime").val();
		var status=$("#status").val();
		if(name==""){
			alert("姓名不能为空");
			return false;
		}
		else if(dept==""){
			alert("部门不能为空");
			return false;
		}
		else if(date==""){
			alert("日期不能为空");
			return false;
		}
		else if(status==""){
			alert("考勤类型不能为空");
			return false;
		}else{
			return true;
		}
		
	}
	
</script>

</head>
<body>
<% String path=request.getContextPath(); %>
<form action="<%=path %>/do/add" method="post"  onsubmit="return attce()" >
	<table  border="1">
		<tr>
			<td>考勤记录信息表</td>
		</tr>
		<tr>
			<td>姓名</td>
			<td><input type="text" name="name" id="name"/></td>
		</tr>
		<tr>
			<td>所属部门</td><td><input type="text" name="dept" id="peth"/></td>
		</tr>
		<tr>
			<td>考勤日期</td><td><input type="text" name="date" id="datetime"/>日期格式：yyyy-mm-dd</td>
		</tr>
		<tr>
			<td>考勤状态</td>
			<td><select name="status" id="status">
			<option >请选择考勤类型</option>
			<option value="正常">正常</option>
			<option value="迟到">迟到</option>
			<option value="呵呵">呵呵</option>
			</select></td>
		</tr>
	</table>
	<input type="submit" value="登记" /><input type="reset" value="重置"/>
	</form>
</body>
</html>