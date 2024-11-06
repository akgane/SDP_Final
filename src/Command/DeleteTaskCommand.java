package Command;

import Factory.Task;
import Singleton.ProjectManager;

public class DeleteTaskCommand implements Command {
    private ProjectManager projectManager;
    private Task task;

    public DeleteTaskCommand(ProjectManager projectManager, Task task) {
        this.projectManager = projectManager;
        this.task = task;
    }

    @Override
    public void execute() {
        projectManager.removeTask(task);
        System.out.println("Task \"" + task.getTitle() + "\" was successfully deleted.");
    }

    @Override
    public void undo() {
        projectManager.addTask(task);
        System.out.println("Task \"" + task.getTitle() + "\" was recovered.");
    }
}
