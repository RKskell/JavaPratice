//최빈값 계산기
//여러 개의 정수 중 가장 많이 등장한 숫자를 찾는다.
//숫자 범위는 0~100이다.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mode {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[최빈값 계산기]");
        System.out.print("0~100 사이의 정수를 입력하세요(공백 구분) : ");

        String[] Input = br.readLine().split(" "); //정수 입력 받기
        int[] CountNumber = new int [101];//최빈값 비교를 위한 정수 저장

        for(String s : Input){
            int num = Integer.parseInt(s);
            CountNumber[num]++;
        }

        int Mode = 0;
        int ModeCount = 0;

        for(int i=0; i<CountNumber.length; i++)
        {
            if(CountNumber[i]>ModeCount){
                ModeCount = CountNumber[i];
                Mode = i;
            }
        }
        System.out.println("최빈값 : "+Mode+" 최빈값 빈도 : "+ModeCount);
    }
}
