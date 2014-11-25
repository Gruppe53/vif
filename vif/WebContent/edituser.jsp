<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.sql.SQLException"%>

<jsp:useBean id="edit" class="homepage.beans.EditUser" scope="request" />

<%
	String sub = (String) request.getParameter("submit");

	if(sub != null && sub.equals("Opdater bruger")) {
		if(edit.editUser(request)) {
			// TODO
			// Redirect and inform of success...
		}
	}
	
	if(request.getParameter("email") != null) {
		try {
			edit.getUserData(request.getParameter("email"));
		} catch(SQLException e) {
			// TODO
			// Redirect back to userlist and warn user of error...
		}
	}
%>

<jsp:setProperty property="*" name="edit" />

<%@include file="head.jsp"%>
<%@include file="menu.jsp"%>

<div id="content">
<div id="contentHeader">
   	<h1>Velkommen til Vindinge Støtteforening</h1>
       <p>Læs og forstå hvordan du tilmelder dig <a href="#">her</a>.</p>
   </div>
   <div id="contentCenter">
   	<h2>Brugeroplysninger</h2>
       <p>Bemærk at <em>alle</em> felter skal være udfyldt</p>
       <form action="" method="post">
       <input id="email" name="email" type="hidden" value="<jsp:getProperty property="email" name="edit" />" />
       <table class="maxTable">
           	<tr>
               	<td><label for="fname">Fornavn</label></td>
                <td><input id="fname" name="fname" type="text" value="<jsp:getProperty property="fname" name="edit" />" /></td>
                <td style="color: #999;">Indtast for- og eventuelle mellemnavne.</td>
            </tr>
            <tr>
               	<td><label for="lname">Efternavn</label></td>
                <td><input id="lname" name="lname" type="text" value="<jsp:getProperty property="lname" name="edit" />" /></td>
                <td style="color: #999;">Indtast efternavn.</td>
            </tr>
            <tr>
               	<td><label for="birthday">Fødselsdato</label></td>
                <td><input value="<jsp:getProperty property="birthday" name="edit" />"  id="birthday" name="birthday" type="date" /></td>
                <td style="color: #999;"><em>Skal</em> være på formatet yyyy-mm-dd, hvis man indtaster manuelt.</td>
            </tr>
			<tr>
				<td><label for="address">Adresse</label></td>
			    <td><input value="<jsp:getProperty property="address" name="edit" />"  id="address" name="address" type="text" /></td>
			    <td style="color: #999;">Skriv dit gadenavn og -nummer - eventuelt etage og side/dørnummer.</td>
			</tr>
			<tr>
				<td><label for="zip">Post nr.</label></td>
			    <td><input value="<jsp:getProperty property="zip" name="edit" />"  id="zip" name="zip" type="text" /></td>
			    <td style="color: #999;">Skriv dit postnummer.</td>
			</tr>
			<tr>
				<td><label for="city">By</label></td>
			    <td><input value="<jsp:getProperty property="city" name="edit" />"  id="city" name="city" type="text" /></td>
			    <td style="color: #999;">Skriv bynavn.</td>
			</tr>
			<tr>
				<td><label for="password">Kodeord</label></td>
			    <td><input id="password" name="password" type="password" /></td>
			    <td style="color: #999;" rowspan="2">Vælg et kodeord. Kodeordet skal bruges, når du logger på og skal vælge vagttidspunkter. Skal bruges igen, hvis du vil tilmelde dig igen næste år.</td>
			</tr>
			<tr>
				<td><label for="password_repeat">Gentag kodeord</label></td>
			    <td><input id="password_repeat" name="password_repeat" type="password" /></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="Opdater bruger" /></td>
			    <td rowspan="2"><input type="reset" value="Nulstil" /></td>
			</tr>
		</table>
	</form>
</div>
</div>

<%@include file="foot.jsp"%>