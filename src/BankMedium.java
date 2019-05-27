import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankMedium implements Medium {
    Map<String, String> clients = new HashMap<>();

    @Override
    public void write(String client, String info) throws MediumException {
        clients.put(client,info);
    }
    @Override
    public String read(String client) throws MediumException {
        return clients.get(client);
    }

    @Override
    public List<String> read() throws MediumException {
        return new ArrayList<>(clients.keySet());

    }
}
