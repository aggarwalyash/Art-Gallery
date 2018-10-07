<%--
  Created by IntelliJ IDEA.
  User: yash
  Date: 19/7/18
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"></jsp:include>


<body>

<jsp:include page="navigation.jsp"></jsp:include>


<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-login">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-12">
                            <a href="#" class="active" id="login-form-link">Upload</a>
                        </div>
                    </div>
                    <hr>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form id="login-form" action="/upload" method="post" role="form" style="display: block;" enctype="multipart/form-data">
                                <div class="form-group">
                                    <input type="text" name="title" id="title" tabindex="1" class="form-control" placeholder="Title" value="">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="description" id="description" tabindex="2" class="form-control" placeholder="Description">
                                </div>
                                <div class="form-group">
                                    <label for="category">Category List:</label>
                                    <select name="category" id="category" class="form-control">
                                        <option value="1">Painting</option>
                                        <option value="2">Sculpture</option>
                                        <option value="3">Print Making</option>
                                        <option value="4">New Media</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <input type="file" name="file" id="file" class="form-control" size="60">
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-sm-6 col-sm-offset-3">
                                            <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Upload">
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<%-------------------------------------------------------------%>
<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>
