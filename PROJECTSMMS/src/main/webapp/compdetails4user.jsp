<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online SHARE Trading</title>
    <link href="https://fonts.googleapis.com/css?family=Oswald:400,300" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Abel|Satisfy" rel="stylesheet">
    <link href="default.css" rel="stylesheet" type="text/css" media="all">
    <style>
        /* Add your custom CSS styles here */
        body {
            font-family: Arial, sans-serif;
            background-image: url("https://static.vecteezy.com/system/resources/thumbnails/019/640/149/small/digital-marketing-concept-business-man-analyzing-internet-marketing-online-business-planning-online-digital-business-online-stock-market-analysis-stock-chart-upward-trend-digital-stock-trading-photo.jpg");
            background-repeat: no-repeat;
            background-size: cover;
            margin: 0;
            padding: 0;
        }

        #header {
            background-color: #333;
            color: #fff;
            padding: 20px;
        }

        #logo {
            float: left;
        }

        #menu {
            float: right;
            color: #fff;
        }

        #menu ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            color: #fff;
        }

        #menu ul li {
            display: inline;
            margin-right: 10px;
        }

        #menu ul li a {
            color: white; /* Change link color to white */
            text-decoration: none;
        }

        #banner {
            text-align: center;
            padding: 20px;
        }

        #page {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
        }

        table {
            width: 100%;
        }

        th, td {
            padding: 10px;
        }

        input[type="text"], textarea {
            width: 100%;
            padding: 5px;
        }

        input[type="submit"] {
            background-color: #333;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #555;
        }

        a {
            color: #fff;
        }
    </style>
</head>
<body>
    <div id="header">
        <div id="logo">
            <h1><a href="#">Online SHARE Trading</a></h1>
        </div>
        <div id="menu">
            <ul>
                <li><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
                <li><a href="companydetails.jsp" accesskey="2" title="">Login</a></li>
                <li><a href="about.jsp" accesskey="3" title="">About Us</a></li>
                <li><a href="contactus.jsp" accesskey="4" title="">Contact Us</a></li>
            </ul>
        </div>
    </div>
    <div id="banner">
        <img src="https://static.vecteezy.com/system/resources/thumbnails/019/640/149/small/digital-marketing-concept-business-man-analyzing-internet-marketing-online-business-planning-online-digital-business-online-stock-market-analysis-stock-chart-upward-trend-digital-stock-trading-photo.jpg" width="1120" height="500" alt="">
    </div>
    <div id="page">
        <a href="#"><font size="3" color="blue">Back</font></a><br><br>
        <center>
            <h1><u><font size="6" color="brown">COMPANY DETAILS</font></u></h1>
        </center>
        <s:form action="compdetail">
            <center>
                <table>
                    <tr>
                        <td>Company Name</td>
                        <td><input type="text" name="companyname" placeholder="Company Name"></td>
                    </tr>
                    <tr>
                        <td>Share Amount</td>
                        <td><input type="text" name="shareamount" placeholder="Share Amount"></td>
                    </tr>
                    <tr>
                        <td>No. Of Share</td>
                        <td><input type="text" name="noofshare" placeholder="No. Of Share"></td>
                    </tr>
                    <tr>
                        <td>Share Price</td>
                        <td><input type="text" name="shareprice" placeholder="Share Price"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="right">
                            <input type="submit" value="Submit">
                        </td>
                    </tr>
                </table>
            </center>
        </s:form>
    </div>
</body>
</html>
