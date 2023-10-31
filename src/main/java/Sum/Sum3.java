public class Sum3 {
    public static void main(String[] args) {
        int i;                              // カウンタ
        int sum;                            // 総和

        sum = 0;                            // 初期化
        i = 0;
        while (i < 10) {
            i++;
            sum += i;
        }
        System.out.println(sum);
    }
}
