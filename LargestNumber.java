import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        ////Taking Input From User Using Scanner Class
        System.out.println("----------Find LargestNum----------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number");
        int FirstNum = scanner.nextInt();
        System.out.println("Enter Second Number");
        int SecondNum = scanner.nextInt();
        System.out.println("Enter Third Number");
        int ThirdNum = scanner.nextInt();
        //Using Nested If-Else here
        /*First Condition
        If Its True=Then It Goes To Nested If-Else Condition and Check it
        If Its False=Then it Check Main Else Block Condition*/
        //if it false its check else if else is also false then it checks the third one
        if(FirstNum > SecondNum) {
            if (FirstNum > ThirdNum) {
                System.out.println("LargestNum is : " + FirstNum);
            } else {
                System.out.println("LargestNum is : " + ThirdNum);
            }
        }

        else {
            if (SecondNum > ThirdNum) {
                System.out.println("LargestNum is :" + SecondNum);
            } else {
                System.out.println("LargestNum is :" + FirstNum);
            }
        }
    }
}