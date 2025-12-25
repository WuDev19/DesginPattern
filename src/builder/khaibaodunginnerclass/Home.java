package builder.khaibaodunginnerclass;

public class Home {
    private final int wall;
    private final int door;
    private final boolean hasPool;
    private final boolean hasRoof;
    private final String color;

    public Home(int wall, int door, boolean hasPool, boolean hasRoof, String color) {
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
        return "Home{" +
                "wall=" + wall +
                ", door=" + door +
                ", hasPool=" + hasPool +
                ", hasRoof=" + hasRoof +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {
        private int wall;
        private int door;
        private boolean hasPool;
        private boolean hasRoof;
        private String color;

        public Builder(String color){
            this.color = color;
        }

        public Builder setWall(int wall){
            this.wall = wall;
            return this;
        }

        public Builder setDoor(int door){
            this.door = door;
            return this;
        }

        public Builder hasPool(boolean hasPool){
            this.hasPool = hasPool;
            return this;
        }

        public Builder hasRoof(boolean hasRoof){
            this.hasRoof = hasRoof;
            return this;
        }

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Home build(){
            return new Home(wall, door, hasPool, hasRoof, color);
        }

    }

}
