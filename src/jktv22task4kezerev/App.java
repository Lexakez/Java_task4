/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22task4kezerev;

import java.util.Arrays;
import java.util.Random;


class App {

    void run() {
        int[] masiv = new int[100];
        Random random = new Random();


        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(100);
            if((num % 2) == 0)
                num -= 1;
            masiv[i] = Math.abs(num);
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(String.format("%02d ", masiv[i]));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }


        Arrays.sort(masiv);


        int sum = 0;
        for (int number : masiv) {
            sum += number;
        }
        int average =  sum / 100;

        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < 100; i++) {
            System.out.print(String.format("%02d ", masiv[i]));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nСреднее арифметическое: " + average);
    }
    
}
