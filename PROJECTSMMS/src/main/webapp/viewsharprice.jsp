<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Share Trading</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        #header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }

        #menu {
            background-color: #666;
            padding: 10px;
            text-align: center;
        }

        #menu ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }

        #menu ul li {
            display: inline-block;
            margin-right: 10px;
        }

        #menu ul li a {
            color: #fff;
            text-decoration: none;
            padding: 5px 10px;
        }

        #content {
            margin: 20px;
        }

        h1 {
            color: #333;
            text-align: center;
            margin-top: 30px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table th,
        table td {
            border: 1px solid #333;
            padding: 10px;
            text-align: center;
        }

        table th {
            background-color: #333;
            color: #fff;
        }

        a {
            color: #0066cc;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <div id="header">
        <h1>Online Share Trading</h1>
    </div>
    <div id="menu">
        <ul>
            <li><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
            <li><a href="about.jsp" accesskey="2" title="">About Us</a></li>
            <li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
        </ul>
    </div>
    <div id="content">
        <a href="#"><font size="3" color="blue">Back</font></a>
        <h1><u>Share Details</u></h1>
        <center>
            <table>
                <tr>
                    <th>Company Name</th>
                    <th>No. of Share</th>
                    <th>Share Amount</th>
                    <th>Share Price</th>
                </tr>
                <tr>
                    <td><s:property value="companyname" /></td>
                    <td><s:property value="noofshare" /></td>
                    <td><s:property value="shareamount" /></td>
                    <td><s:property value="shareprice" /></td>
                </tr>
            </table>
        </center>
    </div>
</body>
</html>
