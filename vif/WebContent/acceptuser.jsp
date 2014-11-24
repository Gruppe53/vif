<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.io.*"%>

<jsp:useBean id="users" class="homepage.beans.AcceptUser"></jsp:useBean>
<jsp:setProperty property="*" name="users" />

<%
	if(!request.getParameter("acceptuser").isEmpty())
		users.acceptUser(request.getParameter("acceptuser"));
		
	if(!request.getParameter("deleteuser").isEmpty())
		users.acceptUser(request.getParameter("deleteuser"));
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