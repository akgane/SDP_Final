package Factory;

public class FeatureTask implements Task{
    @Override
    public void execute() {
        System.out.println("Feature task is executed.");
    }
}