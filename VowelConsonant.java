import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter any Alphabet");
        Scanner scan = new Scanner(System.in);
        char CheckAlphabet = ((scan.nextLine()).charAt(0));
        char ch=Character.toLowerCase(CheckAlphabet);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println(ch + " is vowel");
        }
        else {
            System.out.println(ch + " is consonant");
        }
    }
}
