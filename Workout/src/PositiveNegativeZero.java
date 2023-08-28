public class PositiveNegativeZero {
    public static void checkNumber(int number){
        String value="";
        if(number > 0){
            value="positive";
        }else if (number < 0) {
            value="negative";
        }else{
            value="zero";
        }
        System.out.println(value);
    }
}
