<%--
  Created by IntelliJ IDEA.
  User: Guillaume Gingembre
  Date: 29/10/2017
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="task" scope="request" class="com.app.beans.Task"/>

<html>
<head>
    <title>Show Tasks</title>
</head>
<body>

<p>Tasks to complete:</p>
<c:forEach var="task" items="${tasks}">
    <div class="first" style="float: left; width:27%; margin:0.5%; box-shadow: 10px 10px 5px grey; background-color: #f1f1f1">

        <form action="delete" method="Post">
        <table>
    <div class="second" style="height:80px" >
            <tr>
                <td class="tb1" style="width:30%">Priority :</td>
                <td class="tb1" style="width:60%">${task.priority}</td>
            </tr>
            <tr>
                 <td class="tb1" style="width:30%">Task :</td>
                 <td class="tb1" style="width:60%">${task.name}</td>
            </tr>
            <tr>
                 <td class="tb1" style="width:30%">Deadline :</td>
                 <td class="tb1" style="width:60%">${task.deadline}</td>
            </tr>
            <tr>
                <td>
                    <input TYPE="submit" value="Done!">
                </td>
            </tr>
    </div>
            </table>
        </form>
        <br>
        <br>
    </div>
</c:forEach>

</body>
</html>