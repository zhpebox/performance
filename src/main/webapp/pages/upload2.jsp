<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传_2(三种上传方法)</title>
<script type="text/javascript" src="../js/jquery.v2.2.4.js"></script> 
</head>
<body>
<h1>字节流上传文件(尝试多文件)</h1>
<form name="userForm1" action="/GeneratorDataWeb/SpringMVC006/upload.do" enctype="multipart/form-data" method="POST">
    <div id="newUpload1">
        <input type="file" name="file">
        <input type="file" name="file">
    </div>
    <input type="submit" value="上传">
</form>

<form name="serForm" action="/GeneratorDataWeb/SpringMVC006/fileUpload.do" method="post"  enctype="multipart/form-data">
<h1>采用流的方式上传文件</h1>
<input type="file" name="file">
 <input type="file" name="file">
<input type="submit" value="upload"/>
</form>
 
<form name="Form2" action="/GeneratorDataWeb/SpringMVC006/fileUpload2.do" method="post"  enctype="multipart/form-data">
<h1>采用multipart提供的file.transfer方法上传文件</h1>
<input type="file" name="file">
<input type="file" name="file">
<input type="submit" value="upload"/>
</form>
 
<form id="formAjax" name="Form2" action="/GeneratorDataWeb/SpringMVC006/springUpload.do" method="post"  enctype="multipart/form-data">
<h1>使用spring mvc提供的类的方法上传文件</h1>
<input type="file" name="file">
<input type="file" name="fileA">
<input type="submit" value="upload"/>
<input type="button" onclick="submitajax()" value="ajax"/>
</form>
</body>

<script type="text/javascript">
function submitajax(){
// 	但是本方式，只能传递一般的参数，上传文件的文件流是无法被序列化并传递的。
// 	不过如今主流浏览器都开始支持一个叫做FormData的对象，有了这个FormData，我们就可以轻松地使用Ajax方式进行文件上传了。
// $.ajax({
// 	type:"POST",
// 	url:"/GeneratorDataWeb/SpringMVC006/springUpload.do",
// 	data:$("#formAjax").serialize(),
// 	async:false,
// 	contentType:false,
// 	processData:false,
// 	success:function(data){
// 		alert(data);
// 	},
// 	error:function(request){
// 		alert("Error!");
// 	}
// });
	 var formData = new FormData($( "#formAjax")[0]);  
     $.ajax({  
          url: '/GeneratorDataWeb/SpringMVC006/springUpload.do' ,  
          type: 'POST',  
          data: formData,  
          async: false,  
          cache: false,  
       // 告诉jQuery不要去设置Content-Type请求头
          contentType: false,  
       // 告诉jQuery不要去处理发送的数据
          processData: false,  
          dataType:'text', //此行不加，或者写dataType:'json',返回时候回执行error函数
          success: function (returndata) {  
              alert("O"+returndata);  
          },  
          error: function (returndata) {  
              alert("E"+returndata);  
          }  
     });  
}

function uploadJqueryFile(){
	 $.ajaxFileUpload({
         url: '/GeneratorDataWeb/SpringMVC006/springUpload.do', 
         type: 'post',
         secureuri: false, //一般设置为false
         fileElementId: 'file', // 上传文件的id、name属性名
         dataType: 'text', //返回值类型，一般设置为json、application/json
         elementIds: elementIds, //传递参数到服务器
         success: function(data, status){  
             alert(data);
         },
         error: function(data, status, e){ 
             alert(e);
         }
     });
}

</script>

</html>