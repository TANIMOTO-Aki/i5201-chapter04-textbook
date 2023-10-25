public class Loop1 {
    public static void main(String[] args) {
        int i = 0;                              // ①変数iを宣言、０で初期化

        while (i < 3) {                         // ②while条件式の評価
            System.out.println("iの値は" + i);  // ③「iの値は〇〇」と表示する
            i = i + 1;                          // ④iに1を加算し②へ戻る
        }
        System.out.println("iの最後の値は" + i); // ⑤「iの最後の値は3」と表示する
    }
}
