public class NestLoop {
    public static void main(String[] args) {
        
    for (int i = 10; i > 0; i--) {
            System.out.print("i=" + i + "\t");  // iの値とタブの表示
            for (int j = i; j > 0; j--) {
                System.out.print("o");        // 〇の表示（繰り返し）
            }
            System.out.println();               // 改行
        }
    }
}