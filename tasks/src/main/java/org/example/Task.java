package org.example;

public class Task {
    private static int counter = 1;
    private final int id;
    private String title;
    private boolean isDone;

    public Task(String title) {
        this.id = counter++;
        this.title = title;
        this.isDone = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + (isDone ? " (Done)" : "");
    }
}
