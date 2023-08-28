public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digit number 1234 is " + sumDigit(1234));
        /*System.out.println("The sum of the digit number 125 is " + sumDigit(125));
        System.out.println("The sum of the digit number 4 is " + sumDigit(4));
        System.out.println("The sum of the digit number 32123 is " + sumDigit(32123));*/
    }
    public static int sumDigit(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;
        while (number > 9){
            System.out.println("hasilbagi 10: " + number + " adalah "  + (number % 10));
            sum += (number % 10);
            System.out.println("dibagi: " + (number / 10));
            number = number / 10;
        }

        do{
            System.out.println("hasilbagi 10: " + number + " adalah "  + (number % 10));
            sum += (number % 10);
            System.out.println("dibagi: " + (number / 10));
            number = number / 10;
        }while (number > 9);

        System.out.println("number: " + number);
        sum += number;
        return sum;
    }
}
