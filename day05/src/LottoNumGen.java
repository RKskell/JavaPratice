//로또 번호 생성기
//A ~ E 까지 각 항목 당 1~45까지 무작위 수 추첨
//1~9까지는 앞에 0 추가

public class LottoNumGen {
    public static void main(String[] args) throws Exception {
        System.out.println("[로또 번호 생성기]");
        int[] LottoNum = new int[5];

        for(int i=0; i<LottoNum.length; i++) {
            LottoNum[i] = (int)(Math.random()*45)+1;
            for(int j=0; j<i; j++) {
                if(LottoNum[i] == LottoNum[j])
                    i--;
                break;
            }
        }
        for(int i=0; i<LottoNum.length; i++){
            if(LottoNum[i] < 10)
                System.out.print("0" + LottoNum[i] + " ");
            else
                System.out.print(LottoNum[i] + " ");
        }
    }
}
