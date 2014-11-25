<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.io.*"%>

<jsp:useBean id="arhive" class="homepage.beans.Archive" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="archive" />

<%
	String filelist = (String) request.getParameter("filelist");
	
	if(filelist != null)
		// TODO
		// jQuery plugin can export table to anything we would like (JSON, xls, HTML, XML and so on)...
		// http://kayalshri.github.io/tableExport.jquery.plugin/
%>

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

	<div id="content">
		<div id="contentHeader">
	    	<h1>Arkiv</h1>
	    </div>
	    <div id="contentCenter">
	    	<h2>Arkivliste</h2>
	    	<table class="shiftingTable">
	    		<%
	    			String archiveyear = (String) request.getParameter("archiveyear");
	    		
	    			try {
		    			if(archiveyear != null) {
		    				arhive.createArchivedList(out);
		    			}
		    			else {
		    				arhive.createArchive(out);
		    			}
	    			} catch(IOException e) {
	    				%>
	    					<tr><td>Fejl ved udskrivning af data.</td></tr>
	    				<%
	    			}
	    		%>
	    	</table>
	    </div>
	</div>
</div>
<%@include file="foot.jsp"%>