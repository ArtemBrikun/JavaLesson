package Homework.HW1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("To exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a * b; // a = 15, b = 3
        b = a / b; // b = 5, a = 15
        a = a / b; // a = 3, b = 5

        System.out.println("After the exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



        }
    }
