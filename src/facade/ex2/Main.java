package facade.ex2;

public class Main {
    public static void main(String[] args) {
        ShopFacade shopFacade = ShopFacade.getInstance();
        shopFacade.buyProductByMomoWithCarDelivery();
        shopFacade.buyProductCashOnDeliveryWithMotorbikeDelivery();
    }
}
