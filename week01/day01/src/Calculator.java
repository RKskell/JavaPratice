import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Start 
{
    int startSet(BufferedReader br) throws IOException
    {
        System.out.println("[계산기]");
        System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
        System.out.print("원하는 계산(숫자만 입력) : ");

        return Integer.parseInt(br.readLine());
    }
}

class Calc
{
    int calculate(int n, BufferedReader br) throws IOException
    {
        CalcBox obj = new CalcBox();
        System.out.print("계산할 수 입력 (예: 10 20) : ");
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        switch(n){
            case 1:
                return obj.add(a, b);

            case 2:
                return obj.sub(a, b);

            case 3:
                return obj.mul(a, b);

            case 4:
                return obj.div(a, b);
            default:
                throw new IllegalArgumentException("계산 번호는 1부터 4까지만 입력할 수 있습니다.");
        }
    }
    
    class CalcBox
    {
        int add(int a, int b)
        {
            return a + b;
        }

        int sub(int a, int b)
        {
            return a - b;
        }

        int mul(int a, int b)
        {
            return a * b;
        }
        int div(int a, int b)
        {
            if (b == 0){
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return a / b;
        }
    }
}

public class Calculator {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Start s = new Start();
            int selectedNumber = s.startSet(br);

            Calc c = new Calc();
            int result = c.calculate(selectedNumber, br);

            System.out.println("계산 결과 : " + result);

        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력하세요.");
        } catch (ArithmeticException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("입력 처리 중 오류 발생");
        }
    }
}