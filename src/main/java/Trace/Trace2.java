public class Trace2 {
    public static void main(String[] args) {
        int i;
        int num;

        num = 1;
        for (i = 0; i < 10; i++) {
            num += num;
        }
        System.out.println("iの値は"+ i);
        System.out.println("numの値は" + num);
    }
}
/*
 * 1+1,2+2,4+4,8+8,16+16,32+32,64+64,128+128,256+256,512+512と繰り返し
 * iの値は10、numの値は1024になる
 */