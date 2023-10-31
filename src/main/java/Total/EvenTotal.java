public class EvenTotal {
    public static void main(String[] args) {
        int sum = 0;                // 総和の累計エリア（sum）の宣言と初期化

        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
