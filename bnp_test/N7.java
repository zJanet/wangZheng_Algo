package bnp_test;

public class N7 {
    public void doIt(int x, int y, int m){
        System.out.println(m + "------static");

        if (x == 5){
            m = y;
        } else {
            m = x;
        }
    }
    public static void main(String[] args) {
        int i = 5, j = 4, k = 8;
        N7 n7 = new N7();
        n7.doIt(i, j, k);
        System.out.print(k);
    }
}