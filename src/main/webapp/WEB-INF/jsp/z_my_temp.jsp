<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<!-- Make Reservation Card Start -->
			<div class="card card-dark col-12">
				<div class="card-header ">Reservations</div>
				<div class="card-body">
					<div class="card card-dark card-tabs">
						<div class="card-header p-0 pt-1">
							<ul class="nav nav-tabs nav-justified" id="custom-tabs-one-tab"
								role="tablist">
								<li class="nav-item"><a class="nav-link active"
									id="custom-tabs-one-home-tab" data-toggle="pill"
									href="#custom-tabs-one-home" role="tab"
									aria-controls="custom-tabs-one-home" aria-selected="true">Front
										Desk</a></li>
								<li class="nav-item"><a class="nav-link"
									id="custom-tabs-one-profile-tab" data-toggle="pill"
									href="#custom-tabs-one-profile" role="tab"
									aria-controls="custom-tabs-one-profile" aria-selected="false">Group</a>
								</li>
								<li class="nav-item"><a class="nav-link"
									id="custom-tabs-one-messages-tab" data-toggle="pill"
									href="#custom-tabs-one-messages" role="tab"
									aria-controls="custom-tabs-one-messages" aria-selected="false">Corporate</a></li>
								<li class="nav-item"><a class="nav-link"
									id="custom-tabs-one-settings-tab" data-toggle="pill"
									href="#custom-tabs-one-settings" role="tab"
									aria-controls="custom-tabs-one-settings" aria-selected="false">Online</a></li>
							</ul>
						</div>
						<div class="card-body">
							<div class="tab-content" id="custom-tabs-one-tabContent">
								<div class="tab-pane fade show active" id="custom-tabs-one-home"
									role="tabpanel" aria-labelledby="custom-tabs-one-home-tab">
									<div class="">
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<input class="form-control" type="date" required> <span
														class="form-label">Check In</span>
												</div>
											</div>
											<div class="col-sm-3">
												<div class="form-group">
													<input class="form-control" type="date" required> <span
														class="form-label">Check out</span>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2">
												<div class="form-group">
													<select class="form-control" required>
														<option value="" >no of rooms</option>
														<option>1</option>
														<option>2</option>
														<option>3</option>
													</select> <span class="select-arrow"></span> <span
														class="form-label">Rooms</span>
												</div>
											</div>
											<div class="col-md-2">
												<div class="form-group">
													<select class="form-control" required>
														<option value="" >no of adults</option>
														<option>1</option>
														<option>2</option>
														<option>3</option>
													</select> <span class="select-arrow"></span> <span
														class="form-label">Adults</span>
												</div>
											</div>
											<div class="col-md-2">
												<div class="form-group">
													<select class="form-control" required>
														<option value="" >no of children</option>
														<option>0</option>
														<option>1</option>
														<option>2</option>
													</select> <span class="select-arrow"></span> <span
														class="form-label">Children</span>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<input class="form-control" type="email"
														placeholder="Enter your Email"> <span
														class="form-label">Email</span>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<input class="form-control" type="tel"
														placeholder="Enter you Phone"> <span
														class="form-label">Phone</span>
												</div>
											</div>
										</div>
										<div class="form-btn">
											<button class="btn btn-dark submit-btn">Book Now</button>
										</div>
									</div>
								</div>
								<div class="tab-pane fade" id="custom-tabs-one-profile"
									role="tabpanel" aria-labelledby="custom-tabs-one-profile-tab">
									<div class="tab-pane fade show active" id="custom-tabs-one-home"
									role="tabpanel" aria-labelledby="custom-tabs-one-home-tab">
									<div class="">
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<input class="form-control" type="date" required> <span
														class="form-label">Check In</span>
												</div>
											</div>
											<div class="col-sm-3">
												<div class="form-group">
													<input class="form-control" type="date" required> <span
														class="form-label">Check out</span>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-2">
												<div class="form-group">
													<select class="form-control" required>
														<option value="">no of rooms</option>
														<option>1</option>
														<option>2</option>
														<option>3</option>
													</select> <span class="select-arrow"></span> <span
														class="form-label">Rooms</span>
												</div>
											</div>
											<div class="col-md-2">
												<div class="form-group">
													<select class="form-control" required>
														<option value="">no of adults</option>
														<option>1</option>
														<option>2</option>
														<option>3</option>
													</select> <span class="select-arrow"></span> <span
														class="form-label">Adults</span>
												</div>
											</div>
											<div class="col-md-2">
												<div class="form-group">
													<select class="form-control" required>
														<option value="" >no of children</option>
														<option>0</option>
														<option>1</option>
														<option>2</option>
													</select> <span class="select-arrow"></span> <span
														class="form-label">Children</span>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<input class="form-control" type="email"
														placeholder="Enter your Email"> <span
														class="form-label">Email</span>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<input class="form-control" type="tel"
														placeholder="Enter you Phone"> <span
														class="form-label">Phone</span>
												</div>
											</div>
										</div>
										<div class="form-btn">
											<button class="btn btn-dark submit-btn">Book Now</button>
										</div>
									</div>
								</div>
								</div>
								<div class="tab-pane fade" id="custom-tabs-one-messages"
									role="tabpanel" aria-labelledby="custom-tabs-one-messages-tab">
									3</div>
								<div class="tab-pane fade" id="custom-tabs-one-settings"
									role="tabpanel" aria-labelledby="custom-tabs-one-settings-tab">2
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- card -->
			</div>
			<!-- Make Reservation Card End -->
