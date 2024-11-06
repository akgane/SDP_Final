package Composite;

import Factory.Task;

public class TaskComponent implements ProjectComponent {
    private final Task task;

    public TaskComponent(Task task) {
        this.task = task;
    }

    @Override
    public void display() {
        System.out.println("Task: " + task.getTitle() + " | Status: " + task.getStatus());
    }

    @Override
    public void addComponent(ProjectComponent component) {
        throw new UnsupportedOperationException("Cannot add sub-tasks to a simple task");
    }

    @Override
    public void removeComponent(ProjectComponent component) {
        throw new UnsupportedOperationException("Cannot remove sub-tasks from a simple task");
    }
}