package View.UI;

import Controller.Facade.TaskManagerFacade;

import java.util.Scanner;

/**
 * A console view that displays task data to the user.
 * Displays a list of tasks, error and
 * success messages, and prompts the user for input.
 */
public class ConsoleView {
    private TaskManagerFacade taskManagerFacade;

    public ConsoleView(TaskManagerFacade taskManagerFacade) {
        this.taskManagerFacade = taskManagerFacade;
    }

    public void displayTasks() {
        System.out.println("All tasks list:");
        taskManagerFacade.displayAllTasks();
    }

    public void displayError(String errorMessage) {
        System.out.println("Error: " + errorMessage);
    }

    public void displaySuccess(String successMessage) {
        System.out.println("Success: " + successMessage);
    }

    public String promptForInput(String promptMessage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(promptMessage);
        return scanner.nextLine();
    }
}
