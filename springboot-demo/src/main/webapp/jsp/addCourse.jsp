<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: weichenwang
  Date: 2021/6/10
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Course</title>
</head>
<body>
<h1>Add New Course</h1>
<form:form modelAttribute="course">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="courseName"></form:input></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
