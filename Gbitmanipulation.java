import java.util.*;
public class Gbitmanipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        //To identify the bit is 0 or 1 at that position
        //position starts from right to left as it is a binary representation
        System.out.print("Enter the position where you want to identify bit: ");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        if ((bitMask & n)== 1){
            System.out.println("The bit is 1");
        }
        else{
            System.out.println("The bit is 0");
        }
    }
}
