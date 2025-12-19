package factory;

//subclass
public class SoftCandy implements Candy{
    @Override
    public String getCandyName() {
        return SoftCandy.class.getName();
    }
}
