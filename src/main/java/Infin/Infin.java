public class Infin {
    public static void main(String[] args) {
        int i = 0;

        for ( ; ; ){        // 条件式だけ省略しても無限ループになる
            System.out.println("i = " + i);
            i++;
        }
    }
}
