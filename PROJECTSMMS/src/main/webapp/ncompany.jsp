<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"   %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
  <title>Company Registration</title>
  <style>
    body {
      background-image: url('path_to_your_background_image.jpg');
      background-size: cover;
      font-family: Arial, sans-serif;
      color: #fff;
    }

    #header {
      background-color: #333;
      padding: 10px;
    }

    #header h1 {
      margin: 0;
      font-size: 28px;
      color: #fff;
    }

    #menu {
      background-color: #444;
      padding: 10px;
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
      text-decoration: none;
      padding: 5px 10px;
    }

    #banner {
      text-align: center;
      margin-top: 20px;
    }

    #page {
      background-color: rgba(0, 0, 0, 0.7);
      padding: 20px;
    }

    table {
      color: #000;
      width: 100%;
    }

    table td {
      padding: 5px;
    }

    input[type="text"], input[type="password"], textarea {
      width: 100%;
      padding: 5px;
    }

    input[type="submit"] {
      background-color: #ff0000;
      color: #fff;
      padding: 5px 10px;
      border: none;
      cursor: pointer;
    }

    .error-message {
      color: #ff0000;
      font-size: 14px;
      margin-top: 5px;
    }
  </style>
</head>
<body>
  <div id="header">
    <h1>ONLINE SHARE TRADING</h1>
  </div>
  <div id="menu">
    <ul>
      <li><a href="homepage.jsp" accesskey="1">Homepage</a></li>
      <li><a href="#" accesskey="2">Login</a></li>
      <li><a href="about.jsp" accesskey="3">About Us</a></li>
      <li><a href="contactus.jsp" accesskey="4">Contact Us</a></li>
    </ul>
  </div>
  <div id="banner">
    <img src="https://www.kotaksecurities.com/uploads/104_933x280_a7ab2e67f0.jpg" width="1120" height="500" alt="" />
  </div>
  <div id="page">
    <h1><i>COMPANY REGISTRATION</i></h1>
    <table>
      <s:form action="newcompany" onsubmit="return validateForm()">
        <tr>
          <td><s:textfield name="companyname" label="COMPANY NAME"></s:textfield></td>
        </tr>
        <tr>
          <td><s:textfield name="username" label="USERNAME"></s:textfield></td>
        </tr>
        <tr>
          <td><s:password name="password" label="PASSWORD"></s:password></td>
        </tr>
        <tr>
          <td><s:textarea name="address" label="ADDRESS"></s:textarea></td>
        </tr>
        <tr>
          <td><s:textfield name="city" label="CITY"></s:textfield></td>
        </tr>
        <tr>
          <td><s:textfield name="officeno" label="OFFICE NO."></s:textfield></td>
        </tr>
        <tr>
          <td><s:textfield name="faxno" label="FAX NO."></s:textfield></td>
        </tr>
        <tr>
          <td><s:textfield name="email" label="EMAIL ID"></s:textfield></td>
        </tr>
        <tr>
          <td><s:textfield name="website" label="WEBSITE"></s:textfield></td>
        </tr>
        <tr>
          <td>
            <s:select label="SECURITY QUESTION" name="securityquestion" list="{'place of birth', 'your home town', 'your favourite food', 'your favourite color'}" headerValue="---please select---"></s:select>
          </td>
        </tr>
        <tr>
          <td><s:textfield name="answer" label="ANSWER"></s:textfield></td>
        </tr>
        <tr>
          <td colspan="2" align="right">
            <s:submit value="REGISTER"></s:submit>
          </td>
        </tr>
      </s:form>
      <tr>
        <td><s:property value="msg"/></td>
      </tr>
    </table>
  </div>
  <script>
    function validateForm() {
      var companyName = document.forms["m"]["companyname"].value;
      if (companyName === "") {
        alert("Error: Company name cannot be blank!");
        document.forms["m"]["companyname"].focus();
        return false;
      }
      // Add validations for other fields here
      
      return true;
    }
  </script>
</body>
</html>
