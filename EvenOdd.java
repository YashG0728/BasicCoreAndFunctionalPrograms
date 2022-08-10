import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner scan = new Scanner(System.in);
        int Check = scan.nextInt();

        if(Check % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
