package Bank;

public class SavingAccount extends Account {
    private double interestRate; // 예: 연이자율 2% -> 0.02

    public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // 일정 기간이 지났을 때 이자 추가
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("이자 " + interest + " 원 추가. 잔액: " + balance);
    }

    @Override
    public void printInfo() {
        System.out.println("저축계좌 - 계좌번호: " + getAccountNumber() + ", 잔액: " + getBalance() + ", 이자율: " + interestRate);
    }
}
