package kap;
/**
 * Write a description of class KapN here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a 4 digit number：");
        int num = scanner.nextInt();
        kaprekarProcess(num);
    }

    static void kaprekarProcess(int num) {
        int count = 0;
        while (num != 6174) {
            int[] digits = getDigits(num);
            Arrays.sort(digits); // sorts array from least to greatest 
            int asc = toNumber(digits); // this is the array we sorted from least to greatest 
            int desc = toNumber(reverseArray(digits)); // reversing the sorted list back to the original and turned into a number
            num = desc - asc;
            System.out.println("Step " + ++count + ": " + desc + " - " + asc + " = " + num);
        }
    }
    
    // isolates the integer at the end and puts it into an array, this puts the integer in reverse
    static int[] getDigits(int num) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // function turns the array back into a number
    static int toNumber(int[] digits) {
        int num = 0;
        for (int i = 0; i < 4; i++) {
            num = num * 10 + digits[i];
        }
        return num;
    }

    // reverses an array 
    static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
} 







