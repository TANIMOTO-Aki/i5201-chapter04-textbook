public class ExamLoop {
    public static void main(String[] args) {
        int num =8;                         // ①　指定した数（表示個数）
        int i;                              // ②　カウンタ

        for (i = 0; i < num; i++) {         // 　 forでループ制御する
            System.out.print(".");      // ③　.の表示（改行無しで表示）
        }
        System.out.println();               // ④　改行
    }
}
