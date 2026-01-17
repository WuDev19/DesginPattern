package proxy.ex1;

public class ProxyImage implements Image{

    private final String url;
    private RealImage realImage;

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(url); // lần đầu tải về sau đó hiển thị
        }
        else {
            System.out.println("Real Image đã tồn tại");
            //có thể set lại url mới;
        }
        realImage.display(); // lần sau chỉ cần hiển thị
    }

}
