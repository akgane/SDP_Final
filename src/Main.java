import Facade.TaskManagerFacade;
import Factory.Task;
import Observer.TeamMember;

public class Main {
    public static void main(String[] args) {
        TaskManagerFacade facade = new TaskManagerFacade();

        facade.createTask("Bug", "BugFix1");
        facade.createTask("Feature", "NewFeature1");

        Task task = facade.getTaskByTitle("BugFix1");
        System.out.println(task.getStatus());
        facade.updateTaskStatus(task, "In progress");
        System.out.println(task.getStatus());

        TeamMember member = new TeamMember("Alice", "alice@astanait.edu.kz");
        facade.addObserverToTask(task, member);

        facade.undoLastAction();
        facade.displayAllTasks();
    }
}