/*
 * Program to Calculate Power of a number to a variable using recursion .
 * Example :- power(2,0) ==> Should return 1
 * power(2,1) ==> Should Return 2
 * power(2,2) ==> Should return 4
 * * */
public class PowerUsingRecursion {
    int result;

    public static void main(String[] args) {
        PowerUsingRecursion powerUsingRecursion = new PowerUsingRecursion();
        System.out.println(powerUsingRecursion.power(2, 7));
    }

    int power(int number, int powerVariable) {
        if (powerVariable == 0) {
            return 1;
        }
        result = number * power(number, powerVariable - 1);
        return result;
    }
}
