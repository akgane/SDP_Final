package Controller.Facade;

import Model.Command.*;
import Model.Factory.*;
import Model.Observer.Observer;
import Model.Singleton.*;

/**
 * The main facade of the application,
 * providing a simplified interface for working with tasks.
 * Creates tasks, updates their status, manages observers,
 * and executes commands
 */
public class TaskManagerFacade {
    private ProjectManager projectManager;

    public TaskManagerFacade() {
        this.projectManager = ProjectManager.getInstance();
    }

    public void createTask(String type, String title) {
        try {
            Task task = TaskFactory.createTask(type, title);
            Command createTaskCommand = new CreateTaskCommand(projectManager, task);
            execute(createTaskCommand);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateTaskStatus(Task task, String newStatus){
        Command updateStatusCommand = new UpdateTaskStatusCommand(task, newStatus);
        execute(updateStatusCommand);
    }

    public void deleteTask(Task task){
        Command deleteTaskCommand = new DeleteTaskCommand(projectManager, task);
        execute(deleteTaskCommand);
    }

    public void addObserverToTask(Task task, Observer observer){
        task.addObserver(observer);
        System.out.println("Model.Observer added to task \"" + task.getTitle() + "\".");
    }

    public void removeObserverFromTask(Task task, Observer observer){
        task.removeObserver(observer);
        System.out.println("Model.Observer removed from task \"" + task.getTitle() + "\".");
    }

    public void undoLastAction(){
        projectManager.undoLastCommand();
    }

    public void displayAllTasks(){
        projectManager.displayTasks();
    }

    public Task getTaskByTitle(String title){
        return projectManager.getTaskByTitle(title);
    }

    private void execute(Command command){
        projectManager.executeCommand(command);
    }
}
