
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="ca" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>john-cell</title>
</head>
<body>
    ${name}
    ${User.name}
    ${User.age}

    <ca:if test="${User.age==28}">
        <input type="button" value="按钮" />
    </ca:if>
    <ca:forEach items="${UserList}" var="user">
        <input type="text" value="${user.name}">
        <input type="button" value="${user.age}">
    </ca:forEach>
<script type="text/javascript">
    var AJAX;
    AJAX = {
        get: function (url,fun) {
            var obj = new XMLHttpRequest();
            obj.open('GET',url,true);
            obj.onreadystatechange = function () {
                if (obj.readyState == 4 && obj.status == 200){
                    fun.call(this,obj.responseText)
                }
            };
            obj.send(null);
        },

        post: function (url,data,fun) {
            var obj = new XMLHttpRequest();
            obj.open('POST',url,true);
            obj.onreadystatechange = function () {
                if (obj.readyState == 4 && obj.status == 200){
                    fun.call(this,obj.responseText)

                }

            };
            obj.send(data);
        }
    };

    AJAX.get("demo1?name=lol",fResult);
    function fResult(data) {
        alert(data);
    }
</script>
</body>
</html>
