import factory.Candy;
import factory.CandyFactory;
import factory.CandyType;

public class Main {
    public static void main(String[] args) {
        try {
            Candy candy = CandyFactory.create(CandyType.HARD);
            System.out.println(candy.getCandyName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}