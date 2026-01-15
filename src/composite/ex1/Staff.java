package composite.ex1;

public class Staff extends Employee {

    public Staff(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    protected void add(Employee employee) {

    }

    @Override
    protected void remove(Employee employee) {

    }

    @Override
    protected int size() {
        return 0;
    }

    @Override
    protected void showInfo() {

    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
