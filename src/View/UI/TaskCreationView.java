package View.UI;

import Controller.Facade.TaskManagerFacade;

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
