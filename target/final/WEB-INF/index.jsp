<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/23 0023
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="../themes/default/easyui.css" type="text/css">
<script src="../js/jquery.min.js"></script>
<script src="../js/jquery.easyui.min.js"></script>
<script>
    $(function () {
        $('.linkAddress').click(function (){

            var url = this.href;
            var content = this.innerHTML;
            var result = $('#tab').tabs('exists',content);

            if(result== false){
                alert(result);
                alert(url);
                createTabs(content,url);
                return false;
            }
            
        })
        function createTabs(content,url) {
            $('#tab').tabs('add',{
                title:content,
                content:createContent(url),
                closable:true,
                tools:[{
                    iconCls:'icon-mini-refresh',
                    handler:function(){
                        alert('refresh');
                    }
                }]
            });

        }

    })
    function createContent(url) {
        return "<iframe src='"+url+"' style='width: 100%;height: 100%'></iframe>";
    }
</script>
<body class="easyui-layout">
<div style="width: 100%;height: 10%;background-color: #0c7cd5"></div>
<div id="cc" class="easyui-layout" style="width:100%;height:500px;">
    <div data-options="region:'west',title:'West',split:true" style="width:200px;">

        <div id="aa" class="easyui-accordion" fit="true">
            <div title="Title1" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">
                <ul id="tt" class="easyui-tree">
                    <li>
                        <span>信息管理</span>
                        <ul>

                            <li>
                                <span><a href="" class="linkAddress">连接一</a></span>
                            </li>
                            <li>
                                <span><a href="../second.jsp" class="linkAddress">连接二</a></span>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <span>信息操作</span>
                    </li>
                </ul>


            </div>
            <div title="Title2" data-options="iconCls:'icon-reload',selected:true" style="padding:10px;">

            </div>
            <div title="Title3">

            </div>
        </div>



    </div>
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">
        <div id="tab" class="easyui-tabs" style="width: 100%;height: 100%"></div>

    </div>
</div>





</body>
</html>
