package prototype;

public class User implements Cloneable{

    private int id;
    private String name;
    private Address address;

    public User(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //deep copy hay shallow copy phụ thuộc vào object references trong class đó
    @Override
    public User clone() {
//        try {
//            return (User) super.clone(); //cái này là shallow copy
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }

        try {
            User user = (User) super.clone();
            Address address1 = new Address(this.address.getAddress()); //cái này là deep copy
            user.setAddress(address1);
            return user;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
