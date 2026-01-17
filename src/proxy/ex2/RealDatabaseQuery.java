package proxy.ex2;

public class RealDatabaseQuery implements DatabaseQuery{
    @Override
    public String execute(String sql) {
        return "Query from database";
    }
}
