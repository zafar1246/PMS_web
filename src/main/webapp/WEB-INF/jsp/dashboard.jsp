<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>PMS Dashboard</title>
<jsp:include page="css.jsp"></jsp:include>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">
		<jsp:include page="header.jsp"></jsp:include>
		<!-- Preloader -->
		<div
			class="preloader flex-column justify-content-center align-items-center">
			<img class="animation__shake" src="../../dist/img/AdminLTELogo.png"
				alt="AdminLTELogo" height="60" width="60">
		</div>


		<!-- Main Sidebar Container  start-->
		<jsp:include page="side-navigation.jsp"></jsp:include>

		<!-- Side bar end -->

		<!-- Content Wrapper start -->
		<jsp:include page="dashboard-content.jsp"></jsp:include>

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
</body>
</html>
