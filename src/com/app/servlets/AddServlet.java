package com.app.servlets;

import com.app.beans.Priority;
import com.app.beans.Task;

import javax.ejb.Local;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume Gingembre on 29/10/2017.
 */
@WebServlet(name = "AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // getting variables from user
        String name = request.getParameter("name");
        Priority priority = null;
        String string = request.getParameter("priority");

        switch(string) {
            case "HIGH":
                priority = Priority.HIGH;
                break;
            case "MEDIUM":
                priority = Priority.MEDIUM;
                break;
            case "LOW":
                priority = Priority.LOW;
                break;
            default: System.out.println("we did not recognize the priority, please select the correct choice and try again");
        }

        LocalDate deadline = LocalDate.parse(request.getParameter("deadline"));
        LocalDate reminder = LocalDate.parse(request.getParameter("reminder"));

        // creating new task
        Task task = new Task (name, priority, deadline, reminder);

        // saving new task to our existing array of tasks and saving updated array back to session
        HttpSession session = request.getSession();
        List<Task> tasks = (List<Task>)session.getAttribute("tasks");
        tasks.add(task);
        session.setAttribute("tasks", tasks);

        // updating request and sending response back to servlet
        request.setAttribute("tasks", tasks);
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
