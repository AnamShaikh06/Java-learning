import java.util.*;

public class Dfunction {
    public static void printName(String name){
        System.out.println(name);
    }
    public static int sumOfNumbers(int a,int b){
        return a+b;
    }

    public static int factorialNumber(int num){
        if (num==1){
            return 1;
        }
        
        return num*factorialNumber(num-1);
    }

    public static void printAvg(int a,int b,int c){
        System.out.println("Average of numbers: "+(a+b+c)/3);
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        printName(name);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum :"+sumOfNumbers(a, b));
        int n=sc.nextInt();
        System.out.println("Factorial: "+factorialNumber(n));
    }
}
