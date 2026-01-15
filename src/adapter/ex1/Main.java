package adapter.ex1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new BusinessAnalystAdapter(new Developer());
        customer.sendRequest("Code cho tôi một cái app bằng Flutter");
    }
}
