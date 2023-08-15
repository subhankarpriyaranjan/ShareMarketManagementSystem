<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Global Share Market</title>
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300' rel='stylesheet' type='text/css'>
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        #header {
            background-color: #333;
            color: #fff;
            padding: 20px;
        }

        #logo {
            font-size: 24px;
            font-weight: bold;
        }

        #menu {
            margin-top: 10px;
        }

        #menu ul {
            list-style-type: none;
            padding: 0;
            margin: 0;
        }

        #menu ul li {
            display: inline;
            margin-right: 10px;
        }

        #menu ul li a {
            color: #fff;
            text-decoration: none;
        }

        #banner {
            background-color: #555;
            text-align: center;
            padding: 100px 0;
        }

        #banner h1 {
            color: #fff;
            font-size: 36px;
            margin: 0;
        }

        #page {
            background-color: #fff;
            padding: 20px;
            text-align: center;
        }

        #footer {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div id="header">
        <div id="logo">
            <h1>GLOBAL SHARE MARKET</h1>
        </div>
        <div id="menu">
            <ul>
                <li class="current_page_item"><a href="home.jsp" accesskey="1" title="">Homepage</a></li>
                <li><a href="aboutus.jsp" accesskey="2" title="">About Us</a></li>
                <li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
            </ul>
        </div>
    </div>
    <div id="banner">
        <h1>Welcome to Global Share Market</h1>
    </div>
    <div id="page">
        <h1><u>About Us</u></h1>
        
        <p> Welcome to Global Share Market, the premier online destination for investors and traders seeking reliable information and powerful tools to navigate the global financial markets. Our web application is designed to provide you with a comprehensive platform to analyze, monitor, and engage with various share markets around the world.</p>
        <form action="loginaction" method="post">
            <!-- Form fields go here -->
        </form>
    </div>
    
</body>
</html>
