package Model.Factory;

/**
 * Factory for creating tasks of different
 * types (BugTask, FeatureTask) depending on passed parameters.
 */
public class TaskFactory {
    //Determines the type of task and creates the corresponding Task object.
    public static Task createTask(String type, String title){
        return switch(type){
            case "Bug" -> new BugTask(title);
            case "Feature" -> new FeatureTask(title);
            default -> throw new IllegalArgumentException("Invalid task type");
        };
    }
}