package composite.ex2;

public record File(String name, long size) implements FileComponent {

    @Override
    public void showProperty() {
        System.out.println(this.name);
    }

    @Override
    public long size() {
        return this.size;
    }

    @Override
    public void add(FileComponent fileComponent) {

    }

}
