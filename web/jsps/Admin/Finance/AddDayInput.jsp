<%--
  Created by IntelliJ IDEA.
  User: spzn
  Date: 16-4-13
  Time: 下午8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  %>
  <meta name="viewpo<%@ page contentType="text/html;charset=UTF-8" language="java" %>rt" content="width=device-width, initial-scale=1">
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <title>Aligo-Admin-财务管理/查看每月收支/查看每月盈亏</title>
  <link href="<%=basePath%>resource/css/bootstrap.min.css" rel="stylesheet">
  <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
  <script src="<%=basePath%>resource/js/bootstrap.min.js"></script>
  <link href="<%=basePath%>resource/css/style.css" rel="stylesheet">
  <link href="<%=basePath%>resource/css/theme.css" rel="stylesheet">
  <link href="<%=basePath%>resource/css/pointOut.css" rel="stylesheet">
  <!--[if lt IE 9]>
  <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body>

<div class="container">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
      <span class="sr-only">切换导航</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">Aligo&nbsp;&nbsp;&nbsp;阿里学习加油站&nbsp;&nbsp;</a>
  </div>
  <div class="navbar-collapse collapse">
    <ul class="nav navbar-nav">
      <li class="dropdown"><a href="#ad-carousel">课程管理</a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">座位管理 <span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#feature-tab" data-tab="tab-chrome">查看座位资源</a></li>
          <li><a href="#feature-tab" data-tab="tab-firefox">维护座位资源</a></li>
        </ul>
      </li>
      <li class="active">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">财务管理 <span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="admin_GetPALInfo.action" data-tab="tab-chrome">查看每月收支</a></li>
          <li><a href="admin_GetDayIncome.action" data-tab="tab-firefox">每日收支管理</a></li>
          <li><a href="admin_GetSalary.action">薪资管理</a></li>
          <li><a href="admin_GetClassConsume.action" data-tab="tab-chrome">课消及提成管理</a></li>
          <li><a href="admin_Payment.action" data-tab="tab-firefox">课程收费标准管理</a></li>
        </ul>
      </li>

    </ul>

    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
           aria-expanded="false">教务管理员：Admin<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">消息</a></li>
          <li><a href="#">设置</a></li>
          <li><a href="#">查看更多</a></li>
          <li role="separator" class="divider"></li>
          <li><a href="#">退出</a></li>
        </ul>
      </li>
    </ul>

  </div>
</div>
</div>


<div id="second">
  <ul class="nav nav-tabs" role="tablist">
    <li><a href="admin_GetPayInfo.action">查看每月支出</a></li>
    <li class="active"><a href="admin_GetDayIncome.action">每日收支管理</a></li>
    <li><a href="admin_GetSalary.action">薪资管理</a></li>
    <li><a href="admin_GetClassConsume.action">课消及提成管理</a></li>
    <li><a href="admin_Payment.action">课程收费标准管理</a></li>
  </ul>
</div>

<div class="tab-content">
  <div class="tab-pane active" id="A">
    <div id="third">
      <ul class="nav nav-pills">
        <li role="presentation" class="active"><a href="admin_GetDayIncome.action">每日收入管理</a></li>
        <li role="presentation"><a href="admin_GetDayOutput.action">每日支出管理</a></li>
        <div  style="text-align: right;">
          <button type="submit" class="btn btn-default">新增</button>
        </div>
      </ul>
    </div>
  </div>
</div>

  <form action="feedbackSubmit" method="get" class="formstyle">

    <div class="row">
      <div class="col-lg-6">
        <label for="StationNo">站点编号</label>
        <input type="text" class="form-control" placeholder="日期站点编号">
      </div>
      <div class="col-lg-6">
        <label for="StationNo">站点</label>
        <input type="text" class="form-control" placeholder="日期站点">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <label for="StationNo">付款人ＩＤ</label>
        <input type="text" class="form-control" placeholder="付款人ＩＤ">
      </div>
      <div class="col-lg-6">
        <label for="StationNo">时间</label>
        <input type="text" class="form-control" placeholder="时间">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <label for="StationNo">类别</label>
        <input type="text" class="form-control" placeholder="类别">
      </div>
      <div class="col-lg-6">
        <label for="StationNo">品名</label>
        <input type="text" class="form-control" placeholder="品名">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <label for="StationNo">缴费金额</label>
        <input type="text" class="form-control"  placeholder="缴费金额">
      </div>
      <div class="col-lg-6">
        <label for="StationNo">手续费</label>
        <input type="text" class="form-control" placeholder="手续费">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <label for="StationNo">实际收入</label>
        <input type="text" class="form-control" placeholder="实际收入">
      </div>
      <div class="col-lg-6">
        <label for="StationNo">余额</label>
        <input type="text" class="form-control" placeholder="余额">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <label for="StationNo">交易类型</label>
        <input type="text" class="form-control" placeholder="交易类型">
      </div>
      <div class="col-lg-6">
        <label for="StationNo">有无发票</label>
        <input type="text" class="form-control" placeholder="有无发票">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-6">
        <label for="StationNo">经手人ＩＤ</label>
        <input type="text" class="form-control" placeholder="经手人ＩＤ">
      </div>
      <div class="col-lg-2 col-lg-offset-2" style="padding-top:20px">
        <button type="submit" class="btn btn-default">新增</button>
      </div>
    </div>
  </form>
</div>
<div class="tab-pane" id="E">
  <div id="last">
    <hr class="dicider">
    <footer>
      <p class="pull-right">© 2013 educubeglobal.com All rights reserved. 闽ICP备11025855号-1.</p>

      <p>学立方全球服务网&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp学立方素质教育网&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp学立方卓越网</p>
    </footer>
  </div>
</div>
</body>
</html>
