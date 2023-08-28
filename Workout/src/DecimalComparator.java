public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double oneParam, double twoParam){
        boolean b;
        String param1 = String.valueOf(oneParam);
        String param2 = String.valueOf(twoParam);
        int indexOfDecimals = param1.indexOf(".");
        int targetDecimal1 = Integer.valueOf(param1.substring(indexOfDecimals).substring(1,4));
        int targetDecimal2 = Integer.valueOf(param2.substring(indexOfDecimals).substring(1,4));

        b = targetDecimal1 == targetDecimal2;

        return b;
    }
}
