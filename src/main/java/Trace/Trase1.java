package Trace;
public class Trase1 {
    public static void main(String[] args) {
        int i;
        int num;

        num = 1;
        i = 0;
        while (i < 4) {
            num += num;
            i++;
        }
        System.out.println("iの値は" + i);
        System.out.println("numの値は" + num);
    }
}
