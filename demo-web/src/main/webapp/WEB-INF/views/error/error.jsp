<%@ page contentType="text/html;charset=UTF-8" %>

<html>

<head>
    <script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <%--<script src="src/main/webapp/WEB-INF/js/jquery.min.js"></script>--%>
</head>

error.jsp
${message}
${errorCode}
${exception}
<body>
<p onclick="contentTable('123123123');">aaaaaa</p>
</body>
<script>
    function contentTable(contNo) {
        var param = {
            contNo: contNo
        };
        $.ajax({
            type: "post",
            url: "test",
            data: param,
            dataType: "json",
            error: function (data,response) {
                alert(data.exception);
            },
            success: function (data, textStatus) {
                    alert(data)


            },

        });
    }
    ;
</script>
</html>