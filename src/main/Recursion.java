package main;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number :");
        int x = in.nextInt();

        System.out.println("Enter second number :");
        int y = in.nextInt();

        System.out.println("Enter number for factorial :");
        long n = in.nextLong();

        System.out.println("Multiply of two number :");
        System.out.println(multiply(x,y));

        System.out.println("Factorial of the given number :");
        System.out.println(factorial(n));

        System.out.println("Fibonacci of nth term :");
        System.out.println(fibonacci(x));
    }

    public static int multiply(int a,int b){
        if(b == 0) {
            return 0;
        }
        else {
            return a + multiply(a,b-1);
        }
    }

    public static long factorial(long n){
        if(n == 0){
            return 1;
        }else {
            return (n * factorial(n-1));
        }
    }

    public static int fibonacci(int n){
        if(n <= 1)
            return n;
        return (fibonacci(n-1) + fibonacci(n-2));
    }
}
