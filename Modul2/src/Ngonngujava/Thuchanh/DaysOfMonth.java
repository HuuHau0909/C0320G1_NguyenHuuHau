package Ngonngujava.Thuchanh;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng cần tính số ngày: ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31 ngày ";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "31 ngày ";
                break;
            case 2:
                System.out.println("Nhập năm cần kiểm tra");
                        int year = scanner.nextInt();
                        if ((year % 4 ==0 && year % 100 !=0)||(year % 100 ==0 && year % 400 ==0)) {
                            daysInMonth = "29 ngày";
                        } else {
                            daysInMonth = "28 ngày";
                        }
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth != "") {
            System.out.printf("Tháng %d có %s",month,daysInMonth);
        }
    }
}
