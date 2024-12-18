package Bank;

public class CheckingAccount extends Account {
    private double overdraftLimit; // 오버드래프트 한도

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // 당좌 계좌는 오버드래프트 한도 내에서 음수 잔액 허용
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println(amount + " 출금 완료(오버드래프트 사용 가능). 잔액: " + balance);
            return true;
        } else {
            System.out.println("출금 실패. 잔액 및 오버드래프트 한도 부족.");
            return false;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("당좌계좌 - 계좌번호: " + getAccountNumber() + ", 잔액: " + getBalance() + ", 오버드래프트 한도: " + overdraftLimit);
    }
}
