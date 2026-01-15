package composite.ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileComponent file = new File("a1", 20);
        FileComponent file1 = new File("a2", 50);
        FileComponent file2 = new File("a3", 100);

        FileComponent folder = new Folder(new ArrayList<>());
        FileComponent folder1 = new Folder(new ArrayList<>());

        folder.add(file);
        folder.add(file1);

        folder1.add(file);
        folder1.add(file1);
        folder1.add(file2);

        folder.add(folder1);

        folder.showProperty();
        System.out.println(folder.size());
    }
}
