<%@ page import="mypack.UserInfoBean" %>
<%@ page import="mypack.GalleryBean" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yash
  Date: 22/7/18
  Time: 3:28 AM
  To change this template use File | Settings | File Templates.
--%>

<jsp:include page="header.jsp"></jsp:include>

    <body>
    <jsp:include page="navigation.jsp"></jsp:include>

    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="panel panel-login">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-12">
                                <a href="#" id="register-form-link">MyProfile</a>
                            </div>
                        </div>
                        <hr>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <%UserInfoBean user = (UserInfoBean) request.getAttribute("user");%>
                               <p>Name: <%=user.getFirstName()%></p>
                                <p>Email: <%=user.getEmail()%></p>
                                <p>Username: <%=user.getUserName()%></p>
                                <p>Phone: <%=user.getPhone()%></p>
                                <p>Gender: <%=user.getGender()%></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

    <% ArrayList<GalleryBean> gallery = (ArrayList<GalleryBean>) request.getAttribute("gallery");%>

    <div class="col-md-2"></div>
            <div class="col-md-6">
                <div class="row">
                  <%  for(GalleryBean gal: gallery) {  %>
                        <div class="col-md-6">
                            <img src="<%=gal.getDestination()%>" height="200px" width="250px" class="img-responsive">
                        </div>
                    <% } %>
                </div>
            </div>
        </div>
    </div>


    <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>