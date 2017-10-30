<%--
  Created by IntelliJ IDEA.
  User: Guillaume Gingembre
  Date: 29/10/2017
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>To Do List</title>
</head>
<body>
<h2>Welcome to your to do list!</h2>
<p>Enter a new task</p>

<form action="add" method="POST">

    <table>
        <tr>
            <td>
                Task Name:
            </td>
            <td>
                <input type="text" step=any id="name" name="name" />
            </td>
        </tr>
        <tr>
            <td>
                Priority:
            </td>
            <td>
                <select name="priority">
                    <option value="HIGH">HIGH</option>
                    <option value="MEDIUM">MEDIUM</option>
                    <option value="LOW">LOW</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                Deadline:
            </td>
            <td>
                <input type="date" step=any id="deadline" name="deadline" />
            </td>
        </tr>
        <tr>
            <td>
                Reminder:
            </td>
            <td>
                <input type="date" step=any id="reminder" name="reminder" />
            </td>
        </tr>
    </table>

    <input type="submit" value="Create Task" />
</form>

<c:if test="${not empty tasks}">
<%@ include file="show.jsp"%>
</c:if>
</body>
</html>