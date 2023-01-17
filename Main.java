import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws AtmMachineException {
        Scanner scanner = new Scanner(System.in);
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.putMoney();
        WithdrawMoney withdrawMoney = new WithdrawMoney();
        Replenish replenish = new Replenish();
        Balance balance = new Balance();
        Sum sum = new Sum();
        Exit exit = new Exit();
        while (exit.getExit() == true) {
            mainMenu ();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    withdrawMoney.inPutMoneyForWithdraw(sum,balance, atmMachine);
                    System.out.println("Отчет о проделанной работе:");
                    System.out.println("Остаток на счете = " + balance.getBalanceCard());
                    sum.getAmountBanknot();
                     break;
                case 2:
                    replenish.inPutMoney();
                    break;
                case 3:
                    balance.getBalanceCard();
                case 4:
                    sum.getBalanceAtmMachine();
                    break;
                case 5:
                    exit.setExit(false);
                default:
                    System.out.println("Такой команды нет");
            }
        }
        scanner.close();
    }
    public static void mainMenu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Главное меню:");
        System.out.println("Для снятия наличных введите цифру - 1");
        System.out.println("Для пополнения карточки введите цифру  - 2");
        System.out.println("Для просмотра баланса вашей карты введите - 3");
        System.out.println("Для просмотра максимальной суммы для снятия введите - 4");
        System.out.println("Выход - 5");

    }
    }
