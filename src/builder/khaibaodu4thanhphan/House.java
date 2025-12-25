package builder.khaibaodu4thanhphan;

//Builder Pattern có 4 thành phần chính

//Product
public class House {
    private final int wall;
    private final int door;
    private final boolean hasPool;
    private final boolean hasRoof;
    private final String color;

    public House(int wall, int door, boolean hasPool, boolean hasRoof, String color) {
        this.wall = wall;
        this.door = door;
        this.hasPool = hasPool;
        this.hasRoof = hasRoof;
        this.color = color;
    }

    public int getWall() {
        return wall;
    }

    public int getDoor() {
        return door;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "House{" +
                "wall=" + wall +
                ", door=" + door +
                ", hasPool=" + hasPool +
                ", hasRoof=" + hasRoof +
                ", color='" + color + '\'' +
                '}';
    }

}
