package View.UI;

import Controller.Facade.TaskManagerFacade;
import Model.Factory.Task;

public class TaskDeletionView {
    private TaskManagerFacade taskManagerFacade;
    private ConsoleView consoleView;

    public TaskDeletionView(TaskManagerFacade taskManagerFacade, ConsoleView consoleView) {
        this.taskManagerFacade = taskManagerFacade;
        this.consoleView = consoleView;
    }

    public void deleteTask(){
        String taskTitle = consoleView.promptForInput("Input task title to delete: ");

        Task task = taskManagerFacade.getTaskByTitle(taskTitle);
        if(task != null){
            taskManagerFacade.deleteTask(task);
            consoleView.displaySuccess("Task \"" + taskTitle + "\" has been deleted.");
        }else{
            consoleView.displayError("Task with title \"" + taskTitle + "\" not found.");
        }
    }
}
