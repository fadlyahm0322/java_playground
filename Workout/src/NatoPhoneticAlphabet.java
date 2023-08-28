public class NatoPhoneticAlphabet {

    public static void main(String[] args) {

        System.out.println(getPhoneticAlphabet('B'));

    }
    public static String getPhoneticAlphabet(char symbol){
        String message ="";
        switch (Character.toLowerCase(symbol)){
            case 'a' -> {
                message = symbol + " is Able";
            }
            case 'b' -> {
                message = symbol + " is Baker";
            }
            case 'c' -> {
                message = symbol + " is Charlie";
            }
            case 'd' -> {
                message = symbol + " is Dog";
            }
            case 'e' -> {
                message = symbol + " is Easy";
            }
            case 'f' -> {
                message = symbol + " is Fox";
            }
            case 'g' -> {
                message = symbol + " is George";
            }
            case 'h' -> {
                message = symbol + " is How";
            }
            case 'i' -> {
                message = symbol + " is Item";
            }
            case 'j' -> {
                message = symbol + " is Jig";
            }
            case 'k' -> {
                message = symbol + " is King";
            }
            case 'l' -> {
                message = symbol + " is Love";
            }
            case 'm' -> {
                message = symbol + " is Mike";
            }
            case 'n' -> {
                message = symbol + " is Nan";
            }
            case 'o' -> {
                message = symbol + " is Oboe";
            }
            case 'p' -> {
                message = symbol + " is Peter";
            }
            case 'q' -> {
                message = symbol + " is Queen";
            }
            case 'r' -> {
                message = symbol + " is Roger";
            }
            case 's' -> {
                message = symbol + " is Sugar";
            }
            case 't' -> {
                message = symbol + " is Tare";
            }
            case 'u' -> {
                message = symbol + " is Uncle";
            }
            case 'v' -> {
                message = symbol + " is Victor";
            }
            case 'w' -> {
                message = symbol + " is William";
            }
            case 'x' -> {
                message = symbol + " is X-Ray";
            }
            case 'y' -> {
                message = symbol + " is Yoke";
            }
            case 'z' -> {
                message = symbol + " is Zebra";
            }
            default -> {
                message = "Invalid symbol";
            }
        }
        return message;
    }
}
