package adapter.ex2;

public class Main {
    public static void main(String[] args) {
        VietNamPower vietNamPower = new VietNamPower();
        Led led = new LedAdapter(vietNamPower);
        led.connect();
    }
}
