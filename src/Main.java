import builder.khaibaodu4thanhphan.HomeBuilder;
import builder.khaibaodu4thanhphan.House;
import builder.khaibaodunginnerclass.Home;

//Director trong Builder Pattern
public class Main {
    public static void main(String[] args) {
        House house = new HomeBuilder()
                .hasPool(true)
                .setDoor(10)
                .build();
        System.out.println(house.toString());

        Home home = new Home.Builder("Green")
                .hasRoof(true)
                .build();
        System.out.println(home.toString());
    }
}