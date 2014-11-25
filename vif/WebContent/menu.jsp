<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<body>
	<div id="topBar"></div>
	<div id="main">
    	<div id="logo">
        </div>
        <div id="topMenu">
        	<div class="topMenuLink" onclick="location='#';">Vindinge Idrætsklub</div>
            <div class="topMenuLink" onclick="location='#';">Sport</div>
            <div class="topMenuLink" onclick="location='#';">Vindinge Støtteforening</div>
        </div>
        <div id="subMenu">
        	<div class="subMenuLink" onclick="location='front.jsp';">Front</div>
            <div class="subMenuLink" onclick="location='about.jsp';">Om støtteforeningen</div>
            <div class="subMenuLink" onclick="location='procedure.jsp';">Tilmeldingsprocedure</div>
            <div class="subMenuLink" onclick="location='signup.jsp';">Tilmelding</div>
        </div>
        <div style="float: right; width: 100px; height: 80px;">
        	<nav>
	        	<ul>
	        		<%
	        			try {
	        				boolean isLogged = (Boolean) session.getAttribute("isLogged");
	        				int u_lvl = (Integer) session.getAttribute("u_level");
	        				
	        				if(isLogged) {
	        					
	        					if(u_lvl <= 1) {
	        						%>
	        						<li><a href="#">Kontrolpanel</a>
					        			<ul>
					        				<li><a href="users.jsp">Brugere</a></li>
					        				<li><a href="participants.jsp">Vagtplan</a></li>
					        				<li><a href="archive.jsp">Arkiv</a></li>
					        				<li><a href="logout.jsp">Log ud</a></li>
					        			</ul>
					        		</li>
	        						<%
	        					}
	        					else if(u_lvl <= 10) {
	        						%>
	        						<li><a href="logout.jsp">Log ud</a></li>
	        						<%
	        					}
	        					else {
	        						%>
	        						<li><a href="login.jsp">Log på</a></li>
	        						<%
	        					}
	        				}
						} catch(Exception e) {
							%>
							<li><a href="login.jsp">Log på</a></li>
							<%
						}
	        		%>
	        	</ul>
        	</nav>
        </div>