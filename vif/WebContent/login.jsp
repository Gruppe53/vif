<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.util.Enumeration"%>

<jsp:useBean id="login" class="homepage.beans.Login" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="login"/>

<%
	login.tryLogin();
	
	if(login.isLogged()) {
		session.setAttribute("isLogged", login.isLogged());
		session.setAttribute("u_name", login.getUsername());
		session.setAttribute("u_level", login.getLevel());
		
		response.sendRedirect("front.jsp");
	}
%>

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<div id="content">
	<div id="contentHeader">
    	<h1>Login</h1>
    </div>
    <div id="contentCenter">
    	<form action="" method="post">
    		<table>
    			<tr>
    				<td><label for="username">Brugernavn</label></td>
    				<td><input id="username" name="username" type="text" /></td>
    			</tr>
    			<tr>
    				<td><label for="password">Kodeord</label></td>
    				<td><input id="password" name="password" type="password" /></td>
    			</tr>
    			<tr>
    				<td><input name="login" type="submit" value="Log ind" /></td>
    			</tr>
    		</table>
    	</form>
    </div>
</div>
<%@include file="foot.jsp"%>