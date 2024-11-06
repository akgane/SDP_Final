package Command;

import Factory.Task;
import Singleton.ProjectManager;

public class CreateTaskCommand implements Command {
    private ProjectManager projectManager;
    private Task task;

    public CreateTaskCommand(ProjectManager projectManager, Task task) {
        this.projectManager = projectManager;
        this.task = task;
    }

    @Override
    public void execute() {
        projectManager.addTask(task);
        System.out.println("Task \"" + task.getTitle() + "\" created.");
    }

    @Override
    public void undo() {
        projectManager.removeTask(task);
        System.out.println("Task \"" + task.getTitle() + "\" has been removed.");
    }
}
