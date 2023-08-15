<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<link href='http://fonts.googleapis.com/css?family=Roboto:400,300' rel='stylesheet' type='text/css' />
<style>
    body {
        font-family: 'Roboto', sans-serif;
        background: url(https://images.moneycontrol.com/static-mcnews/2020/06/market-cap-770x433.jpg) no-repeat center center fixed;
        background-size: cover;
        margin: 0;
        padding: 0;
    }

    #wrapper {
        padding: 20px;
    }

    #header {
        text-align: center;
        margin-bottom: 20px;
    }

    #logo {
        font-size: 24px;
        font-weight: bold;
        margin-bottom: 10px;
    }

    #menu ul {
        list-style-type: none;
        padding: 0;
        margin: 0;
        text-align: center;
        color: #fff;
    }

    #menu ul li {
        display: inline;
        margin-right: 10px;
        color: #fff;
    }

    #menu ul li a {
        color: #fff;
        text-decoration: none;
    }

    #page {
        margin-top: 20px;
        text-align: center;
    }

    #page h1 {
        color: #000;
        font-size: 36px;
        margin-bottom: 20px;
       
    }
    

    #page ul {
        
        color: blue;
        padding-left: 0;
        text-align: left;
         text-align: center;
    }

    #page ul li {
     
        margin-bottom: 10px;
         text-align: center;
    }

    #page ul li a {
     
        font-size: 18px;
        color: blue;
        text-decoration: none;
        text-align: center;
    }

   
</style>
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <div id="logo">
                <h1><a href="#">ONLINE SHARE TRADING</a></h1>
            </div>
            <div id="menu">
                <ul>
                    <li class="current_page_item"><a href="home.jsp" accesskey="1" title="">Homepage</a></li>
                    <li><a href="about.jsp" accesskey="2" title="">About Us</a></li>
                    <li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
                    <li><a href="login.jsp" accesskey="4" title="">Log Out</a></li>
                </ul>
            </div>
        </div>
        <div id="page">
            <h1><u><font size="6" color="white">ADMIN HOME PAGE</font></u></h1>
            <ul>
                <li><a href="companymngt.jsp"><u><font size="5" color="white">COMPANY MANAGEMENT</font></u></a></li>
                <li><a href="brokermngt.jsp"><u><font size="5" color="white">BROKER MANAGEMENT</font></u></a></li>
                <li><a href="customermngt.jsp"><u><font size="5" color="white">CUSTOMER MANAGEMENT</font></u></a></li>
                <li><a href="feedback.jsp"><u><font size="5" color="white">FEEDBACK</font></u></a></li>
                <li><a href="tips.jsp"><u><font size="5" color="white">TIPS OF THE DAY</font></u></a></li>
       
            </ul>
        </div>
        
</body>
</html>
