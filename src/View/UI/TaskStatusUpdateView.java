package View.UI;

import Controller.Facade.TaskManagerFacade;
import Model.Factory.Task;

public class TaskStatusUpdateView {
    private TaskManagerFacade taskManagerFacade;
    private ConsoleView consoleView;

    public TaskStatusUpdateView(TaskManagerFacade taskManagerFacade, ConsoleView consoleView) {
        this.taskManagerFacade = taskManagerFacade;
        this.consoleView = consoleView;
    }

    public void updateTaskStatus() {
        String taskTitle = consoleView.promptForInput("Input task title to change status: ");
        String newStatus = consoleView.promptForInput("Input new task status: ");

        Task task = taskManagerFacade.getTaskByTitle(taskTitle);
        if (task != null) {
            taskManagerFacade.updateTaskStatus(task, newStatus);
            consoleView.displaySuccess("Task \"" + taskTitle + "\" status changed to " + newStatus + ".");
        } else {
            consoleView.displayError("Task with title \"" + taskTitle + "\" not found.");
        }
    }
}