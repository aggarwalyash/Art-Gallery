<%@ page import="java.util.ArrayList" %>
<%@ page import="mypack.GalleryBean" %><%--
  Created by IntelliJ IDEA.
  User: yash
  Date: 22/7/18
  Time: 1:19 AM
  To change this template use File | Settings | File Templates.
--%>


<jsp:include page="header.jsp"></jsp:include>
<body>
<jsp:include page="navigation.jsp"></jsp:include>


<section>
    <div class="container-fluid gal-container">
        <h2 style="text-align: center;">Art Attack</h2>
        <% int id = 0;%>
        <% ArrayList<GalleryBean> gallery = (ArrayList<GalleryBean>) request.getAttribute("gallery");
            for(GalleryBean gal: gallery) { id++; %>

            <div class="col-md-4 col-sm-6 co-xs-12 gal-item">
                <div class="box">
                    <a href="#" data-toggle="modal" data-target="#<%=id%>">
                        <img src="<%=gal.getDestination()%>">
                    </a>
                    <div class="modal fade" id="<%=id%>" tabindex="-1" role="dialog">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                                <div class="modal-body">
                                    <img src="<%=gal.getDestination()%>">
                                </div>
                                <div class="col-md-12 description">
                                    <h4><%=gal.getDescription()%> - By <%=gal.getUsername()%></h4>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        <% } %>

    </div>
</section>


<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
