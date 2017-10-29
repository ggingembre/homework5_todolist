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

      <input type="text" step=any id="name" name="name" />

      <select name="priority">
          <option value="HIGH">HIGH</option>
          <option value="MEDIUM">MEDIUM</option>
          <option value="LOW">LOW</option>
      </select>

    <input type="date" step=any id="deadline" name="deadline" />

      <input type="date" step=any id="reminder" name="reminder" />

    <input type="submit" value="Create Task" />
  </form>

  <%@ include file="show.jsp"%>
  </body>
</html>
