public class WhileLoopChallenge {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int oddCount = 0;
        int evenCount = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("Even number: " + number);
            evenCount++;
            if(evenCount >=5){
                break;
            }
        }

        System.out.println("Total odd number: " + oddCount);
        System.out.println("Total even number: " + evenCount);
    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
}
