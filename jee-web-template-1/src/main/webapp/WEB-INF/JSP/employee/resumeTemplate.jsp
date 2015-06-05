<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>

<link type="text/css" rel="stylesheet"
	href="${CONTEXT }/resources/css/style_resume.css">
<link
	href='http://fonts.googleapis.com/css?family=Rokkitt:400,700|Lato:400,300'
	rel='stylesheet' type='text/css'>

<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
</head>
<body id="top">
	<div class="container">
		<div class="row profile">

			<jsp:include page="home.jsp" flush="true" />

			<div id="cv" class="instaFade"
				style="margin-top: 0px; margin-left: 300px">
				<div class="mainDetails">
					<div id="headshot" class="quickFade">
						<img src="${CONTEXT }/resources/img/headshot.jpg" alt="Alan Smith" />
					</div>

					<div id="name">
						<h1 class="quickFade delayTwo">${user.name}</h1>
						<h1 class="quickFade delayTwo">${user.lastName }</h1>
					</div>

					<div id="contactDetails" class="quickFade delayFour">
						<ul>
							<li>email: <a href="http://www.bloggs.com">${user.email }</a></li>
							<li>tel: ${user.telephone }</li>
						</ul>
					</div>
					<div class="clear"></div>
				</div>

				<div id="mainArea" class="quickFade delayFive">

					<section>
						<div class="sectionTitle">
							<h1>Vacancy</h1>
						</div>
						<div class="sectionContent">
							<article>
								<p>${vacancy.vacancy }</p>
							</article>
						</div>

					</section>

					<section>
						<div class="sectionTitle">
							<h1>Education</h1>
						</div>
						<div class="sectionContent">
							<article>
								<p>${resume.education }</p>
							</article>
						</div>
					</section>

					<section>
						<div class="sectionTitle">
							<h1>Experience Age</h1>
						</div>
						<div class="sectionContent">
							<article>
								<p>${resume.experienceAge }ages</p>
							</article>
						</div>
					</section>

					<section>
						<div class="sectionTitle">
							<h1>Work Experience</h1>
						</div>
						<div class="sectionContent">
							<article>
								<p>${resume.workExperience }</p>
							</article>
						</div>
					</section>

					<section>
						<div class="sectionTitle">
							<h1>Qualifications</h1>
						</div>
						<div class="sectionContent">
							<article>
								<p>${resume.qualifications }</p>
							</article>
						</div>
					</section>

					<section>
						<div class="sectionTitle">
							<h1>Professional Summary</h1>
						</div>
						<div class="sectionContent">
							<article>
								<p>${resume.professionalSummary }</p>
							</article>
						</div>
					</section>

					<section>
						<div class="sectionTitle">
							<h1>Drive License</h1>
						</div>
						<div class="sectionContent">
							<article>
								<p>${resume.driveLicense }</p>
							</article>
						</div>
					</section>

					<section>
						<div class="sectionTitle">
							<h1>Knowledges</h1>
						</div>
						<div class="sectionContent">
							<c:forEach var="knowl" items="${knowledges}">
								<article>
									<p>${knowl.knowledge }</p>
								</article>
							</c:forEach>
						</div>
						<div class="clear"></div>
					</section>

					








				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl."
				: "http://www.");
		document
				.write(unescape("%3Cscript src='"
						+ gaJsHost
						+ "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
	</script>
	<script type="text/javascript">
		var pageTracker = _gat._getTracker("UA-3753241-1");
		pageTracker._initData();
		pageTracker._trackPageview();
	</script>
</body>
</html>