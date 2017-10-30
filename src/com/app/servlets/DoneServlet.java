package com.app.servlets;

import com.app.beans.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Guillaume Gingembre on 30/10/2017.
 */
@WebServlet(name = "DoneServlet")
public class DoneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // getting task details
        String id = request.getParameter("Done!");

        // delete task in list
        HttpSession session = request.getSession();
        List<Task> tasks = (List<Task>)session.getAttribute("tasks");
        tasks.removeIf(task -> task.getId().equals(id));

        // Update session List
        session.setAttribute("tasks", tasks);

        // updating request and sending response back to servlet
        request.setAttribute("tasks", tasks);
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
