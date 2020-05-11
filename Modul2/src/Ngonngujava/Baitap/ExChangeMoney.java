package Ngonngujava.Baitap;

import java.util.Scanner;

public class ExChangeMoney {
    public static void main(String[] args) {
        float rate = 23000;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền usd muốn đổi: ");
        float usd = input.nextFloat();
        float vnd = usd*rate;
        System.out.println("Số tiền đổi được là: "+vnd);
    }
}
