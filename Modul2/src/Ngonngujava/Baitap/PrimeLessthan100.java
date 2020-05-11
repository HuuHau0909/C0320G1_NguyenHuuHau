package Ngonngujava.Baitap;

public class PrimeLessthan100 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while (i < 100) {
                if (checkPrime(i)){
                    System.out.println("So nguyen to thu "+(count+1)+" la " +i);
                    count++;
                }
                i++;
            }
        }

    public static boolean checkPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
