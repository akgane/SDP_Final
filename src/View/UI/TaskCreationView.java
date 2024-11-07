package View.UI;

import Controller.Facade.TaskManagerFacade;

/**
 * A view for creating new tasks via console input.
 * Requests data from the user and calls TaskManagerFacade to create the task.
 */
public class TaskCreationView {
    private TaskManagerFacade taskManagerFacade;
    private ConsoleView consoleView;

    public TaskCreationView(TaskManagerFacade taskManagerFacade, ConsoleView consoleView) {
        this.taskManagerFacade = taskManagerFacade;
        this.consoleView = consoleView;
    }

    public void createNewTask() {
        String taskType = consoleView.promptForInput("Input task type (Bug, Feature): ");
        String taskTitle = consoleView.promptForInput("Input task title: ");

        taskManagerFacade.createTask(taskType, taskTitle);

        consoleView.displaySuccess("Task \"" + taskTitle + "\" created.");
    }
}
