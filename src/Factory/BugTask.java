package Factory;

public class BugTask implements Task{
    @Override
    public void execute() {
        System.out.println("Bug task is executed.");
    }
}