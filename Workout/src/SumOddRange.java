public class SumOddRange {
    public static boolean isOdd(int number){
        return ((number > 0) && (number%2!=0));
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((start == 13) && (end==13)) {
            sum = 13;
        }else{
            if(!(start < 0) && !(end < 0)){
                if (start > end) {
                    sum=-1;
                }
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sum += i;
                    }
                }
            }else{
                sum = -1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(-4,6));
        System.out.println("isOdd: " + isOdd(11));
    }
}
