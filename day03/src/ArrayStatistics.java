//배열 통계 프로그램
//정수 10개를 입력받아 합계, 평균, 최댓값, 최솟값, 평균 이상인 숫자의 개수를 계산한다.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayStatistics {
    public static void main(String[] args) throws Exception {
        int Sum = 0;
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[배열 통계 프로그램]");
        System.out.print("정수 10개를 입력하세요(공백 구분) : ");
        String[] input = br.readLine().split(" ");

        int[] Numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            Numbers[i] = Integer.parseInt(input[i]);
        }
        
        int MaxNum = Numbers[0];
        int MinNum = Numbers[0];

        for(int i=0;i<10;i++){
            Sum += Numbers[i];

            if(Numbers[i]>MaxNum)
                MaxNum = Numbers[i];
            if(Numbers[i]<MinNum)
                MinNum = Numbers[i];
        }
        double Avg = Sum / 10.0;

        for (int i = 0; i < 10; i++) {
            if(Numbers[i] >= Avg)
            count++;
        }
        System.out.println("배열의 합계 : "+Sum+" 평균 : "+Avg+" 최댓값 : "+MaxNum+" 최솟값 : "+MinNum+" 평균 이상인 숫자의 개수 : "+count);
    }
}
