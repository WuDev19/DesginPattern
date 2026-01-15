package composite.ex2;

public interface FileComponent {
    void showProperty();
    long size();
    void add(FileComponent fileComponent);
}
