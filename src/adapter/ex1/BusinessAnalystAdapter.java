package adapter.ex1;

public record BusinessAnalystAdapter(Developer developer) implements Customer {

    @Override
    public void sendRequest(String request) {
        System.out.println("Yêu cầu của customer: " + request);
        System.out.println("Business Analyst is analyzing");
        String result = convert(request);
        developer.receive(result);
    }

    private String convert(String request) {
        return "Bây giờ phải code như này";
    }

}
