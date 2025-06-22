package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("Task added.");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void markTaskDone(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markDone();
                System.out.println("Task marked as done.");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}