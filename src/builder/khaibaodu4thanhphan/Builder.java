package builder.khaibaodu4thanhphan;

//Builder
public interface Builder {
    Builder setWall(int wall);
    Builder setDoor(int door);
    Builder hasPool(boolean hasPool);
    Builder hasRoof(boolean hasRoof);
    Builder setColor(String color);
    House build();
}
