package Model.Command;

import Model.Factory.Task;

//A specific command to update the status of a task.
public class UpdateTaskStatusCommand implements Command{
    private Task task;
    private String newStatus;
    private String prevStatus;

    public UpdateTaskStatusCommand(Task task, String newStatus) {
        this.task = task;
        this.newStatus = newStatus;
        prevStatus = task.getStatus();
    }

    @Override
    public void execute() {
        task.setStatus(newStatus);
        System.out.println("\"" + task.getTitle() + "\" task status changed to " + newStatus);
    }

    @Override
    public void undo() {
        task.setStatus(prevStatus);
        System.out.println("\"" + task.getTitle() + "\" task status recovered to " + prevStatus);
    }
}
