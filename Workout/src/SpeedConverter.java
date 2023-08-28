public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        double miles;
        //1 miles = 1.609344;
        if(kilometersPerHour < 0){
            miles = -1;
        }else if(kilometersPerHour == 0) {
            miles = 0.0;
        }else{
            miles = kilometersPerHour / 1.60934;

            String milesAsString = String.valueOf(miles);
            int indexOfDecimals = milesAsString.indexOf(".");
            int targetDecimal1 = Integer.valueOf(milesAsString.substring(indexOfDecimals).substring(1,2));
            int targetDecimal2 = Integer.valueOf(milesAsString.substring(indexOfDecimals).substring(2,3));
            if(targetDecimal1 >= 5 || targetDecimal2 >=9){
                miles = Math.ceil(miles);
            }else{
                miles = Math.floor(miles);
            }
        }


        return (long) miles;
    }

    public static void printConversion(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }


}
