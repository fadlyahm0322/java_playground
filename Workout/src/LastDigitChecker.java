public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        return (isValid(number1) && isValid(number2) && isValid(number3))
                && (((number1 % 10) == (number3 % 10)) || ((number2 % 10) == (number3 % 10)));
    }
    public static boolean isValid(int number){
        return ((number >= 10) && (number <= 1000));
    }

    public static void main(String[] args) {
        System.out.println("Has same last Digit: " + hasSameLastDigit(41,22,71));
        System.out.println("Has same last Digit: " + hasSameLastDigit(23,32,42));
        System.out.println("Has same last Digit: " + hasSameLastDigit(9,99,999));
    }
}
