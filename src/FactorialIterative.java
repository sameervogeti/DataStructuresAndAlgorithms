/*
Program to calculate Factorial of a number iteratively
* */
public class FactorialIterative {

    int factorial(int number)
    {
        int factorial=1;
        for(int i=number;i>0;i--)
        {
          factorial= factorial*i;
        }
        return factorial;
    }
    public static void main(String args[])
    {
        FactorialIterative factorialIterative=new FactorialIterative();
        System.out.println(factorialIterative.factorial(0));
    }
}
