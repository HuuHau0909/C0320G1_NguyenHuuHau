package Ngonngujava.TestCode;

import java.util.Scanner;

public class TestUclnEuclid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = Math.abs(Integer.parseInt(input.nextLine()));
        System.out.println("Input b: ");
        int b = Math.abs(Integer.parseInt(input.nextLine()));
        if(a ==0 && b==0){
            System.out.println("No greatest common factor");
        }else {
            System.out.println("Greatest common factor of "+a+" and "+b+" is "+Greatest(a,b));
        }
    }
    public static int Greatest(int a,int b){
        if (b==0) return a;
        return Greatest(b,a%b);
    }
}
