<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>

<<style>
.panel-order {
	/* used to change default values without adding additional class */
}
.panel-order .row {
	border-bottom: 1px solid #ccc;
}
.panel-order .row:last-child {
	border: 0px;
}
.panel-order .row .col-md-1  {
	text-align: center;
	padding-top: 15px;
}
.panel-order .row .col-md-1 img {
	width: 50px;
	max-height: 50px;
}
.panel-order .row .row {
	border-bottom: 0;
}
.panel-order .row .col-md-11 {
	border-left: 1px solid #ccc;
}
.panel-order .row .row .col-md-12 {
	padding-top: 7px;
	padding-bottom: 7px; 
}
.panel-order .row .row .col-md-12:last-child {
	font-size: 11px; 
	color: #555;  
	background: #efefef;
}
.panel-order .btn-group {
	margin: 0px;
	padding: 0px;
}
.panel-order .panel-body {
	padding-top: 0px;
	padding-bottom: 0px;
}
.panel-order .panel-deading {
	margin-bottom: 0;
}
</style>
<div class="container">
	<div class="row profile">

		<jsp:include page="home_employer.jsp" flush="true" />


		<div class="panel panel-default panel-order">
			<div class="panel-heading">
				<strong>Order history</strong>
				<div class="btn-group pull-right">
					<div class="btn-group">
						<button type="button"
							class="btn btn-default btn-xs dropdown-toggle"
							data-toggle="dropdown">
							Filter history <i class="fa fa-filter"></i>
						</button>
						<ul class="dropdown-menu dropdown-menu-right">
							<li><a href="#">Active orders</a></li>
							<li><a href="#">Pending orders</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-md-1">
						<img src="//placehold.it/130" class="media-object">
					</div>
					<div class="col-md-11">
						<div class="row">
							<div class="col-md-12">
								<div class="pull-right">
									<i class="fa fa-certificate"></i> pending
								</div>
								<span><strong>The order name</strong></span> <span
									class="label label-info">group name</span><br> Quantity :
								2, cost: $323.13, <a href="#" data-toggle="modal"
									data-target="#orderModal"><small>See order detail</small></a>
							</div>
							<div class="col-md-12">
								<i class="glyphicon glyphicon-adjust"></i><i
									class="glyphicon glyphicon-align-center"></i> order made on:
								05/31/2014 by <a href="#">Jane Doe </a>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-1">
						<img src="//placehold.it/130" class="media-object">
					</div>
					<div class="col-md-11">
						<div class="row">
							<div class="col-md-12">
								<div class="pull-right">
									<i class="fa fa-certificate"></i> pending
								</div>
								<span><strong>The order name</strong></span> <span
									class="label label-info">group name</span><br> Quantity :
								12, cost: $12623.13, <a href="#" data-toggle="modal"
									data-target="#orderModal"><small>See order detail</small></a>
							</div>
							<div class="col-md-12">
								order made on: 06/12/2014 by <a href="#">Jane Doe </a>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-1">
						<img src="//placehold.it/130" class="media-object">
					</div>
					<div class="col-md-11">
						<div class="row">
							<div class="col-md-12">
								<div class="pull-right">
									<a href="#" class="btn btn-primary btn-xs"><i
										class="fa fa-certificate"></i> approve</a>
								</div>
								<span><strong>The order name</strong></span> <span
									class="label label-info">group name</span><br> Quantity :
								11, cost: $1623.13, <a href="#" data-toggle="modal"
									data-target="#orderModal"><small>See order detail</small></a>
							</div>
							<div class="col-md-12">
								order made on: 06/15/2014 by <a href="#">Jane Doe </a>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-1">
						<img src="//placehold.it/130" class="media-object">
					</div>
					<div class="col-md-11">
						<div class="row">
							<div class="col-md-12">
								<div class="pull-right">
									<i class="fa fa-certificate"></i> pending
								</div>
								<span><strong>The order name</strong></span> <span
									class="label label-info">group name</span><br> Quantity :
								4, cost: $523.13, <a href="#" data-toggle="modal"
									data-target="#orderModal"><small>See order detail</small></a>
							</div>
							<div class="col-md-12">
								order made on: 06/20/2014 by <a href="#">Jane Doe</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="panel-footer">Footer here ... ...</div>
		</div>
	</div>
</div>

