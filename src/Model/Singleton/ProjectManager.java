package Model.Singleton;

import Model.Composite.ProjectComponent;
import Model.Composite.TaskComponent;
import Model.Factory.Task;
import Model.Command.Command;

import java.util.*;

/**
 * A task manager that manages a list of
 * tasks and provides methods for processing them.
 * Adds, deletes and performs actions on tasks,
 * stores all created tasks
 */
public class ProjectManager {
    private static ProjectManager instance;
    private List<Task> taskList = new ArrayList<>();
    private Stack<Command> commandHistory = new Stack<>();

    private ProjectManager() {}

    public static ProjectManager getInstance() {
        if(instance == null) instance = new ProjectManager();
        return instance;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(Task task){
        taskList.remove(task);
    }

    public void executeCommand(Command command){
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand(){
        if(!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }else{
            System.out.println("Nothing to undo");
        }

    }

    public void displayTasks(){
        for(Task task : taskList){
            ProjectComponent taskComponent = new TaskComponent(task);
            taskComponent.display();
        }
    }

    public Task getTaskByTitle(String title){
        for(Task task : taskList){
            if(task.getTitle().equals(title)) return task;
        }
        return null;
    }
}
