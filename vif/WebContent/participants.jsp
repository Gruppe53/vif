<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.io.*"%>

<jsp:useBean id="participants" class="homepage.beans.Participants" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="participants" />

<%
	String removebid = (String) request.getParameter("removebid");
	String filelist = (String) request.getParameter("filelist");

	if(removebid != null)
		participants.removeBid(removebid);
	
	if(filelist != null)
		// TODO
		// jQuery plugin can export table to anything we would like (JSON, xls, HTML, XML and so on)...
		// http://kayalshri.github.io/tableExport.jquery.plugin/
%>

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

	<div id="content">
		<div id="contentHeader">
	    	<h1>Deltagere</h1>
	    </div>
	    <div id="contentCenter">
	    	<h2>Deltagerliste til Roskilde Festival <jsp:getProperty property="year" name="participants" /></h2>
	    	<table class="shiftingTable">
	    		<%
	    			try {
	    				participants.createUserList(out);
	    			} catch(IOException e) {
	    				%>
	    					<tr><td>Fejl ved udskrivning af data.</td></tr>
	    				<%
	    			}
	    		%>
	    	</table>
	    	<div class="frontLink" onclick="if(confirm('Er du sikker på, at du gerne vil arkivere listen fra festivalsåret <jsp:getProperty property="year" name="participants" />?'))location='?filelist=<jsp:getProperty property="year" name="participants" />'">arkiver liste</div>
	    	<div class="frontLink" onclick="if(confirm('Er du sikker på, at du gerne vil eksportere listen fra festivalsåret <jsp:getProperty property="year" name="participants" />?'))location='?exportlist=<jsp:getProperty property="year" name="participants" />'">eksporter liste</div>
	    </div>
	</div>
</div>
<%@include file="foot.jsp"%>