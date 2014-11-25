<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="login" class="homepage.beans.Login" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="login"/>

<%
	if(!login.isLogged())
		response.sendRedirect("front.jsp");
	
	if(request.getParameter("lvl") != null) {
		int r_lvl = Integer.parseInt(request.getParameter("lvl"));
		int u_lvl = (Integer) session.getAttribute("u_level");
		
		
		if(u_lvl > r_lvl)
			response.sendRedirect("front.jsp");
	}
%>