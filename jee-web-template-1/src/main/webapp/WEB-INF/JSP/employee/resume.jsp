<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container">
	<div class="row profile">

		<jsp:include page="home.jsp" flush="true" />

		<div id="signupbox" style="margin-top: 0px; margin-left: 90px"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">

			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Create resume</div>
					<div
						style="float: right; font-size: 85%; position: relative; top: -10px">
						<a id="signinlink" href="${CONTEXT }/employee/home.php">Home</a>
					</div>
				</div>

				<div class="panel-body">
					<form id="signupform" class="form-horizontal" role="form"
						action="${CONTEXT }/createResume.php" method="post">

						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
							<span></span>
						</div>


						<div class="form-group">
							<label for="vacancy" class="col-md-3 control-label">Vacancy</label>
							<div class="col-md-9">
								<select class="form-control" name="vacancy">
									<c:forEach items="${vacances}" var="vacancy">
										<option value="${vacancy.id }">${vacancy.vacancy }</option>
									</c:forEach>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="education" class="col-md-3 control-label">Education</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="education"
									placeholder="education">
							</div>
						</div>
						<div class="form-group">
							<label for="knowledge" class="col-md-3 control-label">Knowledge</label>
							<div class="col-md-9">

								<select class="form-control" name="knowledge"
									multiple="multiple">
									<c:forEach items="${knowledges}" var="knowledge">
										<option value="${knowledge.id }">${knowledge.knowledge }</option>
									</c:forEach>
								</select>


							</div>
						</div>

						<div class="form-group">
							<label for="driveLicense" class="col-md-3 control-label">DriveLicense</label>
							<div class="col-md-9">
								<select class="form-control" name="driveLicense">

									<option value="1">Yes</option>
									<option value="0">No</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="qualifications" class="col-md-3 control-label">Qualifications</label>
							<div class="col-md-9">
								<textarea rows="7" cols="" class="form-control"
									name="qualification" placeholder="Qualifications"></textarea>
							</div>
						</div>


						<div class="form-group">
							<label for="workExperience" class="col-md-3 control-label">Work
								Experience</label>
							<div class="col-md-9">
								<textarea rows="7" cols="" class="form-control"
									name="workExperience" placeholder="Work Experience"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label for="professionalSummary" class="col-md-3 control-label">Professional
								Summary</label>
							<div class="col-md-9">
								<textarea rows="7" cols="" class="form-control"
									name="professionalSummary" placeholder="Professional Summary"></textarea>
							</div>
						</div>

						<div class="form-group">
							<label for="experienceAge" class="col-md-3 control-label">Experience
								Age</label>
							<div class="col-md-9">
								<input type="number" class="form-control" name="experienceAge"
									placeholder="Experience Age" value="0" min="0" max="100"
									step="0.5">
							</div>
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">

								<button id="btn-signup" class="btn btn-info" type="submit">
									<i class="icon-hand-right"></i> &nbsp Create resume
								</button>

							</div>
						</div>


					</form>
				</div>
			</div>

		</div>
	</div>
</div>

