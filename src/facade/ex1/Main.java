package facade.ex1;

public class Main {

    public static void main(String[] args) {
        FacadeFurniture facadeFurniture = FacadeFurniture.getInstance();
        facadeFurniture.makeChairAndTable();
        facadeFurniture.makeTableAndTelevision();
    }

}
