package facade.ex2;

import facade.ex2.service.DeliveryService;
import facade.ex2.service.LoginService;
import facade.ex2.service.PayService;

public class ShopFacade {
    private static volatile ShopFacade instance;
    private final LoginService loginService;
    private final DeliveryService deliveryService;
    private final PayService payService;

    private ShopFacade(){
        loginService = new LoginService();
        deliveryService = new DeliveryService();
        payService = new PayService();
    }

    public static ShopFacade getInstance(){
        if(instance == null){
            synchronized (ShopFacade.class){
                if (instance == null){
                    instance = new ShopFacade();
                }
            }
        }
        return instance;
    }

    public void buyProductByMomoWithCarDelivery(){
        loginService.loginWithFacebook();
        payService.payByMomo();
        deliveryService.byCar();
    }

    public void buyProductCashOnDeliveryWithMotorbikeDelivery(){
        loginService.loginWithZalo();
        payService.payByPaypal();
        deliveryService.byMotorbike();
    }

}
