package facade.ex1;

public class Table implements Furniture{
    @Override
    public void make() {
        System.out.println("Make table");
    }
}
