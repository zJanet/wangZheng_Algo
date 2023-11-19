package bnp_test;

public class N2 {
   public static void main(String[] args) {
       int a=10;
       int b=25;
       int c=15;
       int result =0;
       while(b > 0){
           result += (a%c) +(c%a);
           b-= a%c;
           int temp = a;
           a = c;
           c = temp;
       }
       System.out.println(result);
   } 
}