public class Multiple1 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 9) {
            while (j <= 9) {
                System.out.print(" " + i * j);
                j++;
            }
        System.out.println("");
        i++;
        j = 1;
        }
    }
}
