package ClassAndObject.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

 class ApplicationStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long[] temp = new long[100000];
        for (int i =0;i<temp.length;i++){
            temp[i] = (long)(Math.random()*100000);
        }
        System.out.println(Arrays.toString(temp));
        stopWatch.start();
        System.out.println(stopWatch.start());
        Arrays.sort(temp);
        stopWatch.stop();
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
        System.out.println(Arrays.toString(temp));
    }
}
