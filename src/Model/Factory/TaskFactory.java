package Model.Factory;

public class TaskFactory {
    public static Task createTask(String type, String title){
        return switch(type){
            case "Bug" -> new BugTask(title);
            case "Feature" -> new FeatureTask(title);
            default -> throw new IllegalArgumentException("Invalid task type");
        };
    }
}