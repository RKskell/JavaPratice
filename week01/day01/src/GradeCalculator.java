
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//성적을 입력 받으면 점수에 따라 A~F 출력 (세부 등급 없음)
//점수가 60점을 넘기면 합격, 미만이면 불합격
//입력값이 0~100 이외의 값은 잘못된 점수 처리


public class GradeCalculator {
    public static void main(String[] args) throws IOException {
        int Grade = 0;
        String Result;
        String Pass;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("점수 입력 : ");
        Grade = Integer.parseInt(br.readLine());
        if (Grade < 0 || Grade > 100)
            System.out.println("잘못된 입력 입니다.");
        else {
            if (Grade >= 90)
                Result = "A";
            else if (Grade >= 80)
                Result = "B";
            else if (Grade >= 70)
                Result = "C";
            else if (Grade >= 60)
                Result = "D";
            else Result = "F";

            if (Grade >= 60)
                Pass = "합격";
            else Pass = "불합격";
            System.out.println("[성적 결과]");
            System.out.println("등급 : "+Result+", "+Pass);
        }
    }
}
