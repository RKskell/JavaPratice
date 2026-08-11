//구구단 2~9단 출력 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("구구단 단 수 입력(2~9/종료:0) : ");
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                System.out.println("구구단을 종료합니다.");
                break;
            }
            if(num < 2 || num > 9){
                System.out.println("2~9 사이 수를 입력하세요.");
                continue;
            }
            System.out.println("["+num+"단]");
            for(int i=1; i<10;i++)
            {
                System.out.println(num+"*"+i+"="+(num*i));
            }
            System.out.println();
        }
        br.close();
    }
}
