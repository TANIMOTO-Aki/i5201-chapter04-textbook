public class Debug2 {
    public static void main(String[] args) {
        int i;
        int sum;

        i = 1;
        sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
/*
 * 各種演算子等の間に半角スペースが入っていないため正しく動作しなかった。
 * また、i=1で(i < 100)の場合99回繰り返すため、足す回数が1回足りない。
 */