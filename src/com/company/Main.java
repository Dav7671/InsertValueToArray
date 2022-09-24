package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(0, 100);
            System.out.print(arr[i] + " ");
        }

        double[] newArr = new double[11];
        int index;
        double value;

        do {
            System.out.println("Enter the index where you want to insert a value ");
            index = scanner.nextInt();
        } while (index < 0 || index > newArr.length);

        System.out.println("Enter the value which you need to insert in index " + index);
        value = scanner.nextDouble();

        
        for (int i = 0; i < newArr.length; i++) {
            if (i < index - 1)
                newArr[i] = arr[i];
            else if (i == index - 1)
                newArr[i] = value;
            else
                newArr[i] = arr[i - 1];
        }

        System.out.println("After inserting a value " + value);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
