import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력받은 점수와 수강생 수에 따라 등급컷을 나눠주는 프로그램
//A+: 95점 이상, A: 90점 이상 95점 미만, B+: 85점 이상 90점 미만, B: 80점 이상 85점 미만
//C+:75점 이상 80점 미만, C: 70점 이상 75점 미만, D+: 65점 이상 70점 미만, D: 60점 이상 65점 미만, 
//F: 60점 미만
//상대평가도 적용해 A등급은 전체 수강 인원의 40% 이하 (A와 A+ 비율은 교수 재량)
//B등급은 A등급을 포함하여 누적 70% 이하 (즉, B학점 자체는 30%까지 부여 가능, B와 B+ 비율은 교수 재량)
//C등급 이하는 전체 인원의 30% 이상 필수 배정

public class GradeCalculatorEnhanced {
    String LectureName;
    String ProfessorName;
    int TotalStudent;
    String Student[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    }
}

class Menu {
    String StartMenu(BufferedReader br) {
        System.out.println("[학점 계산기]");
        System.out.print("강좌명 입력 : ");
        LectureName = br.readLine();

    }
}

class Calculate {
    public Grade(int n) {
        String Grade;
        if(n>=95)
            Grade = "A+";
        else if(n<95 && n>=90)
            Grade = "A";
        else if(n<90 && n>=85)
            Grade = "B+";
        else if(n<85 && n>=80)
            Grade = "B";
        else if(n<80 && n>=75)
            Grade = "C+";
        else if(n<75 && n>=70)
            Grade = "C";
        else if(n<70 && n>=65)
            Grade = "D+";
        else if(n<65 && n>=60)
            Grade = "D";
        else Grade = "F";
        return ;
    }
}