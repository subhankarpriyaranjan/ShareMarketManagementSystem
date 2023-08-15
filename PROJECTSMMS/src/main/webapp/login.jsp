<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Temperate 
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20121205

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Temperate by us</title>
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Abel|Satisfy'
	rel='stylesheet' type='text/css' />
<link href="login.css" rel="stylesheet" type="text/css" media="all" />
<link href="default1.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![end-if]-->

</head>
<body>
	<div id="wrapper">
		<div id="header-wrapper">
			<div id="header">
				<div id="logo">
					<h1>
						<a href="#">Online Share Trading</a>
					</h1>
				</div>
				<div id="menu">
					<ul>
						<li class="hadder-btn"><a href="home.jsp"
							accesskey="1" title=""> Homepage </a></li>

						<li><a href="about.jsp" accesskey="2" title="" class="hadder-btn">About Us</a></li>
						<li><a href="contactus.jsp" accesskey="3" title="" class="hadder-btn">Contact
								Us</a></li>
					</ul>
				</div>
			</div>
		</div>
		</div>
		<div id="banner">
			<img src="https://cdn.pixabay.com/photo/2018/02/23/04/38/computer-3174729_1280.jpg" width="1120" height="500" alt=" " ></img>
		</div> 
		<div class="page-wrapper">
			<div id="page">
				<div class="content">
				<h1>
							
							</h1>
							</div>
						<s:form action="loginaction">
							
							
								<s:textfield name="username" label="USERNAME" class="text-feild"></s:textfield>
								
								<s:password name="password" label="PASSWORD" class="text-feild"></s:password>
					
								<s:radio name="usertype" label="USERTYPE"
										list="{'admin','user','broker','company'}" class="Radio-btn" />
								<s:submit value="login" class="secondary-button"></s:submit>
								
						</s:form>
						<s:property value="msg"/>
						</div>
					</div>
						
						<div class="new">
							<button><a href= "fpassword.jsp" class="link-btn">FORGET PASSWORD</a></button>
<button> <a href="nuser.jsp" class="link-btn">NEW USER</a></button>
<button> <a href="broker.jsp" class="link-btn">NEW BROKER</a></button>
<button> <a href="ncompany.jsp" class="link-btn" >NEW COMPANY</a></button>
			
	</div>
	
				
				<div class="sidebar">
					<h2>Business News</h2>
					<ul class="style2">
						<li class="first"><a href="#">EUROPE MARKETS: Carlsberg
								Drops As Europe Stocks Drift Lower</a></li>
						<li><a href="#">MARKET SNAPSHOT: U.S. Stock Futures Edge
								Up As Yen Falls</a></li>
						<li><a href="#">Colombia Coal Strike Enters 12th Day
								After Weekend Talks Fail</a></li>
						<li><a href="#">LONDON MARKETS: Vodafone Weighs On FTSE
								100; Miners Drop</a></li>
						<li><a href="#">Harsco Secures New $100 Million
								Multi-Year Contract for Metal Recovery to Support India's
								Largest S</a></li>

					</ul>
				</div>
		
		<div id="footer-wrapper">
			<div id="footer-content">
				<div id="fbox1">
					<h2>World Currencies</h2>
					<table border="2">
						<tr>
							<th>Currencies vs. USD</th>
							<th>$1=</th>
						</tr>
						<tr>
							<td>Canada Dollar</td>
							<td>1.0097</td>
						</tr>
						<tr>
							<td>European Euro</td>
							<td>0.7490</td>
						</tr>
						<tr>
							<td>United Kingdom Pound</td>
							<td>0.6463</td>
						</tr>
						<tr>
							<td>Japan Yen</td>
							<td>93.9150</td>
						</tr>
					</table>

				</div>
				<div id="fbox2">
					<h2>Excel StockMarket Chart</h2>
					<p>A Volume-High-Low-Close stock market chart is a type of bar
						chart or graph used primarily to show changes in the value of
						tradable assets - such as stocks - over a given period of time.</p>
					<p>
						<img src="images/img05.gif" width="500" height="200" alt="" />
					</p>

				</div>
				<div id="fbox3">
					<h2>Stock Market Related Terms</h2>
					<ul class="style3">
						<li class="first"><img src="images/img02.jpg" width="78" height="78" alt="">
								<p>An investor who believes the whole market or one
									individual stock is going to increase in price.This is the
									opposite of a Bear.</p>


								</p> <b><u> BULL & BEAR</u></b></li>
						<li><img src="images/img03.jpg" width="78" height="78" alt="">
								<p>Nullam non wisi a sem eleifend. Donec mattis libero eget
									urna.</p> <b><u>CASH</u></b></li>
						<li><img src="images/img04.jpg" width="78" height="78" alt="">
								<p>This widely used analysis tool of Price to Earnings ratio
									measures now you pay for each dollar of corporate earnings.</p> <b><u>P/E
									RATIO</u></b></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<p>
			Copyright (c) 2012 Sitename.com. All rights reserved. Design by <a
				href="http://www.freecsstemplates.org">FCT</a>. Photos by <a
				href="http://fotogrph.com/">Fotogrph</a>.
		</p>
	</div>
	
	
	

</body>
</html>
