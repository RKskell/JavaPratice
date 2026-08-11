//문자열 분석기
//문자열을 입력받아 전체 글자 수, 영문자 수, 숫자 수, 공백 수, 모음 수, 문자열을 뒤집은 결과

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringParser {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("[문자열 분석기]");
        System.out.print("문자열을 입력하세요 : ");

        String Input = br.readLine();
        int TotalString = Input.length();
        int TotalAlpha = 0;
        int TotalNum = 0;
        int TotalSpace = 0;
        int TotalVowel = 0;

        for(int i=0; i<Input.length(); i++)
        {
            char ch = Input.charAt(i);
            if(Character.isLetter(ch))
                TotalAlpha++;
            else if(Character.isDigit(ch))
                TotalNum++;
            else if(Character.isWhitespace(ch))
                TotalSpace++;
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                TotalVowel++;
        }
        System.out.println("문자열의 전체 글자 수 : "+TotalString+" 영문자 수 : "+TotalAlpha+" 숫자 수 : "+TotalNum+
        " 공백 수 : "+TotalSpace+" 모음 수 : "+TotalVowel+" 문자열 뒤집은 결과 : "+new StringBuilder(Input).reverse().toString());
    }
}
