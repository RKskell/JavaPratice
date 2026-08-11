//숫자 분석 프로그램
//정수 하나를 입력받아 양수,음수,0, 홀/짝 구분, 3과 5의 배수 여부 확인

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberAnalyzer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[숫자 분석 프로그램]");
        System.out.print("정수 하나를 입력하세요 : ");
        int Num = Integer.parseInt(br.readLine());
        String UpDownNum;
        String EvenOddNum;
        String MultiNum;
        if(Num==0)
            UpDownNum="0";
        else if(Num<0)
            UpDownNum="음수";
        else UpDownNum="양수";

        if(Num%2==0)
            EvenOddNum="짝수";
        else EvenOddNum="홀수";

        if(Num%3==0 && Num%5==0 && Num > 0)
            MultiNum="3과 5의 배수 입니다.";
        else if (Num%3==0 && Num > 0)
            MultiNum="3의 배수 입니다.";
        else if (Num%5==0 && Num > 0)
            MultiNum="5의 배수 입니다.";
        else MultiNum="3과 5의 배수가 아닙니다.";

        System.out.println("입력된 정수는 "+UpDownNum+", "+EvenOddNum+"이며 "+MultiNum);
    }
}
