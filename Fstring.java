import java.util.*;
public class Fstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st="123";
        int num=Integer.parseInt(st);//converts it in integer
        System.out.println(num+st);//in java str when combines using + it behaves as string concat

        //in normal string if we perform some operation then it creates it again and again newly.
        //string builder : changes performs on same string

        StringBuilder s=new StringBuilder("ana");
        System.out.println(s);

        //char at index
        System.out.println(s.charAt(2));

        //set char at index 
        s.setCharAt(0, 'm');
        System.out.println(s);
        
        //insert at string
        s.insert(0, 'a');
        System.out.println(s);

        //delete the char
        // in delete(st,end) where end is not inclusive
        s.delete(1,2);
        System.out.println(s);

        //in str=str+"a" a new str is formed
        // wheras in append a same string builder is used

        s.append('m');
        System.out.println(s);
        

        //program for reverse of string
        System.out.println("Enter the string you want to reverse: ");
        StringBuilder str=new StringBuilder(sc.next());
        int front;
        int back;

        for(int i=0;i<=str.length()/2-1;i++){
            front=i;
            back=str.length()-i-1;
            char frontchar=str.charAt(front);
            char backchar=str.charAt(back);
            str.setCharAt(front,backchar);
            str.setCharAt(back,frontchar);

        }
        System.out.println(str);
         }
}