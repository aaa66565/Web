<%-- 
    Document   : reg
    Created on : 2023-3-27, 14:27:21
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <style>
        * {
            margin: 0;
            padding: 0;
            list-style: url("pre.gif") outside circle;
        }


        .whole {
            overflow: hidden;
            width: 950px;
            height: auto;
            margin: 0 auto;
            /* background-color: pink; */
        }

        .logo {
            width: 950px;
            height: 70px;
            /* background-color: #fff; */
            /* margin: 0 auto; */
            /* background-color: skyblue; */
        }

        .navigation {
            width: 950px;
            height: 50px;
            /* margin: 0 auto; */
            background-color: #ccc;
            /* 居中 */
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .left {
            float: left;
            width: 197px;
            height: 500px;
            /* margin: 0 auto; */
            /* background-color: green; */
            border-right: 3px solid #999999;

        }

        .right {
            float: left;
            width: 100px;
            height: 500px;
            /* margin: 0 auto; */
            /* background-color: orange; */


        }

        .tail {
            float: left;
            width: 100%;
            height: 50px;

            display: flex;
            justify-content: center;
            align-items: center;
            /* margin: 0 auto; */
            /* background-color: yellow; */
        }

        img {
            width: 100%;
            height: 100%;
        }

        .navigation ul li {
            float: left;
            text-align: center;
            width: 237.5px;
            height: 100px;
            /* background-color: blue; */

        }

        .mainTop {
            /* background-color: #9c0; */
            width: 850px;
            height: 400px;

            display: flex;
            justify-content: center;
            align-items: center;

        }

        .mainBotton {
            /* background-color: #F30; */
            width: 850px;
            height: 50px;

            display: flex;
            justify-content: center;
            align-items: center;
        }

        th {
            padding: 8px;
            background-color: pink;
        }

        td {
            padding: 8px;
        }

        tr {
            text-align: center;
        }

        .tiezi {
            width: 100%;
        }

        table {
            border-spacing: 0;
        }

        .xinxi {
            width: 600px;
        }

        button {
            padding: 8px;
        }
       </style>
    </head>
    <body>
    <div class="whole">
        <div class="logo">
            <img src="真.png" alt="">
        </div>
        <!-- 导航 -->
        <div class="navigation">
            <table width="950">
                <tr>
                    <td>你好</td>
                    <td>你好</td>
                    <td>你好</td>
                    <td>你好</td>
                </tr>
            </table>
        </div>
        <div class="left">
            <table width="100px" border="" class="tiezi">
                <tr>
                    <th>热帖榜</th>
                </tr>
                <tr>
                    <td>2</td>
                </tr>
                <tr>
                    <td>3</td>
                </tr>
                <tr>
                    <td>4</td>
                </tr>
                <tr>
                    <td>4</td>
                </tr>
                <tr>
                    <td>5</td>
                </tr>
                <tr>
                    <td>6</td>
                </tr>
            </table>
        </div>
        <div class="right">
            
            <form method="post" action="RegServlet">
            <div class="mainTop">
                <table border="3px" class="xinxi">
                    <tr>
                        <th colspan="2">注册信息</th>
                    </tr>
                    <tr>
                        <td>用户名</td>
                        <td>
                            <input type="text" name="userName" id="userName">
                            <div id="user"></div>
                        </td>
                    </tr>
                    <tr>
                        <td>密码</td>
                        <td>
                            <input type="password" name="password1" id="pasw">
                            <div id="psw"></div>
                        </td>
                    </tr>
                    <tr>
                        <td>确认密码</td>
                        <td>
                            <input type="password" name="password2" id="okpasw">
                            <div id="okpaw"></div>
                        </td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td>
                            <!-- 要给name起名字才能只选中一个 -->
                            <input type="radio" name="sex" id="sex">男
                            <input type="radio" name="sex" id="sex">女
                        </td>
                    </tr>
                    <tr>
                        <td>邮箱</td>
                        <td>
                            <input type="text" name="email" id="email">
                            <div id="myemail"></div>
                        </td>
                    </tr>
                </table>

            </div>
        

            <div class="mainBotton">
                <button type="reset">重置</button>
                &nbsp
                &nbsp
                <button type="submit">提交</button>
            </div>
                </form>
        </div>
        <div class="tail"></div>

    </div>

    <script>
        // 用户名
        var userName = document.querySelector('#userName');
        var user = document.querySelector('#user')

        // 密码
        var pasw = document.querySelector('#pasw');
        var psw = document.querySelector('#psw');

        // 确认密码
        var okpasw =document.querySelector('#okpasw');
        var okpaw = document.querySelector('#okpaw');

        // 邮箱
        var email = document.querySelector('#email');
        var myemail = document.querySelector('#myemail');

        userName.addEventListener('blur', function () {
        
            if (this.value === '') {
                user.style.color = 'red';
                user.innerHTML = '请填写信息';
            }
            else {
                user.style.color = 'green';
                user.innerHTML = '√';
            }
            // user.innerHTML = this.value
        });
        
        pasw.addEventListener('blur',function(){
            if(this.value === ''){
                psw.style.color = 'red';
                psw.innerHTML = '请输入密码'
            }
            else{
                psw.style.color = 'green';
                psw.innerHTML = '√'
            }
        })

        okpasw.addEventListener('blur',function(){
            if(this.value === pasw.value){
                okpaw.style.color = 'green';
                okpaw.innerHTML = '√'
            }
            else{
                okpaw.style.color = 'red';
                okpaw.innerHTML = '两次密码输入不一致'
            }
        }) 

        email.addEventListener('blur',function(){
            if(this.value === ''){
                myemail.innerHTML = '请输入邮箱'
                myemail.style.color = 'red'
            }
            else{
                myemail.style.color = 'green';
                myemail.innerHTML = '√'
            }
        })
    </script>
</body>
</html>
