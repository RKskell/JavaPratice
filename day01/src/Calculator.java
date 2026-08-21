import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
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
*/

public class Calculator {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("[계산기]");
        System.out.println("1. 덧셈");
        System.out.println("2. 뺄셈");
        System.out.println("3. 곱셈");
        System.out.println("4. 나눗셈");
        System.out.println("5. 종료");
        System.out.print("원하는 기능 입력 : ");

        int Input = Integer.parseInt(br.readLine());

        switch (Input)
        {
            case 1:
                System.out.print("덧셈할 두 수 입력(공백 구분) : ");
                String[] AddNum = br.readLine().split(" ");
                int AddResult = Integer.parseInt(AddNum[0]) + Integer.parseInt(AddNum[1]);
                System.out.println("덧셈 결과 : " + AddResult);
                break;
                
            case 2:
                System.out.print("뺄셈할 두 수 입력(공백 구분) : ");
                String[] SubNum = br.readLine().split(" ");
                int SubResult = Integer.parseInt(SubNum[0]) - Integer.parseInt(SubNum[1]);
                System.out.println("뺄셈 결과 : " + SubResult);
                break;

            case 3:
                System.out.print("곱셈할 두 수 입력(공백 구분) : ");
                String[] MultNum = br.readLine().split(" ");
                int MultResult = Integer.parseInt(MultNum[0]) * Integer.parseInt(MultNum[1]);
                System.out.println("곱셈 결과 : " + MultResult);
                break;

            case 4:
                System.out.print("나눗셈할 두 수 입력(공백 구분) : ");
                String[] DivNum = br.readLine().split(" ");
                double DivResult = Double.parseDouble(DivNum[0]) / Double.parseDouble(DivNum[1]);
                System.out.printf("나눗셈 결과 : %.2f \n", DivResult);
                break;

            case 5:
                System.out.println("프로그램을 종료합니다.");
                return;

            default:
                System.out.print("잘못된 입력입니다.");
                break;
        }
    }
}