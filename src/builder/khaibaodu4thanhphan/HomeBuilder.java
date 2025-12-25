package builder.khaibaodu4thanhphan;

//ConcreteBuilder
public class HomeBuilder implements Builder{

    private int wall;
    private int door;
    private boolean hasPool;
    private boolean hasRoof;
    private String color;

    @Override
    public Builder setWall(int wall) {
        this.wall = wall;
        return this;
    }

    @Override
    public Builder setDoor(int door) {
        this.door = door;
        return this;
    }

    @Override
    public Builder hasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    @Override
    public Builder hasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
        return null;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public House build() {
        return new House(wall, door, hasPool, hasRoof, color);
    }

}
