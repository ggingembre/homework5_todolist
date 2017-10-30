package com.app.beans;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Created by Guillaume Gingembre on 29/10/2017.
 */
public class Task {

    private String id;
    private String name;
    private Priority priority;
    private LocalDate deadline;
    private LocalDate reminder;
    private boolean done;

    public Task(){}

    public Task(String name, Priority priority, LocalDate deadline, LocalDate reminder) {
        this.id = UUID.randomUUID().toString();
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

        return id.equals(task.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public String getId() {
        return id;
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
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                ", deadline=" + deadline +
                ", reminder=" + reminder +
                ", done=" + done +
                '}';
    }
}
