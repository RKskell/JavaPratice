//은행 계좌 프로그램
//포함 기능 : 입금, 출금, 잔액 조회

import java.io.BufferedReader;
import java.io.InputStreamReader;

class BankAccount{
    private int Money; //잔액

    public BankAccount() {
        this.Money = 0;
    }

    public void Deposit(int Amount) //입금
    {
        if (Amount > 0){
            Money+=Amount;
            System.out.println(Amount+"원이 입금되었습니다.");
        } else {
            System.out.println("입금 금액은 0 보다 많아야 합니다.");
        }
        

    }
    
    public void Withdrawal(int Amount) //출금
    {
        if(Money>0 && Money >= Amount)
        {
            Money -= Amount;
            System.out.println(Amount+"원이 출금되었습니다.");
        } else if (Money < Amount)
        {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println("출금 금액은 0 보다 많아야 합니다.");
        }
    }

    public void CheckMoney(){
        System.out.println("현재 잔액은 "+Money+"원 입니다.");
    }
}

public class BankAccountProgram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BankAccount account = new BankAccount();

        System.out.println("[은행 계좌 프로그램]");
        System.out.println("1. 입금");
        System.out.println("2. 출금");
        System.out.println("3. 잔액 확인");
        System.out.println("4. 종료");
        System.out.print("원하는 기능을 입력하세요 : ");

        int choice = Integer.parseInt(br.readLine());

        switch(choice){
            case 1:
                System.out.print("입금할 금액 : ");
                int DepositAmount = Integer.parseInt(br.readLine());
                account.Deposit(DepositAmount);
                break;

            case 2:
                System.out.print("출금할 금액 : ");
                int WithdrawalAmount = Integer.parseInt(br.readLine());
                account.Withdrawal(WithdrawalAmount);
                break;

            case 3:
                account.CheckMoney();
                break;
            
            case 4:
                System.out.println("프로그램을 종료합니다.");
                return;

            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }
}