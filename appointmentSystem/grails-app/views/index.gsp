<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="home.css"/>
    <title>Sheffield Surgeries | Home Page</title>
</head>
<body>

<div class="row">
	<asset:image src="banner"/>
</div>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Sheffield Surgeries</h1>
    </section>
</div>

<div class="first">
	<h3>Surgery Management</h3>
<p></p>
	<button type="button" class="btn btn-info">
		<g:link controller="surgery" action="create">Add Surgery</g:link>
	</button>

	<button type="button" class="btn btn-info">
		<g:link controller="surgery" action="index">View Surgeries</g:link>
	</button>
</div>

<div class="second">
	<h3>Doctor Management</h3>
<p></p>
	<button type="button" class="btn btn-info">
		<g:link controller="doctor" action="create">Add Doctor</g:link>
	</button>

	<button type="button" class="btn btn-info">
		<g:link controller="doctor" action="index">View Doctors</g:link>
	</button>
</div>

<div class="first">
	<h3>Patient Management</h3>
<p></p>
	<button type="button" class="btn btn-info">
		<g:link controller="patient" action="create">Add Patient</g:link>
	</button>

	<button type="button" class="btn btn-info">
		<g:link controller="patient" action="index">View Patients</g:link>
	</button>
</div>

<div class="second">
	<h3>Receptionist Management</h3>
<p></p>
	<button type="button" class="btn btn-info">
		<g:link controller="receptionist" action="create">Add Receptionist</g:link>
	</button>

	<button type="button" class="btn btn-info">
		<g:link controller="receptionist" action="index">View Receptionists</g:link>
	</button>
</div>

<div class="first">
	<h3>Nurse Management</h3>
<p></p>
	<button type="button" class="btn btn-info">
		<g:link controller="nurse" action="create">Add Nurse</g:link>
	</button>

	<button type="button" class="btn btn-info">
		<g:link controller="nurse" action="index">View Nurses</g:link>
	</button>
</div>

<div class="second">
	<h3>Appointment Management</h3>
<p></p>
	<button type="button" class="btn btn-info">
		<g:link controller="appointment" action="create">Add Appointment</g:link>
	</button>

	<button type="button" class="btn btn-info">
		<g:link controller="appointment" action="index">View Appointments</g:link>
	</button>
</div>

<div class="first">
	<h3>Prescription Management</h3>
<p></p>
	<button type="button" class="btn btn-info">
		<g:link controller="prescription" action="create">Add Prescription</g:link>
	</button>

	<button type="button" class="btn btn-info">
		<g:link controller="prescription" action="index">View Prescriptions</g:link>
	</button>
</div>

</body>
</html>
