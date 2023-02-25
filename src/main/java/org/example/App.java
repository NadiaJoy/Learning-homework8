package org.example;

import java.util.Random;

public class App {
    public static void main(String[] args) {
//ex.3
        int j = 7;
        while (j <= 98) {
            System.out.println(j);
            j = j + 7;
        }
//ex.4
        int[] myArray20 = new int[20];
        int sum = 0;
        Random rand = new Random();

        for (int i = 0; i < myArray20.length; i++) {
            myArray20[i] = rand.nextInt();
            sum = sum + myArray20[i];
        }
        int average = sum / myArray20.length;
        System.out.println("Average of Array20 = " + average);
//ex.5
        int[] myArray10 = new int[10];
        for (int i = 0; i < myArray10.length; i++) {
            myArray10 [i] = rand.nextInt();
           // System.out.println(myArray10[i]);
        }
        int max = myArray10[0];
        for (int i = 1; i < myArray10.length; i++) {
            if (myArray10[i] > max)
                max = myArray10[i];
        }
        System.out.println("Max of Array10= " + max);
    }

}
