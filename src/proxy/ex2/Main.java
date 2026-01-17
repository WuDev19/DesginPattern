package proxy.ex2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DatabaseQuery databaseQuery = new ProxyDatabaseQuery();
        System.out.println(databaseQuery.execute("hehehehe"));
        Thread.sleep(2000);
        System.out.println(databaseQuery.execute("hihihihi"));
        Thread.sleep(2000);
        System.out.println(databaseQuery.execute("hehehehe"));
    }
}
