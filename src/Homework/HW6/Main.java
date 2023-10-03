package Homework.HW6;

public class Main {

    private static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    private static int getNumberOFfibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }
    public static void main(String[] args) {
        int number = 25;
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits of the number " + number + " is equal to " + sum);


        int n = 11;
        int result = getNumberOFfibonacciSeries(n);
        System.out.println("n-th number of the Ffibonacci series: " + result);
    }



}
