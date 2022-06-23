import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        isPalindrome();
    }

    private static boolean isPalindrome() {
        Scanner input = new Scanner(System.in);
        String palin = input.nextLine();
        String reverse = "";

        for(int i = 0; i < palin.length(); i++ ){
            char ch = palin.charAt(i);
            reverse = ch + reverse;
//            reverse = reverse + ch;
        }

        System.out.println(reverse);

        if(palin.equals(reverse)){

            System.out.println(palin + " is a Palindrome!!!");

        }
        return true;
    }

}
