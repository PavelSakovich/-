import java.util.HashMap;
import java.util.logging.Handler;

public class AtmMachine {
    private HashMap<String, Integer> account = new HashMap<String,Integer>();

    public HashMap<String, Integer> getAccount() {
        return account;
    }
    public void setAccount(HashMap<String, Integer> account) {
        this.account = account;
    }
    public void putMoney (){
        account.put("Купюр номиналом 10 рублей ", 20);
        account.put("Купюр номиналом 50 рублей ", 10);
        account.put("Купюр номиналом 100 рублей ", 150);
    }
}


