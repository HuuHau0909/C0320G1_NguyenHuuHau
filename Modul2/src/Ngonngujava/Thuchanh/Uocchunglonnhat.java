package Ngonngujava.Thuchanh;

import java.util.Scanner;

public class Uocchunglonnhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("Input b: ");
        int b = Integer.parseInt(input.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if(a ==0 && b==0){
            System.out.println("No greatest common factor");
        }else if((a==0 ||b==0)){
            System.out.println("Greatest common is: "+ (a+b));
        } else {
            while (a!=b){
                if(a>b)
                    a-=b;
                else b-=a;
            }
            System.out.println("Greatest common is: " +a);
        }
    }
}
