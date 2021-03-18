<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>App User</title>
<jsp:include page="css.jsp"></jsp:include>

</head>
<style>
#btnregister {
	background-color: #427BFF;
	border: none;
	color: white;
	padding: 10px 25px;
	text-align: center;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}
</style>
<body class="hold-transition sidebar-mini layout-fixed ">
	<div class="wrapper">

		<!-- Preloader  
		<div	class="preloader flex-column justify-content-center align-items-center">
			<img class="animation__shake" src="dist/img/AdminLTELogo.png"
				alt="AdminLTELogo" height="20" width="20">
		</div>
-->
		<!-- Main Side bar Container  start-->
		<jsp:include page="side-navigation.jsp"></jsp:include>

		<!-- Main Side bar Container end -->

		<!-- Content Wrapper start -->

	<form:form modelAttribute="appuser" action="processappuser" id="appUserForm">
		<%@include file="app-user-content.jsp" %>
	
	</form:form>
		<!-- Content Wrapper end -->



		<!-- footer start -->
		<jsp:include page="footer.jsp"></jsp:include>
		<!-- footer end -->
		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->


	<jsp:include page="javascripts.jsp"></jsp:include>

	<script src="/js/app-user/app-user.js"></script>
</body>
</html>
