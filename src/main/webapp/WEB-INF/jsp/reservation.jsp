<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Reservations</title>
		<jsp:include page="css.jsp"></jsp:include>
		
</head>
<body class="hold-transition sidebar-mini layout-fixed" style='font-weight:normal'>
	<div class="wrapper">


<jsp:include page="header.jsp"></jsp:include>

		<!-- Main Side bar Container  start-->
		<jsp:include page="side-navigation.jsp"></jsp:include>

		<!-- Main Side bar Container end -->

		<!-- Content Wrapper start -->
		<form id="reservationFrm" name="reservationFrm" action="makereservation" method="post">
			<jsp:include page="reservation-content.jsp"></jsp:include>
		</form>
		
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
	<script src="/js/reservation/reservation-validation.js"></script>
	<script src=/js/utilities/payment-utils.js></script>
</body>
</html>
