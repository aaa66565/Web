<%-- 
    Document   : login
    Created on : 2023-3-31, 14:11:35
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="ckeditor/ckeditor.js" type="text/javascript"></script>
        <script>
            CKEDITOR.replace("content")
            function checkTitle(){
                var title = document.getElementById("title");
                var divTitle = document.getElementById("divTitle");
                divTitle.innerHTML="";
                if(title.value==""|title.value.length>60){
                    divTitle.innerHTML = "标题不能为空,也不能太长";
                    return false;
                }
            }
            function checkContent(){
                var content = document.getElementById("content");
                var divContent = document.getElementById("divContent");
                divTitle.innerHTML="";
                if(title.value==""|title.value.length>60){
                    divTitle.innerHTML = "标题不能为空,也不能太长";
                    return false;
                }
            }
        </script>
        <style>
         * {
             margin: 0;
             padding: 0;
             list-style: url("pre.gif") outside circle;
         }


         .whole {
             overflow: hidden;
             width: 95%;
             height: auto;
             margin: 0 auto;
             /* background-color: pink; */
         }

         .logo {
             width: 95%;
             height: 70px;
             /* background-color: #fff; */
             /* margin: 0 auto; */
             /* background-color: skyblue; */
         }

         .navigation {
             width: 95%;
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
             width: 20%-3px;
             height: 500px;
             /* margin: 0 auto; */
             /* background-color: green; */
             border-right: 3px solid #999999;

         }

         .right {
             /*display: flex;*/
             float: left;
             width: 75%;
             height: auto;
             /*flex-wrap:wrap;*/
             background-color:  #00f;
 /*          margin: 0 auto; 
             background-color: orange; */
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
             width: 100%;
             height: auto;
             background-color:#0f0;

             /*display: flex;*/
             justify-content: center;
             align-items: center;

         }

         .mainBotton {
             /* background-color: #F30; */
             width: 100%;
             height: auto;
             background-color:#19AAD8;
             display: flex;
             justify-content: center;
             align-items: center;
             /*flex-wrap:wrap;*/
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
             width: 100%;
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
<!--        <div class="navigation">
            <table width="950">
                <tr>
                    <td>你好</td>
                    <td>你好</td>
                    <td>你好</td>
                    <td>你好</td>
                </tr>
            </table>
        </div>-->
        <div class="left">
            <table  border="" class="tiezi">
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
            
            <form method="post" action="AddTopicServlet">
            <div class="mainTop">
                <table border="3px" class="xinxi">
                    <tr>
                        <th colspan="2">发帖</th>
                    </tr>
                    <tr>
                        <td>标题</td>
                        <td>
                            <input type="text" name="title" id="title" size="30" onblur="return checkTitle()">
                            <font color="red"<div id="divTitle"/>
                        </td>
                    </tr>
                    <tr>
                        <td>内容</td>
                        <td>
                            <textarea name="content" id="content" rows="15" cols="45" class="ckeditor" onblur="return checkContent()"></textarea>
                            <font color="red"<div id="divPassworld1"/>

                        </td>
                    </tr>
                    
                    
                </table>
                    
</div>
            <div class="mainBotton">
                <button type="reset">重置</button>
                &nbsp
                &nbsp
                <button type="submit">登录</button>
            </div>
                </form>
        </div>
<!--        <div class="tail"></div>-->

    </div>

   
</body>
</html>

