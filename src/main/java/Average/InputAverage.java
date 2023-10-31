import java.io.*;

public class InputAverage {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        System.out.println("点数を連続して入力してください");
        System.out.println("終了は[Ctrl]+[Z]を入力して[Enter]");

        String buf;                                         // 入力バッファ
        int sum = 0;                                        // 合計エリア
        int i = 0;                                          // 件数カウンタ

        /* 入力の繰り返し */
        while ((buf = br.readLine()) != null) {             // 入力があれば繰り返し
            sum += Integer.parseInt(buf);                   // 点数の累計
            i += 1;                                         // データ件数のカウント
        }

        System.out.println("合計:" + sum);                  // 合計の表示
        System.out.println("件数:" + i);                    // データ件数の表示
        System.out.println("平均:" + (sum / i));            // 平均の表示
    }
}
