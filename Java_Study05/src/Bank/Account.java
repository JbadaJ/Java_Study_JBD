package Bank;

public class Account {
    private String accountNumber;
    protected double balance; // 보호 수준을 protected로 하여 상속받은 클래스가 접근 가능하게
    
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " 입금 완료. 잔액: " + balance);
        } else {
            System.out.println("입금 금액이 유효하지 않습니다.");
        }
    }
    
    // 기본 인출 로직 (음수 잔액 허용 안함)
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " 출금 완료. 잔액: " + balance);
            return true;
        } else {
            System.out.println("출금 실패. 잔액 부족 또는 금액이 유효하지 않음.");
            return false;
        }
    }

    public void printInfo() {
        System.out.println("계좌번호: " + accountNumber + ", 잔액: " + balance);
    }
}

