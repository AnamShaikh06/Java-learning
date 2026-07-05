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
        for (int i=1;i<=4;i++){
            System.out.print(" ".repeat(4-i));
            System.out.print("*".repeat(i));
            if(i!=1){
                System.out.print("*".repeat(i-1));
            }
            System.out.println();
        }
        int st=3;
        for(int i=4;i>=1;i--){
            if (i!=4){
                System.out.print(" ".repeat(4-i));
            }
            System.out.print("*".repeat(i));
            System.out.print("*".repeat((st)));
            st-=1;
            System.out.println();
        }
        System.out.println("\n\n");
        
        int ho=8;
        //Hollow butterfly
        for(int i=1;i<=5;i++){
            System.out.print("*");
            if (i!=1 && i!=2){
                System.out.print(" ".repeat(i-3+1));
            }
            if (i!=1){
            System.out.print("*");}
            System.out.print(" ".repeat(ho));
            ho-=2;
            System.out.print("*");
            if (i!=1 && i!=2){
                System.out.print(" ".repeat(i-3+1));
            }
            if (i!=1){
                System.out.print("*");}
            System.out.println();
        }

        ho+=2;
        for(int i=5;i>=1;i--){
            System.out.print("*");
            if (i!=1 && i!=2){
                System.out.print(" ".repeat(i-3+1));
            }
            if (i!=1){
            System.out.print("*");}
            System.out.print(" ".repeat(ho));
            ho+=2;
            System.out.print("*");
            if (i!=1 && i!=2){
                System.out.print(" ".repeat(i-3+1));
            }
            if (i!=1){
                System.out.print("*");}
            System.out.println();
        }
        System.out.println("\n\n");

        //Hollow rhombus
        for(int i=1;i<=5;i++){
            System.out.print(" ".repeat(5-i));
            System.out.print("*");
            if (i==1 || i==5){
                System.out.print("*".repeat(3));}
            else{
                System.out.print(" ".repeat(3));
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println("\n\n");

        //Pascals triangle
        int num=11;
        for(int i=1;i<=6;i++){
            System.out.print(" ".repeat(6-i));
            if (i==1){
                System.out.print(1);
            }
            else{
                System.out.print(num);
                num*=11;
            }
           System.out.println();
            
        }
        System.out.println("\n\n");
        
        //Half number Pyramid
        for(int i=1;i<=5;i++){
           System.out.print(" ".repeat(5-i));
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //Inverted Half number
        int bg=5;
        for(int i=1;i<=5;i++){
            System.out.print(Integer.toString(i).repeat(bg));
            bg-=1;
            System.out.println();
        }
    }
}
