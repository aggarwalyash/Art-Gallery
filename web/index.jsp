<%--
  Created by IntelliJ IDEA.
  User: yash
  Date: 14/7/18
  Time: 12:28 PM
  To change this template use File | Settings | File Templates.
--%>

<jsp:include page="header.jsp"></jsp:include>
<body>

<jsp:include page="navigation.jsp"></jsp:include>

<section style="margin-top: 0px;">
  <div>
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
      </ol>

      <!-- Wrapper for slides -->
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img src="img/slider-bg-1.jpg" alt="Slider-1">
          <div class="carousel-caption">
            <h2>&quot;Creativity is intelligence having fun&quot;</h2>
            <p>We would love to see your responses and wish you love your experience with ArtAttack.Go explore!</p>
          </div>
        </div>
        <div class="item">
          <img src="img/slider-bg-2.jpg" alt="slider-2">
          <div class="carousel-caption">
            <h2>"Art is my life and my life is art."</h2>
          </div>
        </div>
        <div class="item">
          <img src="img/slider-bg-3.jpg" alt="slider-3">
          <div class="carousel-caption">
            <h2>"Art speaks where words are unable to explain."</h2>
          </div>
        </div>

        <!--
        <div class="item">
          <img src="img/slider-bg-4.jpg" alt="slider-4">
          <div class="carousel-caption">
            <h2>"Creativity is contagious,pass it on."</h2>
          </div>
        </div>-->
      </div>

      <!-- Controls -->
      <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  </div>
</section>
<section>
  <div class="container">
    <h2 style="text-align:center;">Latest ARTs</h2>
    <div id="owl-demo">
      <div class="item">
        <div class="img-rect">
          <img src="/uploadFiles/yash/29.jpg" class="img-responsive">
        </div>
      </div>

      <div class="item">
        <div class="img-rect">
          <img src="/uploadFiles/yash/21.jpg" class="img-responsive">
        </div>
      </div>

      <div class="item">
        <div class="img-rect">
          <img src="/uploadFiles/yash/31.jpg" class="img-responsive">
        </div>
      </div>

      <div class="item">
        <div class="img-rect">
          <img src="/uploadFiles/yash/23.jpg" class="img-responsive">
        </div>
      </div>

      <div class="item">
        <div class="img-rect">
          <img src="/uploadFiles/yash/20.jpg" class="img-responsive">
        </div>
      </div>

      <div class="item">
        <div class="img-rect">
          <img src="/uploadFiles/yash/25.jpg" class="img-responsive">
        </div>
      </div>

      <div class="item">
        <div class="img-rect">
          <img src="/uploadFiles/yash/29.jpg" class="img-responsive">
        </div>
      </div>
    </div>
  </div>
</section>


<!--Our Team-->
<!-- Team -->
<!-- Team -->
<!--end------------->
<%@ include file = "footer.jsp" %>

</body>
</html>
