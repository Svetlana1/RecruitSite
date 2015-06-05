<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src='https://www.google.com/recaptcha/api.js'></script>

<div class="container">
	<div id="signupbox" style="margin-top: 50px"
		class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">Sign Up</div>
				<div
					style="float: right; font-size: 85%; position: relative; top: -10px">
					<a id="signinlink" href="${CONTEXT }/login.php#loginbox">Sign
						In</a>
				</div>
			</div>
			<div class="panel-body">
				<form id="signupform" class="form-horizontal" role="form"
					action="${CONTEXT }/registration.php?id=${user.id}" method="post">

					<div id="signupalert" style="display: none"
						class="alert alert-danger">
						<p>Error:</p>
						<span></span>
					</div>



					<div class="form-group">
						<label for="email" class="col-md-3 control-label">Email</label>
						<div class="col-md-9">
							<input type="text" class="form-control" name="email"
								placeholder="Email Address">
						</div>
					</div>

					<div class="form-group">
						<label for="firstname" class="col-md-3 control-label">First
							Name</label>
						<div class="col-md-9">
							<input type="text" class="form-control" name="name"
								placeholder="First Name">
						</div>
					</div>
					<div class="form-group">
						<label for="lastname" class="col-md-3 control-label">Last
							Name</label>
						<div class="col-md-9">
							<input type="text" class="form-control" name="lastName"
								placeholder="Last Name">
						</div>
					</div>
					<div class="form-group">
						<label for="password" class="col-md-3 control-label">Password</label>
						<div class="col-md-9">
							<input type="password" class="form-control" name="password"
								placeholder="Password">
						</div>
					</div>

					<div class="form-group">
						<label for="password" class="col-md-3 control-label">Confirm
							password</label>
						<div class="col-md-9">
							<input type="password" class="form-control"
								name="confirmPassword" placeholder="Password">
						</div>
					</div>

					<div class="form-group">
						<label for="telephone" class="col-md-3 control-label">Telephone</label>
						<div class="col-md-9">
							<input type="number" class="form-control" name="telephone"
								placeholder="Telephone">
						</div>
					</div>

					<div class="form-group">
						<label for="icode" class="col-md-3 control-label">Confirm
							that you are not a robot</label>
						<div class="col-md-9">
							<div class="g-recaptcha"
								data-sitekey="6LeJOAMTAAAAANmQEQ7EZRm2VCygd0bkjPMWuh-D"></div>
						</div>
					</div>

					<div class="form-group">
						<!-- Button -->
						<div class="col-md-offset-3 col-md-9">
						
							<button id="btn-signup" class="btn btn-info"
								type="submit">
								<i class="icon-hand-right"></i> &nbsp Sign Up
							</button>
							<span style="margin-left: 8px;">or</span>
						</div>
					</div>

					<div style="border-top: 1px solid #999; padding-top: 20px"
						class="form-group">

						<div class="col-md-offset-3 col-md-9">
							<button id="btn-fbsignup" type="button" class="btn btn-primary">
								<i class="icon-facebook"></i>   Sign Up with Facebook
							</button>
						</div>

					</div>



				</form>
			</div>
		</div>




	</div>

</div>