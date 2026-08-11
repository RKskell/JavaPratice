///////////////////////////////////////////////////////////////////////////
//                            [개선점]                                   //
//1. 기존 계산기 코드는 클래스를 여러 개(4 개) 사용 하지만 하는 일은 3가지   //
//   -> 규모가 작으므로 클래스를 나누기 보다 하나의 클래스 안에              //
//      메서드로 역할을 구분하는 편이 더 읽기 쉬움                          //
//2. static 메서드 사용해 불필요한 객체 생성 줄임                          //
//   -> 현재 생성된 객체들은 각각 상태를 저장하지 않음                      //
//      객체마다 보존해야 하는 필드가 없으므로 static 사용해 객체 없이 호출  //
//      이전 계산 결과나 전체 계산 횟수를 저장해야 한다면 객체 생성 필요     //
//3. 입력용 BufferedReader는 하나만 생성                                  //
//   -> 같은 System.in을 사용하는 BufferedReader를 여러 개 생성 시         //
//      입력 버퍼 관리가 복잡해질 수 있기에 하나만 생성해 공유              //
//4. 숫자 입력 코드를 한 곳으로 모음                                      //
//   -> 숫자 입력을 계산 방식 마다 받지 않고, 한 번만 받아 공유해 계산      //
//   -> 입력 단에 "if(st.countTokens() !=2 {                            //
//      throw new IllegalArgumentException("오류");                    //
//      추가해 반드시 숫자는 두 개만 입력 받도록 예외처리                 //
//5. 메뉴 선택과 실제 계산 분리                                         //
//   -> 메서드의 역할을 분리해 각 메서드는 한 가지 역할만 담당하도록 함    //
//      메뉴 입력 문제 : selectMenu(), 숫자 입력 문제 : inputNumbers()  //
//      연산 선택 문제 : calculate(), 나눗셈 문제 : divide()            //
//      단일 책임 원칙을 준수하기 위해                                  //
//6. CalcBox 클래스의 내부 클래스 구조 변경                             //
//  -> CalcBox가 외부 클래스 Calc의 필드나 객체 상태를 사용X            //
//  -> 따라서 두 개의 일반 클래스로 나누어 객체 지향 구조 유지           //
//////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculatorEnhanced {
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