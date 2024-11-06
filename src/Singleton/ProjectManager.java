package Singleton;

import Factory.Task;
import Command.Command;

import java.util.*;

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
}
