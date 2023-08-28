public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean result;
        if(summer){
            result = temperature >= 25 && temperature <= 45;
        }else{
            result = temperature >= 25 && temperature <= 35;
        }
        return result;
    }
}
