import Controller.Facade.TaskManagerFacade;
import View.UI.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManagerFacade taskManagerFacade = new TaskManagerFacade();
        ConsoleView consoleView = new ConsoleView(taskManagerFacade);
        TaskCreationView taskCreationView = new TaskCreationView(taskManagerFacade, consoleView);
        TaskStatusUpdateView taskStatusUpdateView = new TaskStatusUpdateView(taskManagerFacade, consoleView);
        TaskDeletionView taskDeletionView = new TaskDeletionView(taskManagerFacade, consoleView);

        while (true) {
            System.out.println("\nChoose action:");
            System.out.println("1. Create task");
            System.out.println("2. Update task status");
            System.out.println("3. Delete task");
            System.out.println("4. List all tasks");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    taskCreationView.createNewTask();
                    break;
                case 2:
                    taskStatusUpdateView.updateTaskStatus();
                    break;
                case 3:
                    taskDeletionView.deleteTask();
                    break;
                case 4:
                    consoleView.displayTasks();
                    break;
                case 0:
                    System.out.println("Program closed.");
                    return;
                default:
                    System.out.println("Wrong input, try again.");
            }
        }
    }
}