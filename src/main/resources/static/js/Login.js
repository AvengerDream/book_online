function submitUserInfo() {
    var username = $("#username").val();
    var password = $("#password").val();
    $.ajax({
        type: "post",
        url: "login/info",//向后端请求数据的url
        data: {"username":username,"password":password},
        async: false,
        success:function (data) {
            if(data.message=="success"){

                $("#mask").style.display="none";
                $("#login").style.display="none";
                $("#user").style.display="none";
                alert("登录成功,即将跳转至首页");

            }
            else
            {   alert("登录失败");
                $("#mask").style.display="block";
                $("#login").style.display="block";

            }
        }

    });


}

