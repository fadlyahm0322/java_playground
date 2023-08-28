public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        int leftNum1 = number1/10;
        int rightNum1 = number1%10;
        int leftNum2 = number2/10;
        int rightNum2 = number2%10;
        boolean sharedDigitResult = false;
        if((number1 >=10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)){
            sharedDigitResult = (leftNum1 == leftNum2) || (leftNum1 == rightNum2) || (rightNum1 == leftNum2) || (rightNum1 == rightNum2);
        }
        return sharedDigitResult;
    }

    public static void main(String[] args) {
        /*System.out.println("has shared digit: " + hasSharedDigit(12, 23));
        System.out.println("has shared digit: " + hasSharedDigit(9, 99));
        System.out.println("has shared digit: " + hasSharedDigit(15, 55));
        System.out.println("has shared digit: " + hasSharedDigit(100, 10));
        System.out.println("has shared digit: " + hasSharedDigit(19, 99));
        System.out.println("has shared digit: " + hasSharedDigit(125, 43));*/
        System.out.println("has shared digit: " + hasSharedDigit(1, 43));
    }
}
