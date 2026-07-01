import java.util.*;
class Bif_else{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not an adult");
        }
        int number=sc.nextInt();
        for (int i=2;i<number;i++){
            if (number%i==0){
                System.out.println("Not a prime number");
                break;
            }
        }
        System.out.println("Prime ");

    }
}