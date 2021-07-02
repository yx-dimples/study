<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>教师学生信息管理系统</title>
    <script src=".//layui/layui.js"></script>
    <link rel="stylesheet" href=".//layui/css/layui.css" media="all">
</head>
<body>
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo layui-hide-xs layui-bg-black">教师学生信息管理系统</div>
    <!-- 头部区域（可配合layui 已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <!-- 移动端显示 -->
      <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">
        <i class="layui-icon layui-icon-spread-left"></i>
      </li>
      
      <li class="layui-nav-item layui-hide-xs"><a href="">控制台</a></li>
      <li class="layui-nav-item layui-hide-xs"><a href="">商品管理</a></li>
      <li class="layui-nav-item layui-hide-xs"><a href="">用户</a></li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item layui-hide layui-show-md-inline-block">
        ${name}
      </li>
      <li class="layui-nav-item layui-hide layui-show-md-inline-block">
        <a href="LoginServlet">退出</a>
      </li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree" lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">主要功能</a>
          <dl class="layui-nav-child">
            <dd><a href="/layui-javaweb/allStudent.jsp">学生列表</a></dd>
            <dd><a href="/layui-javaweb/allTeacher.jsp">教师列表</a></dd>
            <dd><a href="/layui-javaweb/addStudent.html">添加学生</a></dd>
            <dd><a href="/layui-javaweb/addTeacher.html">添加教师</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <!-- <div style="padding: 15px;"></div> -->
    <iframe src="" id="main" height="100%" width="100%" ></iframe>
  </div>
   <div class="layui-footer">
    ©2021 admin 
  </div>
</div>
<script>
layui.use('element', function () {
	/*
	* element模块的实例
	* 返回的element变量为该实例的对象，携带一些用于元素操作的基础方法
	*/
	var element = layui.element
    var $ = layui.jquery
    // $(document).ready()是DOM结构绘制完毕后就执行，不必等到加载完毕。 
    $(document).ready(function(){
      $('dd>a').click(function (e){
    	  // 取消事件的默认动作。
        e.preventDefault();
    	  // 会在当前聚焦/点击的元素中获得href的属性.
        $('#main').attr("src", $(this).attr("href"))
      })
    })
  })
</script>
</body>
</html>