package Recursion;

public class Factorial {

    public static void main(String[] args) {

        int number = new java.util.Random().nextInt(20) + 1;
        var n = factorial(number);
        System.out.println("Factorial of " + number + " is: " + n);
    }

    public static int factorial(int n){
        System.out.println(n);
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
