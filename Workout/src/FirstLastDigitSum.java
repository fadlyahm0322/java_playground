public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int resultSum;
        if(number < 0){
            resultSum = -1;
        } else if (number < 10) {
            resultSum = number + number;
        }else {
            int firstNum = 1;
            int lastNum = number % 10;
            for (int i=10; i<number; i*=10){
                firstNum = number / i;
            }
            resultSum =  firstNum + lastNum;
        }
        return resultSum;
    }

    public static void main(String[] args) {
        System.out.println("test: " + sumFirstAndLastDigit(252));
    }
}
