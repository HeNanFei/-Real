<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/23 0023
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="themes/default/easyui.css" type="text/css">
<script src="js/jquery.min.js"></script>
<script src="js/jquery.easyui.min.js"></script>
<script>
   $(function () {
       $('#teacherTable').datagrid({
           url:'getTeacher.action',
           columns:[[
               {field:'tname',title:'名字',width:100},
               {field:'tgender',title:'性别',width:100},
               {field:'birthday',title:'生日',width:100,align:'right'}
           ]],
           pagination:true
       });
       $('#sub').click(function () {
           var content = document.getElementById('keyWord').value;
          $.ajax({
              url:'getTeacher.action?keyWord='+content,
              success:function (data) {
                  alert('成功');
                 var obj =  JSON.parse(data);
                 $('#teacherTable').datagrid('loadData',obj);
              },
              error:function () {
                  alert('请求失败了');
              }
          });
       })
   })

</script>
<body>
    <form>
        <table>
            <th>
                <td>入职日期：<input  id="dd"  type= "text" class= "easyui-datebox" required ="required"> </input></td>
                <td>关键字：<input id="keyWord" class="easyui-textbox" data-options="iconCls:'icon-search'" style="width:300px"></td>
                <td><button id="sub" type="button">搜索</button></td>
            </th>

        </table>



    </form>


<div id="teacherTable"></div>
</body>
</html>
