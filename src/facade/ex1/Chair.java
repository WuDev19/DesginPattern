package facade.ex1;

public class Chair implements Furniture{
    @Override
    public void make() {
        System.out.println("Make chair");
    }
}
