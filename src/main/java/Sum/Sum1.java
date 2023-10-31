public class Sum1 {
    public static void main(String[] args) {
        int i;                              // カウンタ
        int sum;                            // 総和

        i = 1;                              // 初期化
        sum = 0;
        while (i < 11) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
