<%@ page language="java" import="java.util.*, p1.loginaction, com.opensymphony.xwork2.ActionContext" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <title>Company Details</title>
    <link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
    <link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
    <link href="default.css" rel="stylesheet" type="text/css" media="all" />
    <!--[if IE 6]>
    <link href="default_ie6.css" rel="stylesheet" type="text/css" />
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
                    <li><a href="about.jsp" accesskey="2" title="">About Us</a></li>
                    <li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div id="banner"><img src="images/anigif.gif" width="1120" height="500" alt="" /></div>
    <div id="page-wrapper">
        <div id="page">
            <a href="#"><font size="3" color="blue">Back</font></a>
            <h1><u><font size="6" color="brown">COMPANY DETAILS</font></u></h1>
            <center>
                <table border="1">
                    <tr>
                        <td>Company Name</td>
                        <td>Share Amount</td>
                        <td>Customer Name</td>
                        <td>Process It</td>
                    </tr>
                    <%
                        Map<String, Object> sess = ActionContext.getContext().getSession();
                        ArrayList<loginaction> alist = (ArrayList<loginaction>) sess.get("salerequest");
                        if (alist != null) {
                            for (int i = 0; i < alist.size(); i++) {
                                loginaction action = alist.get(i);
                    %>
                    <tr>
                        <td><%= action.getCompanyname() %></td>
                        <td><%= action.getShareamount() %></td>
                        <td><%= action.getCustomername() %></td>
                        <td><a href="saleprocess?companyname=<%= action.getCompanyname() %>&shareamount=<%= action.getShareamount() %>&customername=<%= action.getCustomername() %>&reqid=<%= action.getReqid() %>&companyid=<%= action.getCompanyid() %>&customerid=<%= action.getCustomerid() %>&brokerid=<%= action.getBrokerid() %>">Process</a></td>
                    </tr>
                    <%
                            }
                        } else {
                            out.println("<tr><td colspan='4'>No items available for sale.</td></tr>");
                        }
                    %>
                </table>
            </center>
        </div>
    </div>
</div>
<div id="footer-wrapper"><br /></div>
</body>
</html>
