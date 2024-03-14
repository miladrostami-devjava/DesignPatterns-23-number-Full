package org.example;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display(int indent) {
        StringBuilder addIndent = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            addIndent.append("   ");

        }
        System.out.println( addIndent + name);
        components.forEach(it -> it.display(indent+1));
    }
}
