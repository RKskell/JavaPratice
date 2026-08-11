//회문 판별기
//앞에서 읽어도 뒤에서 읽어도 같은 문자열인지 확인

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PalindromeChecker {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[회문 판별기]");
        System.out.print("문자열을 입력하세요 : ");
        String Input = br.readLine();
        
        String[] InputString = new String[Input.length()];
        String[] CheckString = new String[InputString.length];

        for(int i=0;i<Input.length();i++)
        {
            char ch = Input.charAt(i);
            InputString[i] = String.valueOf(ch);
        }
        for(int i=0;i<InputString.length;i++)
        {
            CheckString[i] = InputString[InputString.length-1-i];
        }
        boolean IsEqueal = Arrays.equals(InputString, CheckString);
        if(IsEqueal == true)
            System.out.println("회문 입니다.");
        else System.out.println("회문이 아닙니다.");
    }
}
