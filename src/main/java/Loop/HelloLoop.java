public class HelloLoop {
    public static void main(String[] args) {
        int i = 0;                              // カウンタの宣言

        while (i <= 4) {                        // ループ処理
            System.out.println("Hello!");     // Hello!を表示
            i = i + 1 ;                         // カウントアップ
        }
    }
}

/*
 * 5回表示される
 */