package composite.ex1;

import java.util.List;

public class Leader extends Employee{

    private final List<Employee> listStaff;

    public Leader(String name, int age, int salary, List<Employee> listStaff) {
        super(name, age, salary);
        this.listStaff = listStaff;
    }

    @Override
    protected void add(Employee employee) {
        if(employee instanceof Staff staff){
            listStaff.add(staff);
        }
    }

    @Override
    protected void remove(Employee employee) {
        listStaff.remove(employee);
    }

    @Override
    protected int size() {
        return listStaff.size();
    }

    @Override
    protected void showInfo() {
        System.out.println(this);
        System.out.println("Danh sách Staff của Leader");
        listStaff.forEach(staff -> System.out.println(staff.toString()));
    }

    @Override
    public String toString() {
        return "Leader{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