</head>
<body>

</body>
</html>



<!-- 

<div class="row">

		<div class="form-group col-md-2">
			<label for="gender">Gender</label> <select name="Gender"
				class="form-control">
				<option value="">Select Gender</option>
				<option value="male">Male</option>
				<option value="female">Female</option>

			</select>

		</div>

		<div class="form-group col-md-2">
			<label for="date">Date Of Birth</label> <input type="date"
				placeholder="Date of Birth" name="dob" class="form-control" />


		</div>
		<div class="form-group col-md-3">
			<label for="age">Age</label> <input type="text" name="age"
				placeholder="Age" class="form-control" />


		</div>
		<div class="form-group col-md-3">
			<label for="ageunit">Age Unit</label> <select name="age unit"
				class="form-control">
				<option value="">Select Age Unit</option>
				<option value="yrs">Yrs</option>
				<option value="months">Months</option>
			</select>
		</div>

	</div>

	<div class="row">

		<div class=" card-body form-group col-md-3">
			<label for="mobile">Mobile</label> <input type="text" name="mobile"
				placeholder="Mobile" class="form-control" />
		</div>

		<div class="card-body form-group col-md-3">
			<label for="civilstatus">Civil Status</label> <select
				name="civil status" class="form-control">
				<option value="">Select Civil Status</option>
				<option value="single">Single</option>
				<option value="married">Married</option>
			</select>
		</div>

		<div class="card-body form-group col-md-3">
			<label for="nationality">Nationality:</label> <select
				name="nationality" class="form-control">
				<option value="">Select Nationality</option>
				<option value="india">India</option>
				<option value="UAE">UAE</option>
			</select>
		</div>
		<div class="row">
			<div class="card-body form-group col-md-3">
				<label for="nationalIdType">National Id Type:</label> <select
					name="nationalityidtype" class="form-control">
					<option value="">Select National Id Type</option>
					<option value="iqama">Iqama</option>
					<option value="passport">Passport</option>
				</select>
			</div>
			<div class=" card-body form-group col-md-3">
				<label for="nationalityIdNumber">Nationality Id:</label> <input
					type="text" name="nationalityIdNumber" id="nationalityIdNumber"
					placeholder="Nationality Id" class="form-control" />
			</div>

			<div class="card-body form-group col-md-3 ">
				<input class="fileupload b30000" id="fileInput" name="fileInput"
					type="file" file-model="myFile" />
			</div>


		</div>
 -->
 
 <!-- Removed Content from Booking Selection Content -->
 <div class="tab-content" id="custom-tabs-one-tabContent">
			<div class="tab-pane fade show active" id="custom-tabs-one-home"></div>
			
			
			
</div>			
			

		<div class="row">
			<div class="card w-75 p-3"><jsp:include
					page="guestprofilecontent.jsp"></jsp:include></div>
			<div class="card w-75 p-3"><jsp:include
					page="booking_selection_content.jsp"></jsp:include></div>
					
					
					<!-- GuestProfile Start-->
					<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>PMS Guest Profile</title>
<jsp:include page="css.jsp"></jsp:include>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">

		<!-- Preloader -->
		<div
			class="preloader flex-column justify-content-center align-items-center">
			<img class="animation__shake" src="dist/img/AdminLTELogo.png"
				alt="AdminLTELogo" height="60" width="60">
		</div>

		
			
		<!-- Main Sidebar Container  start-->
		<jsp:include page="sideNavigation.jsp"></jsp:include>

		<!-- Side bar end -->

		<!-- Content Wrapper start -->
	<jsp:include page="guestprofilecontent.jsp"></jsp:include>

		<!-- Content Wrapper end -->

		<jsp:include page="dashboardContent.jsp"></jsp:include>

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
					<!-- GuestProfile End -->
	
