package adapter.ex2;

public record LedAdapter(VietNamPower vietNamPower) implements Led{

    @Override
    public void connect() {
        int ledPowerInVietNam = convertToLedPower(vietNamPower.power());
        if(ledPowerInVietNam > 3){
            System.out.println("Cháy");
        }
        else {
            System.out.println("Bình thường");
        }
    }

    private int convertToLedPower(int power){
        return power - 217;
    }

}
