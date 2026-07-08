import java.util.*;
public class Earray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i=0;i<size;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println("Max is : "+max+" Min is :"+min);
        //2D arrays
        System.out.println("Enter row and column size for 2D array: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] numbers=new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }


    
    }
}
