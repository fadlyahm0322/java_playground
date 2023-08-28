public class BarkingDog {
    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay){
        boolean barking = false;
        int limitOfDay = 23;
        if(isBarking) {
            if(limitOfDay >= hourOfDay ) {
                barking = (hourOfDay >= 0) && (hourOfDay < 8 || hourOfDay > 22);
            }
        }
        return barking;
    }
}
