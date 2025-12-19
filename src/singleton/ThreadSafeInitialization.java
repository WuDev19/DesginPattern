package singleton;

public class ThreadSafeInitialization {
    //ghi thằng vào bộ nhớ chính, các luồng khác khi đọc biến này sẽ đọc từ bộ nhớ chính mà ko phải từ bộ đệm lỗi thời
    //giúp đọc được giá trị mới nhất khi truy cập từ nhiều luồng (tạo sự nhất quán)
    //tất cả các thể hiện khác đều thấy được giá trị của nó kể cả thay đổi ở luồng khác
    private static volatile ThreadSafeInitialization INSTANCE;

    private ThreadSafeInitialization(){}

    public static synchronized ThreadSafeInitialization getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ThreadSafeInitialization();
        }
        return INSTANCE;
    }

}
