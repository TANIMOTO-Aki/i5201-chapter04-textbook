public class Trace3 {
    public static void main(String[] args) {
        
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + (i * j));
            }
            System.out.println();
        }
    }
}
/*　＜結果＞
 *  1
 *  2 4
 *  3 6 9
 */