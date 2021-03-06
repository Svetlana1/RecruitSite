<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Google New reCaptcha using Java</title>
</head>
<script src='https://www.google.com/recaptcha/api.js'></script>
<style type='text/css'>
.field {
    padding: 0 0 10px 0;
}

.label {
    padding: 3px 0;
    font-weight: bold;
}
</style>

<body>
    <div style="text-align: center">
        <h1>Google reCaptcha using Java</h1>
    </div>
    <div style="width: 400px; margin: auto">
        <form action="${CONTEXT }/registration.php?id=${user.id}">
            <h3>Registration Form</h3>
            <div class="field">
                <div class="label">Enter Name</div>
                <input value="" name="name" />
            </div>

            <div class="field">
                <div class="label">Enter Email</div>
                <input name="email" />
            </div>

            <div class="g-recaptcha" data-sitekey="6LeJOAMTAAAAANmQEQ7EZRm2VCygd0bkjPMWuh-D"></div>
            <div class="field">
                <input type="submit" value="submit" />
            </div>

        </form>
    </div>
</body>
</html>
