<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<taglib>
    <taglib-uri>/struts-tags</taglib-uri>
    <taglib-location>/WEB-INF/struts-html.tld</taglib-location>
</taglib>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New User Registration</title>
    <link href="default.css" rel="stylesheet" type="text/css" media="all"/>
    <!--[if IE 6]>
    <link href="default_ie6.css" rel="stylesheet" type="text/css"/>
    <![endif]-->
</head>
<body>
<div id="wrapper">
    <div id="header-wrapper">
        <div id="header">
            <div id="logo">
                <h1><a href="#">online SHARE trading</a></h1>
            </div>
            <div id="menu">
                <ul>
                    <li class="current_page_item"><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
                    <li><a href="login.jsp" accesskey="2" title="">Login</a></li>
                    <li><a href="about.jsp" accesskey="3" title="">About Us</a></li>
                    <li><a href="contactus.jsp" accesskey="4" title="">Contact Us</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div id="banner"><img src="images/anigif.gif" width="1120" height="500" alt=""/></div>
    <div id="page-wrapper">
        <div id="page">
            <h1><u><i>NEW USER REGISTRATION</i></u></h1>
            <table>
                <html:form action="nuser">
                    <tr>
                        <td><html:text property="firstname" label="FIRST NAME"/></td>
                    </tr>
                    <tr>
                        <td><html:text property="lastname" label="LAST NAME"/></td>
                    </tr>
                    <tr>
                        <td><html:radio property="sex" label="SEX" value="female"/> Female
                            <html:radio property="sex" value="male"/> Male
                        </td>
                    </tr>
                    <tr>
                        <td><html:textarea property="address" label="ADDRESS"/></td>
                    </tr>
                    <tr>
                        <td><html:text property="city" label="CITY"/></td>
                    </tr>
                    <tr>
                        <td><html:text property="dateofbirth" label="DATE OF BIRTH"/></td>
                    </tr>
                    <tr>
                        <td><html:text property="pincode" label="PINCODE"/></td>
                    </tr>
                    <tr>
                        <td><html:text property="email" label="EMAIL ID"/></td>
                    </tr>
                    <tr>
                        <td><html:text property="phon" label="PHONE NO."/></td>
                    </tr>
                    <tr>
                        <td>
                            <html:select property="securityquestion" label="SECURITY QUESTION">
                                <html:option value="">---please select---</html:option>
                                <html:option value="place of birth">Place of Birth</html:option>
                                <html:option value="home town">Home Town</html:option>
                                <html:option value="favorite food">Favorite Food</html:option>
                                <html:option value="favorite color">Favorite Color</html:option>
                            </html:select>
                        </td>
                    </tr>
                    <tr>
                        <td><html:text property="answer" label="ANSWER"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="right">
                            <html:submit value="REGISTER"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <html:font color="red"><html:property value="msg"/></html:font>
                        </td>
                    </tr>
                </html:form>
            </table>
        </div>
    </div>
    <div id="footer-wrapper"><br/></div>
</div>
</body>
</html>
