package Homework.HW2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 6;
        }

        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");

        }

    }
}

