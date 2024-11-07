package Model.Observer;

import Model.Factory.Task;

/**
 * An observer interface representing objects
 * that respond to changes in tasks.
 */
public interface Observer {
    void update(Task task);
}
