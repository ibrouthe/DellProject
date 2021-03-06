<%--
   Document   : index
   Created on : 08-04-2015, 02:15:23
   Author     : Gruppe 2 Silas, Thomas, Christian, Martin, Ib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "UI.PageControl"%>

<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8"/>
        <title>Login!</title>

        <link rel="stylesheet" href="css/layout.css" type="text/css" media="screen" />
        <!--[if lt IE 9]>
       <link rel="stylesheet" href="css/ie.css" type="text/css" media="screen" />
       <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
       <![endif]-->
        <script src="js/jquery-1.5.2.min.js" type="text/javascript"></script>
        <script src="js/hideshow.js" type="text/javascript"></script>
        <script src="js/jquery.tablesorter.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/jquery.equalHeight.js"></script>
        <script type="text/javascript">
            $(document).ready(function ()
            {
                $(".tablesorter").tablesorter();
            }
            );
            $(document).ready(function () {

                //When page loads...
                $(".tab_content").hide(); //Hide all content
                $("ul.tabs li:first").addClass("active").show(); //Activate first tab
                $(".tab_content:first").show(); //Show first tab content

                //On Click Event
                $("ul.tabs li").click(function () {

                    $("ul.tabs li").removeClass("active"); //Remove any "active" class
                    $(this).addClass("active"); //Add "active" class to selected tab
                    $(".tab_content").hide(); //Hide all tab content

                    var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
                    $(activeTab).fadeIn(); //Fade in the active ID content
                    return false;
                });

            });
        </script>
        <script type="text/javascript">
            $(function () {
                $('.column').equalHeight();
            });
        </script>

    </head>


    <body>

        <header id="header">
            <hgroup>
                <h1 class="site_title"><a href="index.jsp">Dell Partner Management</a></h1>
                <h2 class="section_title">Dashboard</h2><div class="btn_view_site"><a href="index.jsp">Login</a></div>
            </hgroup>
        </header> <!-- end of header bar -->

        <div class="center">
            <h1>Please login to proceed:</h1>

            <form method="post" action="PageControl" id="form">
                <p>E-Mail:</p><input type="text" name="email" value="" size="50" />
                <p>Password:</p><input type="password" name="pw" value="" size="50" />
                <br><br>
                <button name="command" value="employeeLogin">Login</button>
                <button name="command" value="employeeForgotPW">Forgot Password</button>
            </form>
        </div>
    </body>

</html>