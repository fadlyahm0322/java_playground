public class IntEqualityPrinter {
    public static void printEquals(int parameters1, int parameters2, int parameters3){
        if(parameters1 < 0 || parameters2 < 0 || parameters3 < 0) {
            System.out.println("Invalid Value");
        } else{
            if(((parameters1 == parameters2) || (parameters1 == parameters3)) &&  ((parameters2 == parameters1) || (parameters2 == parameters3)) && ((parameters3 == parameters1) || (parameters3 == parameters2))) {
                System.out.println("All numbers are equal");
            } else if(parameters1 != parameters2 && parameters1 != parameters3 && parameters2 != parameters1 && parameters2 != parameters3 && parameters3 !=parameters1 && parameters3 != parameters2){
                System.out.println("All numbers are different");
            }else{
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
