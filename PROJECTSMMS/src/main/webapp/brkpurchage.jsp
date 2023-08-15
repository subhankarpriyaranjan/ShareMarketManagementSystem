	<%@ page language="java" import="java.util.*, p1.loginaction, com.opensymphony.xwork2.ActionContext" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
   String path = request.getContextPath();
   String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8" />
    <title>Online Share Trading</title>
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300' rel='stylesheet' type='text/css' />
    <style>
        /* Styles for the new design */
        body {
            font-family: 'Roboto', sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        #header {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
        }

        #logo {
            font-size: 24px;
            font-weight: bold;
        }

        #menu {
            margin-top: 20px;
        }

        #menu ul {
            list-style-type: none;
            padding: 0;
            margin: 0;
            text-align: center;
        }

        #menu ul li {
            display: inline;
            margin: 0 10px;
        }

        #menu ul li a {
            color: #333;
            text-decoration: none;
            font-size: 16px;
        }

        #banner {
            text-align: center;
            margin: 20px 0;
        }

        #page {
            background-color: #fff;
            padding: 20px;
            margin: 0 auto;
            width: 80%;
            max-width: 900px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        table th, table td {
            padding: 10px;
            border: 1px solid #ccc;
        }

        table th {
            background-color: #f2f2f2;
            font-weight: bold;
        }

        .no-data {
            text-align: center;
            padding: 20px;
            font-style: italic;
        }
    </style>
</head>
<body>
    <div id="header">
        <div id="logo">Online Share Trading</div>
        <div id="menu">
            <ul>
                <li><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
                <li><a href="about.jsp" accesskey="2" title="">About Us</a></li>
                <li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
            </ul>
        </div>
    </div>
    <div id="banner">
        <img src="images/anigif.gif" width="800" height="400" alt="" />
    </div>
    <div id="page">
        <a href="#"><font size="3" color="blue">Back</font></a>
        <h1><u><font size="6" color="brown">COMPANY DETAILS</font></u></h1>
        <center>
            <table>
                <tr>
                    <th>Company Name</th>
                    <th>Share Amount</th>
                    <th>Customer Name</th>
                    <th>Process It</th>
                </tr>
                
                <% 
                   Map<String, Object> sess = ActionContext.getContext().getSession();
                   ArrayList<loginaction> alist = (ArrayList<loginaction>) sess.get("purchaserequest");
                   if (alist != null && !alist.isEmpty()) {
                      for (int i = 0; i < alist.size(); i++) {
                %>
                
                <tr>
                    <td><%= alist.get(i).getCompanyname() %></td>
                    <td><%= alist.get(i).getShareamount() %></td>
                    <td><%= alist.get(i).getCustomername() %></td>
                    <td>
                        <a href="purchaseprocess?companyname=<%= alist.get(i).getCompanyname() %>&shareamount=<%= alist.get(i).getShareamount() %>&customername=<%= alist.get(i).getCustomername() %>&reqid=<%= alist.get(i).getReqid() %>&companyid=<%= alist.get(i).getCompanyid() %>&customerid=<%= alist.get(i).getCustomerid() %>&brokerid=<%= alist.get(i).getBrokerid() %>">
                            Process
                        </a>
                    </td>
                </tr>
                <% 
                      }
                   } else {
                %>
                <tr>
                    <td colspan="4" class="no-data">No data available.</td>
                </tr>
                <% 
                   }
                %>
            </table>
        </center>
    </div>
</body>
</html>
