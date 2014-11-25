<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.io.*"%>

<jsp:useBean id="users" class="homepage.beans.ActiveUsers"></jsp:useBean>
<jsp:setProperty property="*" name="users" />
<jsp:useBean id="newUsers" class="homepage.beans.NewUsers"></jsp:useBean>
<jsp:setProperty property="*" name="newUsers" />
<jsp:useBean id="iaUsers" class="homepage.beans.InactiveUsers"></jsp:useBean>
<jsp:setProperty property="*" name="iaUsers" />

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<%
	String delete = (String) request.getParameter("deleteuser");
	String deactivate = (String) request.getParameter("deactivate");
	String reactivate = (String) request.getParameter("reactivate");
	String acceptuser = (String) request.getParameter("acceptuser");
	String promoteuser = (String) request.getParameter("promoteuser");
		
	if(delete != null)
		newUsers.deleteUser(delete);
	
	if(acceptuser != null)
		newUsers.acceptUser(acceptuser);
	
	if(deactivate != null)
		users.deactivateUser(deactivate);
	
	if(promoteuser != null)
		users.promoteUser(promoteuser);
	
	if(reactivate != null)
		iaUsers.reactivateUser(reactivate);
%>

<div id="content">
	<div id="contentHeader">
    	<h1>Brugerlister</h1>
    </div>
    <div id="contentCenter">
    	<h2>Nye brugere</h2>
    	<p>Nye brugere der har udfyldt tilmeldingsformularen. Brugerne kan slettes (permanent), ved at trykke på det røde kryds, eller accepteres, ved at trykke på den grønne pil.</p>
    	<table class="shiftingTable">
    		<%
    			try {
    				newUsers.createUserList(out);
    			} catch(IOException e) {
    				%>
    					<tr><td>Fejl ved indlæsning af data fra databasen.</td></tr>
    				<%
    			}
    		%>
    	</table>
    	<h2>Brugerliste</h2>
    	<p>Aktive brugere, der er i stand til at afgive ønsker til vagtplanen. Brugerne kan redigeres, ved at trykke på blyanten, eller deaktiveres (så de ikke længere er i stand til at afgive ønsker), ved at trykke på den røde pil.</p>
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
    	<h2>Inaktive brugere</h2>
    	<p>Inaktive brugere, der ikke er i stand til at afgive ønsker, men ikke kan slettes fra systemet, da de tidligere har afgivet ønsker til vagtplanen. Kan reaktiveres, ved at trykke på den grønne pil.</p>
    	<table class="shiftingTable">
    		<%
    			try {
    				iaUsers.createUserList(out);
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