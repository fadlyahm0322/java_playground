public class TestCondition {
    public static void main(String[] args) {
        System.out.println("score1 = " + finalTest(100));
        System.out.println("score2 = " + finalTest(80));
        System.out.println("score2 = " + finalTest(70));

        //operator challange
        double firstValue = 20.00;
        double secondValue = 80.00;
        double calculationValue = (firstValue + secondValue) * 100.00;
        System.out.println("calculate value" + calculationValue);
    }

    private static String finalTest(int score) {
        String finalValue = "";
        if(score >85){
            finalValue="A";
        }else if(score >=75 && score <=85){
            finalValue="B";
        }else if(score >=65 && score <=74){
            finalValue="C";
        }else if(score >= 55 && score <=64){
            finalValue="D";
        }

        return finalValue;
    }

}
