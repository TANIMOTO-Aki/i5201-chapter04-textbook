public class ExamLoop2 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.print("i=" + i);   // iの値表示

            for (int j = 0; j < i; j++) {   // for文のネスト
                System.out.print(".");    // .の表示
            }

            System.out.println();           // 改行
        }
    }
}
