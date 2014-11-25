<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="login" class="homepage.beans.Login" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="login"/>
<%
	login.tryLogout();

	session.removeAttribute("isLogged");
	session.removeAttribute("u_name");
	session.removeAttribute("u_level");
	
	response.sendRedirect("front.jsp");
%>