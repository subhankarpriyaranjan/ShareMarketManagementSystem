<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Online Share Trading</title>
    <link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
    <link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
    <style>
        /* CSS styles for unique design */
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        #header {
            background-color: #333;
            color: #fff;
            padding: 10px;
        }

        #header h1 {
            margin: 0;
        }

        #menu {
            background-color: #666;
            margin: 0;
            padding: 0;
            text-align: right; /* Align the menu to the right */
        }

        #menu ul {
            list-style: none;
            margin: 0;
            padding: 0;
        }

        #menu ul li {
            display: inline;
        }

        #menu ul li a {
            color: #fff;
            display: block;
            padding: 10px 20px;
            text-decoration: none;
        }

        #page {
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            max-width: 800px;
            border: 1px solid #ccc;
        }

        #footer {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div id="header">
        <h1>ONLINE SHARE TRADING</h1>
    </div>
    <div id="menu">
        <ul>
            <li><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
            <li><a href="#" accesskey="2" title="">Login</a></li>
            <li><a href="about.jsp" accesskey="3" title="">About Us</a></li>
            <li><a href="contactus.jsp" accesskey="4" title="">Contact Us</a></li>
        </ul>
    </div>
    <div id="page">
        <a href="customermngt.jsp">Back</a>
        <h1>Delete Company</h1>
        <table>
            <s:form action="deletecompany">
                <tr>
                    <td>
                      
		<s:select label="CHOOSE COMPANY" name="loginid" headerKey="-1" list="MapForSelect" headerValue="---please select---" >
		</s:select>
		</tr></td>
		<tr><td>
                        <s:submit value="Submit" name="submit" />
                    </td>
                </tr>
            </s:form>
        </table>
    </div>
    <div id="footer"></div>
</body>
</html>
