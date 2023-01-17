import java.util.HashMap;
import java.util.Map;

public class Balance extends AtmMachine {
    private int balanceCard = 2000;

    public int getBalanceCard() {
        return balanceCard;
    }

    public void setBalanceCard(int balance) {
        this.balanceCard = balance;
    }
}