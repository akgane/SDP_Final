package Model.Composite;

public interface ProjectComponent {
    void display();
    void addComponent(ProjectComponent component);
    void removeComponent(ProjectComponent component);
}