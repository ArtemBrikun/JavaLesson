package Homework.HW1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        System.out.println("To exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; // a = 3
        b = a - b; // b = 1
        a = a - b; // a = 2

        System.out.println("After the exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



        }
    }
