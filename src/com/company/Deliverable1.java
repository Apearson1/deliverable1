package com.company;

import java.util.Scanner;
 public class Deliverable1

{

    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);
            reverseNumber (number/10);
        }
    }
    public static void main(String args[])
    {
        int num=0;
        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.print("Reverse of the input number is:");
        reverseNumber(num);
        System.out.println();
    }
}

//User is prompt to input numbers//
// If the numbers exceeds a  count of 10 an error message should show//
//If the numbers dosent go over the count of 10 the users input will reverse//
// Reverse number should print on the next line under users input//