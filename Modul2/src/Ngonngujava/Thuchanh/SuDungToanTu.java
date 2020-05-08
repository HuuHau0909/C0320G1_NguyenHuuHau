package Ngonngujava.Thuchanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Emter width");
        width = nhap.nextFloat();
        System.out.println("Enter height");
        height = nhap.nextFloat();
        float area = width*height;
        System.out.println("Area is: " + area);
    }
}
