package Model.Command;

/**
 * A command to perform an action on a task.
 * This is an interface for implementing various commands.
 */
public interface Command {
    void execute();
    void undo();
}
