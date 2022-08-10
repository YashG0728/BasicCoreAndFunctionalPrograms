import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping numbers: "+a +"  "+ b);
        //swapping
        t = a;
        a = b;
        b = t;
        System.out.println("After swapping: "+a +"   " + b);
        System.out.println( );
    }
}


