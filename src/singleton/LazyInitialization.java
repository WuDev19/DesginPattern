package singleton;

//không khởi tạo sẵn, check null mới khởi tạo, khác null thì return về luôn
public class LazyInitialization {

    private static LazyInitialization INSTANCE;

    private LazyInitialization(){}

    public static LazyInitialization getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyInitialization();
        }
        return INSTANCE;
    }

}
