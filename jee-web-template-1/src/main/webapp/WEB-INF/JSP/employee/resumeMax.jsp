
<!DOCTYPE html>
<html>
<head>
<title>Thomas Hardy - Curriculum Vitae</title>

<meta name="viewport" content="width=device-width"/>
<meta name="description" content="The Curriculum Vitae of Thomas Hardy a Frontend Web Developer based in Newcastle upon Tyne (UK)."/>
<meta charset="UTF-8"> 

<link rel="shortcut icon" href="favicon.ico" />

<link type="text/css" rel="stylesheet" href="${CONTEXT }/resources/css/style_resume.css">
<link href='http://fonts.googleapis.com/css?family=Rokkitt:400,700|Lato:400,300' rel='stylesheet' type='text/css'>

<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
</head>
<body id="top">
<section id="cv" class="instaFade">
	<div class="mainDetails">
		<div id="headshot" class="quickFade">
			<img src="${CONTEXT }/resources/img/headshot.png" alt="Thomas Hardy" />
		</div>
		
		<div id="name">
			<h1 class="quickFade delayTwo">Thomas Hardy</h1>
			<h2 class="quickFade delayThree">Frontend Web Developer</h2>
		</div>
		
		<div id="contactDetails" class="quickFade delayFour">
			<ul>
				<li>e: <a href="mailto:thomas@thomashardy.me.uk" target="_blank">thomas@thomashardy.me.uk</a></li>
				<li>w: <a href="http://www.thomashardy.me.uk">www.thomashardy.me.uk</a></li>
				<li>m: 07772088007</li>
			</ul>
		</div>
		<div class="clear"></div>
	</div>
	
	<div id="mainArea" class="quickFade delayFive">
		<div class="section firstSection">
			<div class="sectionTitle">
				<h1>Personal Profile</h1>
			</div>
			
			<div class="sectionContent">
				<p>I'm a Web Developer with a passion for the Internet and the digital world which began at a very young age when I dabbled with creating websites using HTML. Since then I have been hooked on creating elegant, usable and effective websites.</p>
			</div>
			<div class="clear"></div>
		</div>
		
		
		<div class="section">
			<div class="sectionTitle">
				<h1>Work Experience</h1>
			</div>
			
			<div class="sectionContent">
				<h2>Frontend Web Developer at Union Room</h2>
				<p class="subDetails">August 2012 - Present</p>
				<p>I currently work as a frontend web developer.</p>
			
				<h2>Web Developer at Urban River Creative</h2>
				<p class="subDetails">April 2011 - August 2012</p>
				<p>I worked as a web developer at Urban River Creative where I built and maintained a large variety of websites from simple brochure websites to large e-commerce websites.</p>
				
				<h2>Freelance Web Developer</h2>
				<p class="subDetails">April 2007 - Present</p>
				<p>I have been a freelance web developer since 2007 and during that time I have worked with a variety of different clients ranging from sole-traders to large businesses.</p>
			</div>
			<div class="clear"></div>
		</div>
		
		
		<div class="section">
			<div class="sectionTitle">
				<h1>Key Skills</h1>
			</div>
			
			<div class="sectionContent">
				<ul class="keySkills">
					<li>HTML5</li>
					<li>CSS3</li>
					<li>PHP</li>
					<li>MySql</li>
					<li>AJAX</li>
					<li>jQuery</li>
					<li>JavaScript</li>
					<li>WordPress</li>
					<li>Responsive Design</li>
				</ul>
			</div>
			<div class="clear"></div>
		</div>
		
		
		<div class="section">
			<div class="sectionTitle">
				<h1>Education</h1>
			</div>
			
			<div class="sectionContent">
				<h2>Northumbria University</h2>
				<p class="subDetails">Web Design and Development BSc(Honours)</p>
				<p>I graduated from Northumbria University in 2011 with a First Class Degree in Web Design and Development.</p>
			</div>
			<div class="clear"></div>
		</div>
	</div>
</section>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
jQuery(document).ready(function($) {
 
	$(".scroll").click(function(event){		
		event.preventDefault();
		$('html,body').animate({scrollTop:$(this.hash).offset().top}, 750);
	});
});
</script>
<script type="text/javascript">
var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
</script>
<script type="text/javascript">
var pageTracker = _gat._getTracker("UA-3753241-1");
pageTracker._initData();
pageTracker._trackPageview();
</script>
</body>
</html>