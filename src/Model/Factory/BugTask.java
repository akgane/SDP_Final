package Model.Factory;

public class BugTask extends Task {
    public BugTask(String title) {
        super(title);
    }

    @Override
    public void execute() {
        System.out.println("Bug task is executed: " + getTitle());
    }
}