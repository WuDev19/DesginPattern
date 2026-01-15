package factory;

public class Main {
    public static void main(String[] args) {
        try {
            Candy candy = CandyFactory.create(CandyType.HARD);
            System.out.println(candy.getCandyName());
        } catch (Exception e) {
            if (e instanceof NullPointerException) {
                System.out.println("Khong co loai keo nao phu hop");
            }
        }
    }
}
