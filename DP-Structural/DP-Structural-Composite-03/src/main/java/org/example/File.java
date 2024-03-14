package org.example;

public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display(int ident) {
        StringBuilder addIndent = new StringBuilder();
        for (int i = 0; i < ident; i++) {
            addIndent.append("   ");
        }
        System.out.println(addIndent + name);
    }
}
