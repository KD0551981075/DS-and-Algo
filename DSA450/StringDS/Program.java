package StringDS;

import java.util.Scanner;

public class Program {

    public static int TimeConvert(int num) { // code goes here
        int hours = num / 60;
        int minutes = num % 60;
        return Integer.valueOf(hours + ":" + minutes);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(TimeConvert(s.nextInt()));
    }
}