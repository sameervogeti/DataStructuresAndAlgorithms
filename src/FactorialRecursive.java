/*
Program to calculate Factorial Recursively
* */

public class FactorialRecursive {

    public static void main(String[] args) {
        FactorialRecursive factorialRecursive = new FactorialRecursive();
        System.out.println(factorialRecursive.factorial(5));
    }

    int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
