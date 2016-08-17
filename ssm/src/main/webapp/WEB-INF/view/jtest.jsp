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
    function ajaxTest(){  
        $.ajax({  
        data:"name="+$("#name").val(),

        type:"GET",  
        dataType: 'json',  
        url:"${pageContext.request.contextPath}/jtest/ajax",  
       
        success:function(data){  
            alert("处理结果:"+data.msg);  
            $("#result").html(data.msg) ;  
        } ,
        error:function(data){  
            alert("出错了！！:"+data.msg);  
        }
        });  
    }  
    
    function ajaxTest1(){  
        $.ajax({  


        type:"GET",  
        data:$('#ff').serialize(),// 你的formid
        url:"${pageContext.request.contextPath}/jtest/ajax",  
        async: false,
        success:function(data){  
            alert("处理结果:"+data.msg);  
            $("#result").html(data.msg) ;  
        } ,
        error:function(data){  
            alert("出错了！！:"+data.msg);  
        }
        });  
    }  
    
    $(document).ready(function(){ 
    	$("#uName").change(function(){	
    	$.post("${pageContext.request.contextPath}/jtest/a", { uName: $("#uName").val()} ,
    			function(data){$("#output").text(data.msg);
    			}); 
    	}); 
    	}); 
</script>  
</head>  
<body>  
    <input type="text" name="name" id="name"/>  

    <input type="submit" value="登录" onclick="ajaxTest();"/>  
    <div id="result"></div>  
    
    <div>
    <form id="ff">
    <input type="text" name="name1" id="name1"/>  <br>
     <input type="text" name="pass" id="pass"/>  
      <input type="submit" value="登录" onclick="ajaxTest1();"/>
    </form>
    </div>
    
    <br>
    
    <div id="reg"> 
  <font size="4" color="blue"><b>注册</b></font> 
  <form name="form1" action="" method="post"> 
  用户名：<input type="text" name="uName" id="uName">&nbsp;<font id="output"></font><p>  
  </form> 
  </div> 
</body>  
</html>  