//Write a Program to Print Numbers from 1 to 100 , if the Number is divisible by 3 , Print Fizz ,
// if it is divisible by 5 Print Buzz.
// What is The Number is divisible by Both 3 and 5?
public class FizzBuzz {

    public static void main(String args[])
    {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
