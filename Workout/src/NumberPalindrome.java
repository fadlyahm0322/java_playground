import java.sql.SQLOutput;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit;
        int temp;
        temp = number;
        while (number != 0){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        if(temp == reverse)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("isPalindrome: " + isPalindrome(-1221));
        System.out.println("isPalindrome: " + isPalindrome(707));
        System.out.println("isPalindrome: " + isPalindrome(11212));
    }
}
