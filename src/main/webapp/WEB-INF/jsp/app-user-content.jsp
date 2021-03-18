<div class="content-wrapper">
	<div class="container-fluid">
		<div class="card mt-5">
			<div class="card-header">
				<span>Create App User</span>
			</div>
		</div>
	</div>

	<div class="card-body">
		<div class="row">
			<div class="form-group col-md-2">

				<span class="form-label"><b>User Name</b></span>
				<form:input class="form-control" placeholder="User Name"
					id="userName" name="userName" path="userName"/>


				<span class="error_form" id="fname_error_message"></span>
			</div>

			<div class="form-group col-md-2">

				<span class="form-label"><b>Full Name</b></span>
				<form:input class="form-control" placeholder="Full Name"
					id="fullName" name="fullName" path="fullName" />

				<span class="error_form" id="sname_error_message"></span>
			</div>

			<div class="form-group col-md-2">
				<span class="form-label" id="email"><b>Email</b></span>
				<form:input class="form-control" placeholder="Email" id="email"
					name="email" path="email" />
				<span class="error_form" id="email_error_message"></span>
			</div>

			<div class="form-group col-md-2">
				<span class="form-label"><b>Password</b></span>
				<form:password class="form-control" placeholder="Password"
					id="password" name="password" path="password" />
				<span class="error_form" id="password_error_message"></span>
			</div>

			<div class="form-group col-md-2">
				<span class="form-label"><b>Phone number</b></span>
				<form:input class="form-control" placeholder="Phone Number"
					id="phoneNumber" name="phoneNumber" path="phoneNumber" />
			</div>
			<div class="form-btn col-md-2">
				<form:button class="btn btn-indigo submit-btn" id="btnregister"
					name="btnregister" path="btnRegister">Register</form:button>
			</div>
		</div>

	</div>
</div>