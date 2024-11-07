package Model.Observer;

import Model.Factory.Task;

/**
 * Represents a team member who is an
 * observer and receives notifications of task changes.
 */
public class TeamMember implements Observer{
    private String name;
    private String email;

    public TeamMember(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Receives updates on the status of the task.
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