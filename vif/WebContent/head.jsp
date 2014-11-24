<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="style/global.css">
<title>Vindinge Støtteforening</title>
<script type="text/javascript">
	var datefield = document.createElement("input");
	datefield.setAttribute("type", "date")
	if (datefield.type!="date") {
		document.write('<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />\n');
		document.write('<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"><\/script>\n');
		document.write('<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"><\/script>\n');
    }
	
	if (datefield.type!="date") {
    	jQuery(function($) {
			$('#signup_birthday').datepicker();
		});
	}
</script>
</head>