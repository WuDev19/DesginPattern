package proxy.ex2;

import java.util.HashMap;
import java.util.Map;

//case cache dữ liệu
public class ProxyDatabaseQuery implements DatabaseQuery{
    private RealDatabaseQuery realDatabaseQuery;
    private final Map<String, String> cache = new HashMap<>();
    @Override
    public String execute(String sql) {
        if(realDatabaseQuery == null){
            realDatabaseQuery = new RealDatabaseQuery();
            System.out.println("Lần đầu khởi tạo real");
        }
        System.out.println("Đã có real");
        if(cache.containsKey(sql)){
            System.out.println("Đã có sql trong cache");
            return cache.get(sql);
        }
        String kq = realDatabaseQuery.execute(sql);
        cache.put(sql, kq);
        return kq;
    }
}
