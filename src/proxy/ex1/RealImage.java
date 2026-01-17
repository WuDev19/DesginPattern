package proxy.ex1;

public final class RealImage implements Image {
    private final String url;

    public RealImage(String url) {
        this.url = url;
        loadUrl();
    }

    private void loadUrl() {
        System.out.println("Load url: " + url);
    }

    @Override
    public void display() {
        System.out.println("Display url: " + url);
    }

}
