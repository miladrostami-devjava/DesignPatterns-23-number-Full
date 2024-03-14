package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory folder1 = new Directory("Folder1");
        Directory folder2 = new Directory("Folder2");
        Directory folder3 = new Directory("Folder3");

        root.addComponent(folder1);
        root.addComponent(folder2);
        root.addComponent(folder3);


        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");
        File file4 = new File("file4.txt");
        File file5 = new File("file5.txt");
        File file6 = new File("file6.txt");
        File file7 = new File("file7.txt");
 folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder2.addComponent(file3);
        folder2.addComponent(file4);
        folder3.addComponent(file5);
        folder3.addComponent(file6);
        folder3.addComponent(file7);

        root.display(4);

    }
}
