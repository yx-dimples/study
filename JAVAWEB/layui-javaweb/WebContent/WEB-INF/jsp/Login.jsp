<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登入</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <script src=".//layui/layui.js"></script>
    <script type="text/javascript" src=".//layui/jquery.min.js"></script>
    <link rel="stylesheet" href=".//layui/css/layui.css" media="all">
    <link rel="stylesheet" href=".//style/admin.css">
    <link rel="stylesheet" href=".//style/login.css">
</head>
<body>

    <div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">

        <div class="layadmin-user-login-main">
          <div class="layadmin-user-login-box layadmin-user-login-header">
            <h2>登录界面</h2>
          </div>
          <!-- 表单 -->
          <form action="CheckLoginServlet" method="POST" class="layadmin-user-login-box layadmin-user-login-body layui-form">
           <!-- 用户名 -->
            <div class="layui-form-item">
              <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>
              <input type="text" name="name" id="name" lay-verify="required" placeholder="用户名" class="layui-input">
            </div>
            <!-- 密码 -->
            <div class="layui-form-item">
              <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
              <input type="password" name="password" id="password" lay-verify="required" placeholder="密码" class="layui-input">
            </div>
            <!-- 提示错误信息 -->
            <div>
        		<p style="color: red">${inf}</p>
        	</div>
        	<!-- 登入按钮 -->
            <div class="layui-form-item">
              <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="LAY-user-login-submit" id="login" onclick="login()">登 入</button>
            </div>
            
            <div class="layui-trans layui-form-item layadmin-user-login-other">
              <label>社交账号登入</label>
              <a href="javascript:;"><i class="layui-icon layui-icon-login-qq"></i></a>
              <a href="javascript:;"><i class="layui-icon layui-icon-login-wechat"></i></a>
              <a href="javascript:;"><i class="layui-icon layui-icon-login-weibo"></i></a>
            </div>
            
          </div>
        </form>
       	<!-- 底部 -->
        <div class="layui-trans layadmin-user-login-footer">
          
          <p>© 2021 </p>
    
        </div>
        
        
      </div>
<script>
   	layui.use('form', function(){
           var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
           //……
           //如果你的 HTML 是动态生成的，自动渲染就会失效
		   //因此你需要在相应的地方，执行下述方法来进行渲染
		   form.render();
        });      
	      
</script>
</body>
</html>
