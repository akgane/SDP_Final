package Model.Factory;

public class FeatureTask extends Task {
    public FeatureTask(String title) {
        super(title);
    }

    @Override
    public void execute() {
        System.out.println("Feature task is executed: " + getTitle());
    }
}