<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<!-- <link rel="icon" href="./fa.ico" type="image/x-icon" /> -->
<link type="image/x-icon" rel="shortcut icon" href="./fa.ico" />
<!-- 引入bootstrap -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<script src="static/js/jquery.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">  
<title>Insert title here</title>  
<script type="text/javascript">  
    
    $(document).ready(function(){ 
    	$("#name1").change(function(){	
    	$.post("${pageContext.request.contextPath}/jqueryajax/a", { myname: $("#name1").val()} ,
    			function(data){$("#output").text(data.msg);
    			}); 
    	}); 
    	}); 
</script>  
</head>  
<body>  

    
    <br>
    
    <div id="reg"> 
  <font size="4" color="blue"><b>注册</b></font> 
  <form name="form1" action="" method="post"> 
  用户名：<input type="text" name="name1" id="name1">&nbsp;<font id="output"></font><p>  
  </form> 
  </div> 
</body>  
</html>  