<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
   
<!DOCTYPE html>
<html>

	<!-- BEGIN HEAD -->
	<head>
		<meta charset="utf-8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1" name="viewport"/>
		<meta content="" name="description"/>
		<meta content="" name="author"/>
		
		<title><tiles:getAsString name="title" /></title>	

	    <!-- Core CSS - Include with every page -->
	    <link href="${pageContext.request.contextPath}/static/sb-admin-v2/css/bootstrap.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/static/sb-admin-v2/font-awesome/css/font-awesome.css" rel="stylesheet">
	
	    <!-- SB Admin CSS - Include with every page -->
	    <link href="${pageContext.request.contextPath}/static/sb-admin-v2/css/sb-admin.css" rel="stylesheet">		

	    <!-- Core Scripts - Include with every page -->
	    <script src="${pageContext.request.contextPath}/static/sb-admin-v2/js/jquery-1.10.2.js"></script>
	    <script src="${pageContext.request.contextPath}/static/sb-admin-v2/js/bootstrap.min.js"></script>
	    <script src="${pageContext.request.contextPath}/static/sb-admin-v2/js/plugins/metisMenu/jquery.metisMenu.js"></script>
	
	    <!-- SB Admin Scripts - Include with every page -->
	    <script src="${pageContext.request.contextPath}/static/sb-admin-v2/js/sb-admin.js"></script>
	    
	    				
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/static/sb-admin-v2/favicon.ico"/>
	</head>
	<!-- END HEAD -->
	
	<!-- BEGIN BODY -->
	<body>
    
    
    	<!-- BEGIN WRAPPER -->
	    <div id="wrapper">
         	<nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
				<tiles:insertAttribute name="header" />			
				<tiles:insertAttribute name="topLinks" />				
				<tiles:insertAttribute name="menu" />
			</nav>	
			
			<div id="page-wrapper">					
				<div class="row">
				    <div class="col-lg-12">
				        <h1 class="page-header"><tiles:getAsString name="pageTitle" /></h1>
				    </div>
				</div>								
				<tiles:insertAttribute name="pageContent" />
			</div>
	    </div>		
		<!-- END WRAPPER -->				
				
	</body>
	<!-- END BODY -->
	
</html>