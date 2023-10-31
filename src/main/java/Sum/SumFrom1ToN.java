import java.io.*;

public class SumFrom1ToN {
    public static void main(String[] args) throws IOException {
        /* 入力の準備とnの入力 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 終了置（ｎ）の設定 */
        System.out.print("nの値を入力");
        String buf = br.readLine();
        int n = Integer.parseInt(buf);

        /* 総和の累計エリア（sum）の宣言と初期化 */
        int sum = 0;

        /* 1からnまでの総和を求める */
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
/*
 * Question:
 * n = 70000;で実行すると結果が「-1844932296」とおかしな値になってしまった。
 * このプログラムだといったいｎがいくつまで正しく求められるでしょう？
 * 
 * int型の最大値は2147483647であるため、答えが2147450880になるn=65535まで求める
 * ことができる。
 */