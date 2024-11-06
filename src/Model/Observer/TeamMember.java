package Model.Observer;

import Model.Factory.Task;

public class TeamMember implements Observer{
    private String name;
    private String email;

    public TeamMember(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(Task task) {
        System.out.println("Update for " + name + ": task \"" + task.getTitle() + "\" changed status for " + task.getStatus() + ".");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}