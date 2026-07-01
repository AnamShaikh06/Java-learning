public class Cpattern {
    public static void main(String[] args) {
        //Solid Rectangle
        for (int i=0;i<=3;i++){
            System.out.println("*".repeat(5));
        }

        System.out.println("\n\n");
        //Hollow Rectangle
        for (int i=0;i<4;i++){
            if(i==0 ||i==3){
                System.out.println("*".repeat(5));
            }
            else{
                System.out.println("*"+" ".repeat(3)+"*");
            }
            
        }
        System.out.println("\n\n");

        //Half pyramid
        for (int i=0;i<=3;i++){
            System.out.println("*".repeat(i+1));
        }
        System.out.println("\n\n");

        //Inverted Half Pyramid
        for (int i=4;i>=1;i--){
            System.out.println("*".repeat(i));
        }

        System.out.println("\n\n");
        //Inverted Half Pyramid (rotated by 180 degree)

        for (int i=1;i<=4;i++){
            System.out.print(" ".repeat(4-i));
            System.out.println("*".repeat(i));
        }

        System.out.println("\n\n");

        //Half Pyramid with numbers
        
        for (int i=1;i<=5;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

        System.out.println("\n\n");

        //Inverted Half pyramid with numbers
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(6-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n\n");
        
        //Floyds triangle
        int a=1;
        for(int i=0;i<=4;i++){
            for (int j=0;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

        System.out.println("\n\n");

        //0-1 triangle

        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("\n\n");

        //Solid rhombus
        for(int i=1;i<=5;i++){
            for (int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");


        //Number Pyramid
        for(int i=1;i<=5;i++){
            for (int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        //Palindromic number pyramid

        for(int i=1;i<=5;i++){
            for (int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            if (i!=1){
                for (int j=2;j<=i;j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");


        int b=6;
        //Butterfly pattern
        for(int i=1;i<=4;i++){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(b));
            b-=2;
            System.out.print("*".repeat(i));
            System.out.println();
        }
        b+=2;
        for(int i=4;i>=1;i--){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(b));
            b+=2;
            System.out.print("*".repeat(i));
            System.out.println();
        }
        
        System.out.println("\n\n");
        
        
        //Diamond pattern
    }
}
