package prototype;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "hehe", new Address("haha"));
        User user1 = user.clone();
        System.out.println(user1.toString() + " u1 " + user1.hashCode());
        System.out.println(user.toString() + " " + user.hashCode());
        user1.setName("hoho");
        System.out.println(user1.toString() + " u1 " + user1.hashCode());
        System.out.println(user.toString() + " " + user.hashCode());
    }
}
