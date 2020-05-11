package Ngonngujava.Thuchanh;

import java.util.Scanner;

public class LoanInterst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input loan money: ");
        double loanMoney = input.nextDouble();
        System.out.println("Input loan interst: ");
        double loanInterst = input.nextDouble();
        System.out.println("Input loan time: ");
        double loanTime = input.nextDouble();
        double moneyInterst = loanMoney*loanInterst/100/12*loanTime;
        System.out.println(" Loan money is: "+moneyInterst);
    }
}
