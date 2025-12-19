package singleton;

public class EagerInitialization {

    private static final EagerInitialization INSTANCE = new EagerInitialization();
    //biến của class, không phụ thuộc đối tượng khi khởi tạo chỉ có 1

    private EagerInitialization(){}

    public static EagerInitialization getInstance() {
        return INSTANCE;
    }

}
