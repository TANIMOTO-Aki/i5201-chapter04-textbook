public class Total02_1 {
    public static void main(String[] args) {
        int i;                      //①　加算する値(i)
        int sum;                    //②　総和の累計エリア(sum)

        sum = 0;                    //③　sumの初期化
        i = 1;                      //④　iを1に初期化
        while (i <= 10) {           //⑤　iが10以下のとき繰り返す
            sum += i;               //⑥　累計エリアにiを加算
            i++;                    //⑦　iをカウントアップ
        }
        System.out.println(sum);    //⑧　総和の表示
    }
}
