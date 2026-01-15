package composite.ex1;

import java.util.List;

public class Boss extends Employee {

    private final List<Employee> listEmployee;

    public Boss(String name, int age, int salary, List<Employee> listEmployee) {
        super(name, age, salary);
        this.listEmployee = listEmployee;
    }

    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    @Override
    protected void add(Employee employee) {
        if(!listEmployee.contains(employee)){
            listEmployee.add(employee);
        }
    }

    @Override
    protected void remove(Employee employee) {
        listEmployee.remove(employee);
    }

    @Override
    protected int size() {
        return listEmployee.size();
    }

    @Override
    protected void showInfo() {
        System.out.println(this);
        System.out.println("Danh sách Employee của Boss");
        listEmployee.forEach(
                employee -> System.out.println(employee.toString())
        );
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
