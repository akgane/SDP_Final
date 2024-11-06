package Factory;

public class TaskFactory {
    public static Task createTask(String type){
        return switch(type){
            case "Bug" -> new BugTask();
            case "Feature" -> new FeatureTask();
            default -> throw new IllegalArgumentException("Invalid task type");
        };
    }
}