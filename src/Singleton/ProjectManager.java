package Singleton;

public class ProjectManager {
    private static ProjectManager instance;

    private ProjectManager() {}

    public static ProjectManager getInstance() {
        if(instance == null) instance = new ProjectManager();
        return instance;
    }
}
