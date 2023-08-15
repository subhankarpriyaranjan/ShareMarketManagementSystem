<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ONLINE SHARE TRADING</title>
    <link href="https://fonts.googleapis.com/css?family=Oswald:400,300" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Abel|Satisfy" rel="stylesheet">
    <style>
        /* Add your custom CSS styles here */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: url('https://thumbs.dreamstime.com/b/graph-financial-growth-global-communications-binary-smart-phones-world-internet-businesspeople-press-phone-to-communica-110201549.jpg') no-repeat center center fixed;
            background-size: cover;
        }

        #header {
            background-color: rgba(0, 0, 0, 0.7);
            color: #fff;
            padding: 20px;
        }

        #logo {
            float: left;
        }

        #menu {
            float: right;
        }

        #menu ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }

        #menu ul li {
            display: inline;
            margin-right: 10px;
        }

        #menu ul li a {
            color: white; /* Change link color to white */
            text-decoration: none;
        }

        #page {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
            margin-top: 200px; /* Adjust as needed */
            width: 80%;
            margin-left: auto;
            margin-right: auto;
            border-radius: 10px;
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
            <h1><a href="#">ONLINE SHARE TRADING</a></h1>
        </div>
        <div id="menu">
            <ul>
                <li><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
                <li><a href="about.jsp" accesskey="2" title="">About Us</a></li>
                <li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
            </ul>
        </div>
    </div>
    <div id="page">
        <a href="#"><font size="3" color="blue">Back</font></a><br><br>
        <center>
            <h1><u><font size="6" color="brown">COMPANY DETAILS</font></u></h1>
        </center>
        <center>
            <form action="loginaction" method="post">
                <table>
                    <tr>
                        <td><input type="text" name="companyname" placeholder="COMPANY NAME"></td>
                    </tr>
                    <tr>
                        <td><textarea name="address" placeholder="ADDRESS"></textarea></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="dateofregd" placeholder="DATE OF REGD"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="city" placeholder="CITY"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="state" placeholder="STATE"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="officeno" placeholder="OFFICE NO."></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="faxno" placeholder="FAX NO."></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="website" placeholder="WEBSITE"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="email" placeholder="EMAIL ID"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="phon" placeholder="PHONE NO."></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="right">
                            <input type="submit" value="REJECT">
                            <input type="submit" value="APPROVE">
                        </td>
                    </tr>
                </table>
            </form>
        </center>
    </div>
</body>
</html>
