<%--
  Created by IntelliJ IDEA.
  User: yash
  Date: 21/7/18
  Time: 11:41 PM
  To change this template use File | Settings | File Templates.
--%>
<section>
    <div class="container-fluid footer">
        <div class="container">

            <div class="col-md-6">
                <h2>About Us</h2>
                <p style="color: #353333b8;">We are a group of undergrads bringing out this platform for everyone. We aren't experts in art but we believe in art but we believe there's an artist in each one of us. Our goal is to let artists from across the world showcase their amazing works.</p>
            </div>
            <div class="col-md-3">
                <h2>Links</h2>
                <ul class="imp_lin">
                    <li><a href="/">Home</a></li>
                    <%--<li><a href="/aboutus">About Us</a></li>--%>
                    <li><a href="/upload">Upload</a></li>
                </ul>
            </div>

            <div class="col-md-3">
                <h2 style="padding-left: 28px;">Follow Us</h2>
                <ul class="social-network social-circle">
                    <li><a href="https://www.facebook.com/" class="icoFacebook" title="Facebook"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#" class="icoTwitter" title="Twitter"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#" class="icoGoogle" title="Google +"><i class="fa fa-google-plus"></i></a></li>
                    <li><a href="#" class="icoLinkedin" title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="container-fluid term">
        <div class="container">
            <p>© 2018 Art Attack - Legal Disclaimer - Privacy Statement</p>
        </div>
    </div>

</section>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<script src="plugin/owl.carousel/owl-carousel/owl.carousel.min.js"></script>
<script>
    $(document).ready(function() {

        $("#owl-demo").owlCarousel();

    });
</script>

