package composite.ex1;

public class BusinessAnalyst extends Employee{

    private String detail;

    public BusinessAnalyst(String name, int age, int salary, String detail) {
        super(name, age, salary);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BusinessAnalyst{" +
                "detail='" + detail + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
