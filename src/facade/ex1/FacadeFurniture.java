package facade.ex1;

//đây sẽ là nơi client dùng, client sẽ ko cần biết chi tiết xử lý bên trong như nào, chỉ cần dùng các method có chức năng tương ứng
public class FacadeFurniture {
    private static FacadeFurniture INSTANCE;
    private final Furniture chair;
    private final Furniture table;
    private final Furniture television;

    private FacadeFurniture(){
        chair = new Chair();
        table = new Table();
        television = new Television();
    }

    public static FacadeFurniture getInstance(){
        if(INSTANCE == null){
            INSTANCE = new FacadeFurniture();
        }
        return INSTANCE;
    }

    public void makeChairAndTable(){
        chair.make();
        table.make();
    }

    public void makeTableAndTelevision(){
        table.make();
        television.make();
    }

}
