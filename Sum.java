import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Sum extends AtmMachine{

    private static int maxSumValue = 0;
    public void getBalanceAtmMachine() {
        getAmountBanknot ();
        maxSumValue = maxSum ();
        System.out.println("Максимальная сумма для вывода" + " = " + maxSumValue + " рублей.");
    }
    public void getAmountBanknot (){
        System.out.println("В банкомате осталось:");
        for (String entry : getAccount().keySet()) {
            int sum = getAccount().get(entry);
            System.out.println(entry + " = " + sum);
        }
    }
public int maxSum (){
        int money10 = getAccount().get("Купюр номиналом 10 рублей ");
        int money50 = getAccount().get("Купюр номиналом 50 рублей ");
        int money100 = getAccount().get("Купюр номиналом 100 рублей ");
       return maxSumValue = money10 * 10 + money50 * 50 + money100 * 100;
        }
    }


