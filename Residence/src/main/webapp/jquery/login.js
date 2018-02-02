//设置一个全局变量，便于保存验证码
var code;
var codeLength = 4;
//设置随机字符
var random = new Array(0,1,2,3,4,5,6,7,8,9,
		'A','B','C','D','E','F','G','H','I','J','K','L','M',
		'N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
var codeV;
function yanzheng(){
	code = '';
	//设置验证码长度为四
	codeV = document.getElementById('code');
	//循环codeLength
	for(var i = 0;i<codeLength;i++){
		//设置随机数范围，这设置为0~36
		var index = Math.floor(Math.random()*36);
		//字符串拼接，将每次随机数的字符进行拼接
		code=code+random[index];
	}
	//将拼接好的字符串展示给codeV
	codeV.value = code;	
}

function createCode(){
	code='';
	//循环codeLength
	for(var i = 0;i<codeLength;i++){
		//设置随机数范围，这设置为0~36
		var index = Math.floor(Math.random()*36);
		//字符串拼接，将每次随机数的字符进行拼接
		code=code+random[index];
	}
	//将拼接好的字符串展示给codeV
	codeV.value = code;
}

function submitForm(){
	//获取用户输入的验证码
	 var oValue = document.getElementById('indentify').value.toUpperCase();
     if(oValue ==0){
    	 $.messager.alert('消息','请输入验证码');
     }else if(oValue != code){
    	 
         $.messager.alert('消息','验证码不正确，请重新输入');
         document.getElementById('indentify').value="";
         document.getElementById('indentify').reflush();
         createCode();    
     }else{
    	 //输入正确  
    	 $('#ff').form('submit',{url:"loginServlet",success:function(data){
    			if(parseInt(data)==1){
    				location.href="index.html";
    			}else{
    				$.messager.alert('消息','登陆失败');
    			}
    		}});
     }
    
}

function clearForm(){
	$('#ff').form('clear');
	createCode();
}