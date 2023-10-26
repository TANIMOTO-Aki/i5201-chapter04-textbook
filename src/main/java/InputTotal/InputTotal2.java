/* 
 * 入力された値（整数）の合計を求めるプログラム（InputTotal2.java）
 * 入力の終了は[Ctrl]+[Z]を入力して[Enter]
 */
import java.io.*;

public class InputTotal2 {
    public static void main(String[] args) throws IOException {
        
        /* 入力の準備 */
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
        System.out.println("整数を連続して入力してください");
        System.out.println("終了は[Ctrl]+[Z]を入力して[Enter]");

        int sum = 0;                                // 総和の累計エリア（sum）

        /* 入力の繰り返し */
        String buf;                                 // 入力バッファ
        while ((buf= br.readLine()) != null) {      // 入力があれば繰り返し
            sum += Integer.parseInt(buf);           // 入力値の加算
        }

        System.out.println("合計は" + sum);         // 総和の表示
    }
}
