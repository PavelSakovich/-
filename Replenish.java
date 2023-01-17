import java.util.HashMap;
import java.util.Scanner;

public class Replenish extends AtmMachine{
    private Balance balance = new Balance();
   private int setBalanceCard;

    public void inPutMoney () {
        HashMap<String, Integer> listMap = getAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номинал купюры которые будете вносить. Доступные купюры\" 10\" , \" 50\", \" 100\": ");
        int firstBanknote = scanner.nextInt();
        System.out.println("Затем, введите количество вносимых купюр:");
        int secondBanknote = scanner.nextInt();
        replenishBanKnotATMMachineAndCard (firstBanknote, secondBanknote);
        setBalanceCard = firstBanknote * secondBanknote;
        balance.setBalanceCard(setBalanceCard);
        scanner.close();
    }
    public void replenishBanKnotATMMachineAndCard (int firstBanknote, int secondBanknote) {
        switch (firstBanknote) {
            case 10:
                int currentBalance10 = getAccount().get("Купюр номиналом 10 рублей ");
                getAccount().replace("Купюр номиналом 10 рублей ", secondBanknote + currentBalance10);
            case 50:
                int currentBalance50 = getAccount().get("Купюр номиналом 50 рублей ");
                getAccount().replace("Купюр номиналом 50 рублей ", secondBanknote + currentBalance50);
            case 100:
                int currentBalance100 = getAccount().get("Купюр номиналом 100 рублей ");
                getAccount().replace("Купюр номиналом 100 рублей ", secondBanknote + currentBalance100);
            default:
                System.out.println("Такой команды нет, поробуйте еще раз");
                inPutMoney();
        }
    }
        public int setBalanceCard (int setBalanceCard){
            return setBalanceCard;
        }
    }


