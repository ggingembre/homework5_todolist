package com.app.beans;

import java.time.LocalDate;

/**
 * Created by Guillaume Gingembre on 29/10/2017.
 */
public class Task {

    private String name;
    private Priority priority;
    private LocalDate deadline;
    private LocalDate reminder;
    private boolean done;

    public Task(){}

    public Task(String name, Priority priority, LocalDate deadline, LocalDate reminder) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
        this.reminder = reminder;
        this.done = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (done != task.done) return false;
        if (!name.equals(task.name)) return false;
        if (priority != task.priority) return false;
        if (!deadline.equals(task.deadline)) return false;
        return reminder != null ? reminder.equals(task.reminder) : task.reminder == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + priority.hashCode();
        result = 31 * result + deadline.hashCode();
        result = 31 * result + (reminder != null ? reminder.hashCode() : 0);
        result = 31 * result + (done ? 1 : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public LocalDate getReminder() {
        return reminder;
    }

    public void setReminder(LocalDate reminder) {
        this.reminder = reminder;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", deadline=" + deadline +
                ", reminder=" + reminder +
                ", done=" + done +
                '}';
    }
}
