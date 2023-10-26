public class Total03 {
    public static void main(String[] args) {
        int i;                          //①加算する値
        int sum;                        //②累計エリア

        sum = 0;                        //③累計エリアの初期化
        for (i = 1; i <= 10; i++) {   //④、⑤、⑦
            sum += i;                   //⑥
        }
        System.out.println(sum);        //⑧総和の表示
    }
}
