package proxy.ex1;

//Proxy giống như lazy loading, chỉ khởi tạo khi cần
//Có thể dùng để cache
//Kiểm soát truy cập, kiếm tra trước khi cho thao tác với đối tượng thực, giúp bảo vệ dữ liệu
public class Main {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("ạkdjkasnda");
        proxyImage.display();
        proxyImage.display();
    }
}
