public class Sum2 {
    public static void main(String[] args) {
        int i;                              // カウンタ
        int sum;                            // 総和

        sum = 0;                            // 初期化
        i = 10;
        while (i > 0) {
            sum = sum + i;
            i--;
        }
        System.out.println(sum);
    }
}
