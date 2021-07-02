<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>全部学生</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="./layui/css/layui.css"  media="all">
   
</head>
<body>

<table class="layui-hide" id="test" lay-filter="test"></table>

<script src=".//layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src=".//layui/jquery.min.js"></script>

<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

 <script>
layui.use('table', function(){
  
  var table = layui.table;

  //第一个实例
  table.render({  //方法指定该容器
	  elem: '#test',//指定原始表格元素选择器（推荐id选择器）
	  height: 'full-10',//容器高度
	  url:'SelectAllStudent',//数据接口
	  page: true,//开启分页
      cols: [[ //表头
    	  /*
    	  *field  设定字段名
    	  *title  设定标题名称
    	  *sort   是否允许排序（默认：false）
    	  *toolbar: '#barDemo' //指向自定义工具栏模板选择器
    	  *width  设定容器宽度
    	  */
    	  { field:'studentId', title: '学号', sort: true },
	      { field:'name', title: '姓名' },
	      { field:'sex', title: '性别' },
	      { field:'age', title: '年龄' },  
	      { field:'clazz', title: '班级'},
	      { fixed: 'right', title:'操作', toolbar: '#barDemo', width:150 }
	    ]]
  });
  
  //监听行工具事件
  table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
	  var data = obj.data;//获得当前行数据
	  // 删除
	  if(obj.event === 'del'){
		  // layer.confirm(content, options, yes, cancel) - 询问框
		  layer.confirm('确认删除学号为'+data.studentId+'的用户吗?', function (index){
				/*
				* JQuery 发送ajax 分为5步走 记住即可
				* 1 传输的 url 也就是所谓的数据往哪个地址拿数据
				* 2 type 请求的类型 比如 有post put get delete
				* 3 data data 顾名思义也就是所谓的要传输的数据给后端 如果没有可以不写
				* 4 dataType:'json' 如果Php端声明了json返回，那么js端可以不用写dataType="json";如果Php端没有声明json返回，那么js端必须写dataType="json";
				* 5 success 发送数据之后成功的回调函数
				*/
			  $.ajax({
				  url: "DeleteStu",
				  data:{studentId:data.studentId},
                  method:'get',  //POST - 向指定的资源提交要处理的数据   GET - 从指定的资源请求数据
                  contentType:'application/json',
                  success: function (res){
	            	  layer.alert("删除成功");
    			  },
                  error: function (res){
                	  layer.alert("删除失败");
                  }
			  })
			  layer.close(index)
		  })
	  }
	  // 编辑
	  else if(obj.event === 'edit'){
		  // 弹出层 layer.open({})
		  /*
		  * type - 基本层类型 
		  *  layer提供了5种层类型。可传入的值有：0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）。 若你采用layer.open({type: 1})方式调用，则type为必填项（信息框除外）
		  * title - 标题
		  * content - 内容
		  * area - 宽高
		  * maxmin - 最大最小化
		  * btn - 按钮
		  * yes - 确定按钮回调方法
		  * success - 层弹出后的成功回调方法
		  */
		  layer.open({
			  type: 2,
    	  	  title: '编辑学生信息',
    	      content:'EditStudent.html',
         	  maxmin: true,
        	  area: ['500px', '300px'],
    	      btn: ['确认', '取消'],
    	      yes: function (index, layero) {
    	    	  //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
    	    	  // .value：获取Dom标签元素的value值
    	    	  var studentId = $(layero).find('iframe')[0].contentWindow.studentId.value;
    	    	  var name = $(layero).find('iframe')[0].contentWindow.document.getElementById('name').value;
      		      var sex = $(layero).find('iframe')[0].contentWindow.document.getElementById('sex').value;
		          var age = $(layero).find('iframe')[0].contentWindow.document.getElementById('age').value;
	              var clazz = $(layero).find('iframe')[0].contentWindow.document.getElementById('clazz').value;
	              
	              //  obj.update  修改字段
	              obj.update({
	            	  'studentId': studentId,
                      'name': name,
        			  'sex': sex,
        			  'age': age,
        			  'clazz': clazz
        		  })
        		  
        	/*
			* JQuery 发送ajax 分为5步走 记住即可
			* 1 传输的 url 也就是所谓的数据往哪个地址拿数据
			* 2 type 请求的类型 比如 有post put get delete
			* 3 data data 顾名思义也就是所谓的要传输的数据给后端 如果没有可以不写
			* 4 dataType:'json' 如果Php端声明了json返回，那么js端可以不用写dataType="json";如果Php端没有声明json返回，那么js端必须写dataType="json";
			* 5 success 发送数据之后成功的回调函数
			*/
        		  $.ajax({
        			  url: 'EditStudent?studentId=' + studentId + "&name=" + name + "&sex=" + sex + "&age=" + age  + "&clazz=" + clazz ,
                      type: 'post', //POST - 向指定的资源提交要处理的数据   GET - 从指定的资源请求数据
                      contentType: 'application/json;charset="utf-8"',
                      dataType: 'text',
                      data: {
                    	  'studentId': studentId,
              			  'name': name,
             			  'sex': sex,
             			  'age': age,
             			  'clazz': clazz
             		  },
        			  success: function (res){
        				  alert("编辑成功")
        			  },
                      error: function (res){
          				  alert("编辑失败")
                      }
                 })
				//layer.close(index) - 关闭特定层
		         layer.close(index)  
		     },
		     
		     success: function (layero, index) {
		    	 var div = layero.find('iframe').contents().find('#useradmin');
		    	
		         var body = layer.getChildFrame('body', index);
		         var iframeWindow = window['layui-layer-iframe' + index]
		         body.find('#studentId').val(data.studentId)
		         body.find('#name').val(data.name)
		         body.find('#sex').val(data.sex)
		         body.find('#age').val(data.age)
		         body.find('#clazz').val(data.clazz)
		    }
      })
    }
  }) 
})
 
</script>

</body>
</html>