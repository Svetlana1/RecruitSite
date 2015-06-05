<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/include/head.jspf"%>
<%@page import="javax.servlet.jsp.jstl.core.Config"%>


<head>
<style type="text/css">

/* Profile container */
.profile {
	margin: 20px 0;
}

/* Profile sidebar */
.profile-sidebar {
	padding: 20px 0 10px 0;
	background: #fff;
}

.profile-userpic img {
	float: none;
	margin: 0 auto;
	width: 50%;
	height: 50%;
	-webkit-border-radius: 50% !important;
	-moz-border-radius: 50% !important;
	border-radius: 50% !important;
}

.profile-usertitle {
	text-align: center;
	margin-top: 20px;
}

.profile-usertitle-name {
	color: #5a7391;
	font-size: 16px;
	font-weight: 600;
	margin-bottom: 7px;
}

.profile-usertitle-job {
	text-transform: uppercase;
	color: #5b9bd1;
	font-size: 12px;
	font-weight: 600;
	margin-bottom: 15px;
}

.profile-userbuttons {
	text-align: center;
	margin-top: 10px;
}

.profile-userbuttons .btn {
	text-transform: uppercase;
	font-size: 11px;
	font-weight: 600;
	padding: 6px 15px;
	margin-right: 5px;
}

.profile-userbuttons .btn:last-child {
	margin-right: 0px;
}

.profile-usermenu {
	margin-top: 30px;
}

.profile-usermenu ul li {
	border-bottom: 1px solid #f0f4f7;
}

.profile-usermenu ul li:last-child {
	border-bottom: none;
}

.profile-usermenu ul li a {
	color: #93a3b5;
	font-size: 14px;
	font-weight: 400;
}

.profile-usermenu ul li a i {
	margin-right: 8px;
	font-size: 14px;
}

.profile-usermenu ul li a:hover {
	background-color: #fafcfd;
	color: #5b9bd1;
}

.profile-usermenu ul li.active {
	border-bottom: none;
}

.profile-usermenu ul li.active a {
	color: #5b9bd1;
	background-color: #f6f9fb;
	border-left: 2px solid #5b9bd1;
	margin-left: -2px;
}

/* Profile Content */
.profile-content {
	padding: 20px;
	background: #fff;
	min-height: 460px;
}
</style>
</head>


<div class="col-md-3">
	<div class="profile-sidebar">
		<!-- SIDEBAR USERPIC -->
		<div class="profile-userpic">
			<img
				src="http://keenthemes.com/preview/metronic/theme/assets/admin/pages/media/profile/profile_user.jpg"
				class="img-responsive" alt="">
		</div>
		<!-- END SIDEBAR USERPIC -->
		<!-- SIDEBAR USER TITLE -->
		<div class="profile-usertitle">
			<div class="profile-usertitle-name">${user.name}</div>
			<div class="profile-usertitle-name">${user.lastName}</div>
			<div class="profile-usertitle-job">Developer</div>
		</div>
		<!-- END SIDEBAR USER TITLE -->
		<!-- SIDEBAR BUTTONS -->
		<div class="profile-userbuttons">
			<button type="button" class="btn btn-success btn-sm">Follow</button>
			<button type="button" class="btn btn-danger btn-sm">Message</button>
		</div>
		<!-- END SIDEBAR BUTTONS -->
		<!-- SIDEBAR MENU -->
		<div class="profile-usermenu">
			<ul class="nav">
				<li class="active"><a
					href="${CONTEXT }/employee/home.php#signupbox"> <i
						class="glyphicon glyphicon-home"></i>
					<fmt:message key="CreateResume" />
				</a></li>
				<li><a href="${CONTEXT }/employee/showResume.php"> <i
						class="glyphicon glyphicon-user"></i> <fmt:message
							key="ShowResume" />
				</a></li>
				<li><a href="${CONTEXT }/employee/home.php#signupbox"
					target="_blank"> <i class="glyphicon glyphicon-ok"></i> <fmt:message
							key="EditResume" />
				</a></li>
				<li><a href="${CONTEXT}/registration.php#signupbox"> <i
						class="glyphicon glyphicon-flag"></i> <fmt:message
							key="EditProfile" />
				</a></li>
				<li><a href="${CONTEXT }/recruit.php"> <i
						class="glyphicon glyphicon-flag"></i> <fmt:message key="Exit" />
				</a></li>

			</ul>
		</div>
		<!-- END MENU -->
	</div>
</div>



