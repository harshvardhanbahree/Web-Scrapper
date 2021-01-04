<html>
<head>
	<title>Web Scrapper</title>
	<meta name= viewport content= "width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link href="https://fonts.googleapis.com/css?family=Flamenco" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
div.listWrapper {
    max-height:100px;
    overflow-y:auto;
}
</style>
<body>

	<header>
		<nav>
			<div class="row clearfix">

				<ul class="main-nav animated slideInDown" id="check-class">
					<li><a href="movie.jsp">Movies</a></li>
					<li><a href="corona.jsp">Corona Count</a></li>
					<li><a href="amazonProduct.jsp">Amazon Products</a></li>
					
				</ul>
				<a href="#" class="mobile-icon"  onclick="slideshow()"> <i class="fa fa-bars"></i> </a>
			</div>
			
		</nav>
</header>