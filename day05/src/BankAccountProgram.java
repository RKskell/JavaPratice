//은행 계좌 프로그램
//포함 기능 : 입금, 출금, 잔액 조회

import java.io.BufferedReader;
import java.io.InputStreamReader;

class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        } else {
            System.out.println("입금 금액은 0보다 커야 합니다.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println("출금 금액은 0보다 커야 합니다.");
        }
    }

    public void checkBalance() {
        System.out.println("현재 잔액: " + balance + "원");
    }
}

public class BankAccountProgram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BankAccount account = new BankAccount();

        while (true) {
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 조회");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.print("입금할 금액: ");
                    int depositAmount = Integer.parseInt(br.readLine());
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("출금할 금액: ");
                    int withdrawAmount = Integer.parseInt(br.readLine());
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}