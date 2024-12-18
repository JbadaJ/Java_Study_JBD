package Bank;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        
        // 저축계좌 생성: 계좌번호 "S001", 초기 잔액 1000원, 이자율 2%
        SavingAccount sAcc = new SavingAccount("S001", 1000, 0.02);
        manager.addAccount(sAcc);

        // 당좌계좌 생성: 계좌번호 "C001", 초기 잔액 500원, 오버드래프트 한도 300원
        CheckingAccount cAcc = new CheckingAccount("C001", 500, 300);
        manager.addAccount(cAcc);

        // 모든 계좌 정보 출력
        manager.printAllAccounts();

        // 저축계좌에 입금
        sAcc.deposit(200);
        // 당좌계좌에 출금 (잔액 500이지만 800 출금 가능, 오버드래프트 사용)
        cAcc.withdraw(700);

        // 저축계좌 이자 추가
        sAcc.addInterest();

        // 모든 계좌 정보 재출력
        manager.printAllAccounts();
    }
}
