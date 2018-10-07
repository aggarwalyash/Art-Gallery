<%--
  Created by IntelliJ IDEA.
  User: yash
  Date: 22/7/18
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>

<jsp:include page="header.jsp"></jsp:include>

<body>

<jsp:include page="navigation.jsp"></jsp:include>

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
                <a class="navbar-brand" href="#">Art Attack</a>
            </div>
            <div class="col-md-7 col-md-offset-3" id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li><a href="#">Home</a></li>
                    <li><a href="#contact">Exhibition</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="contact.html">Contact Us</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Login/SingUp<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Login</a></li>
                            <li><a href="#">SignUp</a></li>

                        </ul>
                    </li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </nav>
</section>
<section>
    <img style="width:100%;height:400px;" id="image" src="http://mywordout.com/photos/slider3.jpg" class="img-responsive">
</section>
<div class="sect-padding">
</div>
<section>
    <div class="container">
        <div class="col-md-8">
            <h2>Google Map </h2>
            <div>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d437.2361619900177!2d77.49783821577864!3d28.752722049424516!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xf5c6d6eefa89a5df!2sKIET+Group+of+Institutions!5e0!3m2!1sen!2sin!4v1531896008544" width="745" height="345" frameborder="0" style="border:0" allowfullscreen></iframe>
            </div>
        </div>
        <div class="col-md-4">
            <h2>MEET HERE</h2>
            <div class="addr">
                <h3>Address :-</h3>
                <p><i class="fa fa-map-marker"></i><span>Kiet Group of Institution, Ghaziabad u.p 201206</span></p>
                <h3>Contact No :-</h3>
                <p><i class="fa fa-phone"></i><span>+91-8882065182</span></p>
                <h3>Email Id :-</h3>
                <p><i class="fa fa-envelope-o"></i><span>info@artattact.in</span></p>
                <h3>Website :-</h3>
                <p><i class="fa fa-globe"></i><span>www.artattact.in</span></p>

            </div>
        </div>
    </div>
</section>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>