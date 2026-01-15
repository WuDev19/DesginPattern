package composite.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee boss = new Boss("Nguyen Van A", 40, 40000000, new ArrayList<>());

        Leader leader = new Leader("Nguyen Van C", 35, 35000000, new ArrayList<>());

        Staff staff = new Staff("Nguyen Thi A", 20, 8000000);
        Staff staff1 = new Staff("Nguyen Thi B", 21, 9000000);
        Staff staff2 = new Staff("Nguyen Thi C", 22, 10000000);
        Employee staff3 = new Staff("Nguyen Thi D", 22, 8000000);

        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Nguyen Van B", 25, 25000000, "Một nhà phân tích tuyệt vời");
        Employee businessAnalyst1 = new BusinessAnalyst("Nguyen Van C", 24, 24000000, "Đồng nghiệp xịn của B");

        boss.add(staff);
        boss.add(staff1);
        boss.add(staff1);
        boss.add(staff2);
        boss.add(staff3);
        boss.add(businessAnalyst);
        boss.add(businessAnalyst1);

        leader.add(staff);
        leader.add(staff1);
        leader.add(staff2);
        leader.add(staff3);

        boss.add(leader);
        boss.showInfo();

        leader.showInfo();
    }
}
