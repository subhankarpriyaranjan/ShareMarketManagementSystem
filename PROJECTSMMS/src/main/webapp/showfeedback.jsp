<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="p1.loginaction" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Feedback Details - Online Share Trading</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
        }
        
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }
        
        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 20px;
        }
        
        .logo {
            font-size: 24px;
            font-weight: bold;
            color: #333;
        }
        
        .menu {
            display: flex;
        }
        
        .menu li {
            list-style: none;
            margin-left: 20px;
        }
        
        .menu a {
            color: #333;
            text-decoration: none;
            font-size: 14px;
            font-weight: bold;
        }
        
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        
        th,
        td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        
        th {
            background-color: #f2f2f2;
        }
        
        a {
            color: #0066cc;
            text-decoration: none;
        }
        
        a:hover {
            text-decoration: underline;
        }
        
        .error-message {
            color: red;
            margin-top: 20px;
            text-align: center;
        }
        
        .footer {
            margin-top: 50px;
            text-align: center;
            font-size: 12px;
            color: #777;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <div class="logo">ONLINE SHARE TRADING</div>
            <ul class="menu">
                <li><a href="homepage.jsp">Homepage</a></li>
                <li><a href="about.jsp">About Us</a></li>
                <li><a href="contactus.jsp">Contact Us</a></li>
            </ul>
        </div>
        <table>
            <tr>
                <th>Sender ID</th>
                <th>Subject</th>
                <th>Date of Post</th>
                <th>View Feedback</th>
                <th>Reply</th>
            </tr>
            <%
            Map session1 = ActionContext.getContext().getSession();
            ArrayList<loginaction> al = (ArrayList<loginaction>) session1.get("a");
            if (al != null) {
                for (int i = 0; i < al.size(); i++) {
            %>
            <tr>
                <td><%= al.get(i).getLoginid() %></td>
                <td><%= al.get(i).getSubject() %></td>
                <td><%= al.get(i).getDateofpost() %></td>
                <td>
                    <a href="viewfb?id=<%= al.get(i).getLoginid() %>">View</a>
                </td>
                <td>
                    <a href="reply?id=<%= al.get(i).getLoginid() %>">Reply</a>
                </td>
            </tr>
            <%
                }
            }
            %>
        </table>
        <p class="error-message"><s:property value="msg" /></p>
        <div class="footer">
            &copy; 2023 Online Share Trading. All rights reserved.
        </div>
    </div>
</body>
</html>
