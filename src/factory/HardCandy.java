package factory;

//subclass
public class HardCandy implements Candy{
    @Override
    public String getCandyName() {
        return HardCandy.class.getName();
    }
}
