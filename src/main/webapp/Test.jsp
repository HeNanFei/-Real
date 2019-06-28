<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/24 0024
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="easyui/1.3.4/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="css/wu.css" />
<link rel="stylesheet" type="text/css" href="css/icon.css" />
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="easyui/1.3.4/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/1.3.4/locale/easyui-lang-zh_CN.js"></script>
<script>
    $(function () {
        $('#tree').tree({
            data:[{
                "id":1,
                "text":"Folder1",
                "iconCls":"icon-save",
                "children":[{
                    "text":"File1",
                    "checked":true
                },{
                    "text":"Books",
                    "state":"open",
                    "attributes":{
                        "url":"/demo/book/abc",
                        "price":100
                    },
                    "children":[{
                        "text":"PhotoShop",
                        "checked":true
                    },{
                        "id": 8,
                        "text":"Sub Bookds",
                        "state":"closed"
                    }]
                }]
            },{
                "text":"Languages",
                "state":"closed",
                "children":[{
                    "text":"Java"
                },{
                    "text":"C#"
                }]
            }]

        })
    })
    
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div id="tree"></div>
</body>
</html>
