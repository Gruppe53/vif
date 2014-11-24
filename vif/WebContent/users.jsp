<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.io.*"%>

<jsp:useBean id="users" class="homepage.beans.Users"></jsp:useBean>
<jsp:setProperty property="*" name="users" />

<%
	String delete = (String) request.getParameter("deleteuser");
		
	if(delete != null)
		users.deleteUser(delete);
%>
<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<div id="content">
	<div id="contentHeader">
    	<h1>Brugere</h1>
    </div>
    <div id="contentCenter">
    	<h2>Brugerliste</h2>
    	<table class="shiftingTable">
    		<%
    			try {
    				users.createUserList(out);
    			} catch(IOException e) {
    				%>
    					<tr><td>Fejl ved indlæsning af data fra databasen.</td></tr>
    				<%
    			}
    		%>
    	</table>
    </div>
    </div>
</div>
<%@include file="foot.jsp"%>