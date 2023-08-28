public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        //declare variable
        int evenDigitSum = 0;
        int lastDigit = 0;

        if(number < 0) {
            evenDigitSum = -1;
        }else {
            //loop to repeat the process
            while (number != 0) {
                //find last digit;
                lastDigit = number % 10;
                //check last digit even
                if(lastDigit%2 == 0){
                    //add to sum
                    evenDigitSum +=lastDigit;
                }
                System.out.println("number: " + number);
                number = number / 10;
                //remove last digit of number
            }
            //end loop
        }
        return evenDigitSum;
    }

    public static void main(String[] args) {
        //System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        //System.out.println(getEvenDigitSum(-22));
    }
}
