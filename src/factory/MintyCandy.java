package factory;

//subclass
public class MintyCandy implements Candy{
    @Override
    public String getCandyName() {
        return MintyCandy.class.getName();
    }
}
