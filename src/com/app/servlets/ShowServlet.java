package com.app.servlets;

import com.app.beans.Task;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.app.beans.Priority.HIGH;


/**
 * Created by Guillaume Gingembre on 29/10/2017.
 */
public class ShowServlet extends HttpServlet {
    protected void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // initiating our variables

        LocalDate date1 = LocalDate.parse("2017-11-01");
        Task task1 = new Task("task1", HIGH, date1, date1 );

        LocalDate date2 = LocalDate.parse("2017-12-01");
        Task task2 = new Task("task2", HIGH, date2, date2 );

        LocalDate date3 = LocalDate.parse("2017-11-15");
        Task task3 = new Task("task3", HIGH, date3, date3 );

        List<Task> tasks = new ArrayList<Task>();

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        HttpSession session = request.getSession();
        session.setAttribute("tasks", tasks);

        request.setAttribute("tasks", tasks);

        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);


    }
}
