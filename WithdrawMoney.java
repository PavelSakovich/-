import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class WithdrawMoney extends AtmMachine {

    public void inPutMoneyForWithdraw(Sum sum, Balance balance, AtmMachine atmMachine) throws AtmMachineException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для снятия наличных ( минимал банкноты 10 рублей): ");
        int sumMoney = scanner.nextInt();
        // проверяем есть ли выводимая сумма в банкомате и не отрицательная
        if (balance.getBalanceCard() < sumMoney) {
            throw new AtmMachineException("На карте недостаточно средств");
        } else if (sum.maxSum() < sumMoney) {
            throw new AtmMachineException("В банкомате недостаточно купюр");
        } else {
            randomMoney(sumMoney, sum, balance);
        }
        scanner.close();
    }
        public void randomMoney (int sumMoney, Sum sum, Balance balance) throws AtmMachineException{
            Random generator = new Random();
            Object[] values = getAccount().values().toArray();
            while (sumMoney != 0) {
                int randomValue = (int) values[generator.nextInt(values.length)];
                if (getAccount().get("Купюр номиналом 10 рублей ") == randomValue && randomValue > 0) {
                    getAccount().replace("Купюр номиналом 10 рублей ", randomValue - 1);
                    balance.setBalanceCard(balance.getBalanceCard() - 10);
                    sumMoney = sumMoney -10;
                } else if (getAccount().get("Купюр номиналом 50 рублей ") == randomValue && randomValue > 0) {
                    getAccount().replace("Купюр номиналом 50 рублей ", randomValue - 1);
                    balance.setBalanceCard(balance.getBalanceCard() - 50);
                    sumMoney = sumMoney - 50;
                }
                    else if (getAccount().get("Купюр номиналом 100 рублей ") == randomValue && randomValue > 0) {
                        getAccount().replace("Купюр номиналом 100 рублей ", randomValue - 1);
                    balance.setBalanceCard(balance.getBalanceCard() - 100);
                        sumMoney = sumMoney - 100;
                } else {
                    sumMoney = sumMoney + 0;
                }

                }
        }
}
