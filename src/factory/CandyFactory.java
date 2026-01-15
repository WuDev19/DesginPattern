package factory;

//nhà máy, dựa vào loại đầu vào thì tạo instance tương ứng
public class CandyFactory {

    private CandyFactory() {
    } //không cho tạo instance của CandyFactory

    public static Candy create(CandyType candyType) throws Exception{
        switch (candyType) {
            case HARD -> {
                return new HardCandy();
            }
            case SOFT -> {
                return new SoftCandy();
            }
            case MINTY -> {
                return new MintyCandy();
            }
            case null, default -> throw new NullPointerException("Không có loại kẹo nào phù hợp yêu cầu của bạn");
        }
    }

}
