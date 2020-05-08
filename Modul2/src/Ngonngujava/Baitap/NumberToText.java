package Ngonngujava.Baitap;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 10 && number >= 0) {
            switch (number) {
                case 0: {
                    System.out.println("Zero");
                    break;
                }
                case 9: {
                    System.out.println("Nine");
                    break;
                }
                case 1: {
                    System.out.println("One");
                    break;
                }
                case 2: {
                    System.out.println("Two");
                    break;
                }
                case 3: {
                    System.out.println("Three");
                    break;
                }
                case 4: {
                    System.out.println("Four");
                    break;
                }
                case 5: {
                    System.out.println("Five");
                    break;
                }
                case 6: {
                    System.out.println("Six");
                    break;
                }
                case 7: {
                    System.out.println("Seven");
                    break;
                }
                case 8: {
                    System.out.println("Eight");
                    break;
                }
                case 10: {
                    System.out.println("Ten");
                    break;
                }
            }
        } else if (number > 10 && number < 20) {
            switch (number) {

                case 11: {
                    System.out.println("Eleven");
                    break;
                }
                case 12: {
                    System.out.println("Twelve");
                    break;
                }
                case 13: {
                    System.out.println("Thirteen");
                    break;
                }
                case 14: {
                    System.out.println("Fourteen");
                    break;
                }
                case 15: {
                    System.out.println("Fifteen");
                    break;
                }
                case 16: {
                    System.out.println("Sixteen");
                    break;
                }
                case 17: {
                    System.out.println("Seventeen");
                    break;
                }
                case 18: {
                    System.out.println("Eighteen");
                    break;
                }
                case 19: {
                    System.out.println("Nineteen");
                    break;
                }
                case 20: {
                    System.out.println("Twenty");
                    break;
                }
            }
        } else if (number >= 20 && number < 100) {
            double tens = Math.floor(number / 10);
            int one = number % 10;
            String tensNum = "";
            String oneNum = null;
            switch ((int) tens) {
                case 2: {
                    tensNum = "Twenty";
                    break;
                }
                case 3: {
                    tensNum = "Thirty";
                    break;
                }
                case 4: {
                    tensNum = "Fourty";
                    break;
                }
                case 5: {
                    tensNum = "Fifty";
                    break;
                }
                case 6: {
                    tensNum = "Sixty";
                    break;
                }
                case 7: {
                    tensNum = "Seventy";
                    break;
                }
                case 8: {
                    tensNum = "Eighty";
                    break;
                }
                case 9: {
                    tensNum = "Ninety";
                    break;
                }
            }
            switch (one) {
                case 0: {
                    oneNum = "";
                    break;
                }
                case 9: {
                    oneNum = "Nine";
                    break;
                }
                case 1: {
                    oneNum = "One";
                    break;
                }
                case 2: {
                    oneNum = "Two";
                    break;
                }
                case 3: {
                    oneNum = "Three";
                    break;
                }
                case 4: {
                    oneNum = "Four";
                    break;
                }
                case 5: {
                    oneNum = "Five";
                    break;
                }
                case 6: {
                    oneNum = "Six";
                    break;
                }
                case 7: {
                    oneNum = "Seven";
                    break;
                }
                case 8: {
                    oneNum = "Eight";
                    break;
                }
            }
            System.out.printf("%s %s", tensNum, oneNum);
        } else if (number >= 100 && number < 1000) {
            int hundred = (int) Math.floor(number / 100);
            int tens = (int) Math.floor((number - hundred * 100) / 10);
            int one = number % 10;
            String hundredNum = "";
            String tensNum = "";
            String oneNum = null;
            switch (hundred) {
                case 1: {
                    hundredNum = "One hundred";
                    break;
                }
                case 2: {
                    hundredNum = "Two hundred";
                    break;
                }
                case 3: {
                    hundredNum = "Three hundred";
                    break;
                }
                case 4: {
                    hundredNum = "Four hundred";
                    break;
                }
                case 5: {
                    hundredNum = "Five hundred";
                    break;
                }
                case 6: {
                    hundredNum = "Six hundred";
                    break;
                }
                case 7: {
                    hundredNum = "Seven hundred";
                    break;
                }
                case 8: {
                    hundredNum = "Eight hundred";
                    break;
                }
                case 9: {
                    hundredNum = "Nine hundred";
                    break;
                }
            }
            switch (tens) {
                case 2: {
                    tensNum = "Twenty";
                    break;
                }
                case 3: {
                    tensNum = "Thirty";
                    break;
                }
                case 4: {
                    tensNum = "Fourty";
                    break;
                }
                case 5: {
                    tensNum = "Fifty";
                    break;
                }
                case 6: {
                    tensNum = "Sixty";
                    break;
                }
                case 7: {
                    tensNum = "Seventy";
                    break;
                }
                case 8: {
                    tensNum = "Eighty";
                    break;
                }
                case 9: {
                    tensNum = "Ninety";
                    break;
                }
            }
            switch (one) {
                case 0: {
                    oneNum = "";
                    break;
                }
                case 9: {
                    oneNum = "Nine";
                    break;
                }
                case 1: {
                    oneNum = "One";
                    break;
                }
                case 2: {
                    oneNum = "Two";
                    break;
                }
                case 3: {
                    oneNum = "Three";
                    break;
                }
                case 4: {
                    oneNum = "Four";
                    break;
                }
                case 5: {
                    oneNum = "Five";
                    break;
                }
                case 6: {
                    oneNum = "Six";
                    break;
                }
                case 7: {
                    oneNum = "Seven";
                    break;
                }
                case 8: {
                    oneNum = "Eight";
                    break;
                }
            }
            System.out.printf("%s and %s %s", hundredNum, tensNum, oneNum);
        }else {
            System.out.println("Out of ability");
        }
    }
}
