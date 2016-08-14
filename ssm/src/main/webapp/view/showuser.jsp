<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有用户</title>

<body>
<div>
	<p>第一种没有dao的impl的写法
        <table>
            <tr>
            	<th>id</th>
                <th>用户名</th>
                <th>密码</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                	<td>${user.id}</td>
                    <td>${user.username }</td>
                    <td>${user.password }</td>
                </tr>
            </c:forEach>
        </table>
</div>
 <div>
	<p>第二种有dao的impl的写法
        <table>
            <tr>
            	<th>id</th>
                <th>用户名</th>
                <th>密码</th>
            </tr>
            <c:forEach items="${users2}" var="user1">
                <tr>
                	<td>${user1.id}</td>
                    <td>${user1.username }</td>
                    <td>${user1.password }</td>
                </tr>
            </c:forEach>
        </table>
</div> 
    </body>
</html>