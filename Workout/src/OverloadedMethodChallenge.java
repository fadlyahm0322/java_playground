public class OverloadedMethodChallenge {
    public static double convertToCentimeters(int inches){

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters((feet * 12) + inches);
    }

    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8));
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }
}
