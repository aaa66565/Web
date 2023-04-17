<%-- 
    Document   : login
    Created on : 2023-3-31, 14:11:35
    Author     : Administrator
--%>

<%@page import="bao.TobliceBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bao.TopicBeanAction"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
TopicBeanAction tba = new TopicBeanAction();
int pageSize = 5;
int currentPage = 1;//当前页是第一页
if(request.getParameter("currentPage")!=null){
    currentPage = Integer.parseInt(request.getParameter("currentPage"));//超链接传递的参数值
};
ArrayList al = tba.getTopicByPage(pageSize, currentPage);
int rowCount = tba.getRowCount();//总行数
int pageCount = rowCount/pageSize;//总页数
if(rowCount%pageSize!=0){
    pageCount++;
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function check(){
                var num = document.getElementById("num").value;
                var i_num = parseInt(num);
                if(i_num == "NaN"){
                    alert("请输入阿拉伯数字");
                    return false;
                }
                else if(i_num)<%=pageCount%>|i_num<1{
                    alert("页码不对,过大或过小")
                    return false;
                }
                location href="indext.jsp?currentPage="+i_num;
            }
        </script>
         <style>
        * {
            margin: 0;
            padding: 0;
            list-style: url("pre.gif") outside circle;
            text-decoration: none;
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
             /*background-color: #fff;*/ 
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
            width: 275px;
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
            /*background-color:  #00f;*/
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
            /*background-color:#0f0;*/

            /*display: flex;*/
            justify-content: center;
            align-items: center;

        }

        .mainBotton {
            /* background-color: #F30; */
            width: 100%;
            height: auto;
            /*background-color:#19AAD8;*/
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
        <!--<div class="whole">-->
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
            <div class="mainTop">
                <table width="100%" border="1">
  <tr>
    <td width="76">标题</td>
    <td width="68">作者</td>
    <td width="80">发帖时间</td>
    <td width="121"><p>回复数</p></td>
  </tr>
  <%for(int i = 0;i<al.size();i++){
      TobliceBean tb = (TobliceBean)al.get(i);
  %>
  <tr>
      <td><a href="countent.jsp?topicId=<%=tb.getID()%>"><%=tb.getTitle()%></a></td>
    <td><%=tb.getUser()%></td>
    <td><%=tb.getTopicDat()%></td>
    <td><%=tb.getReplyNumber()%></td>
  </tr>
  <%}%>
  <tr>
      <td colspan="4">
          <a href="indext.jsp?currentPage=1"> 首页</a>
          <%
           if(currentPage<pageCount&currentPage>0){
          %>
          <a href="indext.jsp?currentPage=<%=currentPage+1%>">下一页</a>
          <%
           }
          if(currentPage>1){%>
          <a href="indext.jsp?currentPage=<%=currentPage-1%>">上一页</a>
          <%}%>
          <a href="indext.jsp?currentPage=<%=currentPage%>">末页</a>
          总页数:<%=pageCount%> 当前页<%=currentPage%>
          第<input type="text" name="num" id="num" size="2"/>页
          <input type="button" value="跳转" onclick="return check()"/>
          
      </td>
          
  </tr>
</table>
        </div>
    </div>  
</body>
</html>

