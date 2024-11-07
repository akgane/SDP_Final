package Model.Factory;

//A concrete task of type “Bug”. Extends Task abstract class
public class FeatureTask extends Task {
    public FeatureTask(String title) {
        super(title);
    }

    @Override
    public void execute() {
        System.out.println("Feature task is executed: " + getTitle());
    }
}