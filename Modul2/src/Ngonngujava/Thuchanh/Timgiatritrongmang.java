package Ngonngujava.Thuchanh;

import java.util.Scanner;

public class Timgiatritrongmang {
    public static void main(String[] args) {
        String[] students = {"Alex", "Max", "John", "Joe", "Garen", "Lux"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = sc.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the lish " + input_name + "is " + (i + 1));
                isExit = true;
                break;
            }
        }
    }
}
