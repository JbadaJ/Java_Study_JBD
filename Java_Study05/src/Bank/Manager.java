package Bank;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void printAllAccounts() {
        for (Account acc : accounts) {
            acc.printInfo(); // 다형성: Account 타입으로 참조해도 실제로는 SavingsAccount나 CheckingAccount의 printInfo()가 호출됨
        }
    }
}
