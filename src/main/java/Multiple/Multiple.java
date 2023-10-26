/*
 * 指定した段の九九を行うプログラム
 */
import java.io.*;

public class Multiple {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        System.out.println("何の段の九九表を表示しますか？");
        /* 段の指定 */
        int num = Integer.parseInt(br.readLine());      //何の段か入力
        int i;

        for (i = 0; i <= 9; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }
}
