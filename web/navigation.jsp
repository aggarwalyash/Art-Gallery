<%--
  Created by IntelliJ IDEA.
  User: yash
  Date: 21/7/18
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>


<section>
    <nav class="navbar navbar-fixed-top">
        <div class="container">
            <div class="col-md-2 navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/">Art Attack</a>
            </div>
            <div class="col-md-7 col-md-offset-3" id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li><a href="/">Home</a></li>
                    <li><a href="/exhibition">Exhibition</a></li>
                    <%--<li><a href="/about">About</a></li>--%>
                    <li><a href="/upload">Upload</a></li>
                    <li><a href="contactus.jsp">Contact Us</a> </li>

                </ul>
                <% if (session.getAttribute("username") == null) { %>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/login">Login/Register</a></li>
                    <%--<li class="dropdown">--%>
                    <%--<a href="/" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Login/SignUp<span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                    <%--<li><a href="/login">Login</a></li>--%>
                    <%--<li><a href="/register">Register</a></li>--%>
                    <%--</ul>--%>
                    <%--</li>--%>
                </ul>
                <% } else {%>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="/" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Welcome, <%= session.getAttribute( "username" ).toString().toUpperCase() %><span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/myprofile">MyProfile</a> </li>
                            <li><a href="/logout">Logout</a> </li>
                        </ul>
                    </li>
                    <%--<li><a href="/logout">Logout</a></li>--%>
                </ul>
                <% } %>

            </div><!--/.nav-collapse -->
        </div>
    </nav>
</section>

