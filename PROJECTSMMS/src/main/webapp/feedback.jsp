<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Online Share Trading</title>
<style>
    body {
        background-image: url('https://www.businessbusinessbusiness.com.au/wp-content/uploads/2020/08/Customer-Feedback1.png');
        background-size: cover;
        background-position: center;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    
    #header {
        position: absolute;
        top: 20px;
        right: 20px;
        text-align: right;
        color: #fff;
    }
    
    #header ul {
        list-style: none;
        margin: 0;
        padding: 0;
    }
    
    #header ul li {
        display: inline;
        margin-left: 10px;
    }
    
    #page {
        margin-top: 50px;
        text-align: left;
        color: #fff;
    }
    
    #feedback-form {
        margin: 0 auto;
        max-width: 400px;
    }
</style>
</head>
<body>
    <div id="header">
        <ul>
            <li><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
            <li><a href="about.jsp" accesskey="2" title="">About Us</a></li>
            <li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
        </ul>
    </div>
    <div id="page">
        <a href="login.jsp"><font size="3" color="blue">Back</font></a><br /><br />
        <h1>Choose Whose Feedback You Want to See...</h1><br />
        <div id="feedback-form">
            <s:form action="showfeedback1">
                <s:select label="Select Level" name="level" headerKey="-1" list="{'user','broker','company'}" headerValue="--- Please select ---" />
                <br /><br />
                <s:submit value="OK" name="ok" />
            </s:form>
        </div>
    </div>
</body>
</html>
