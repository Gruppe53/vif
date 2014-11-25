<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.io.*"%>

<jsp:useBean id="users" class="homepage.beans.NewUsers"></jsp:useBean>
<jsp:setProperty property="*" name="users" />

<%
	String accept = (String) request.getParameter("acceptuser");
	String delete = (String) request.getParameter("deleteuser");

	if(accept != null)
		users.acceptUser(accept);
		
	if(delete != null)
		users.deleteUser(delete);
%>

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<div id="content">
	<div id="contentHeader">
    	<h1>Nye brugere</h1>
    </div>
    <div id="contentCenter">
    	<h2>Brugerliste</h2>
    	<table class="shiftingTable">
    		<%
    			try {
    				users.createUserList(out);
    			} catch(IOException e) {
    				%>
    					Fejl ved indlæsning af data fra databasen.
    				<%
    			}
    		%>
    	</table>
    </div>
    </div>
</div>
<%@include file="foot.jsp"%>