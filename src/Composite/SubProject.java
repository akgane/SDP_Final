package Composite;

import java.util.ArrayList;
import java.util.List;

public class SubProject implements ProjectComponent {
    private String name;
    private List<ProjectComponent> components = new ArrayList<>();

    public SubProject(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Sub-Project: " + name);
        for (ProjectComponent component : components) {
            component.display();
        }
    }

    @Override
    public void addComponent(ProjectComponent component) {
        components.add(component);
    }

    @Override
    public void removeComponent(ProjectComponent component) {
        components.remove(component);
    }
}