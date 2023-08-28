public class TraditionalSwithStatement {
    public static void main(String[] args) {

        //traditional switch value
        int swithValue = 1;
        switch (swithValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, a 4, a 5");
                System.out.println("Actually it was a " + swithValue);
                break;
            default:
                System.out.println("was not 1,2,3,4 or 5");
                break;
        }

        //enhanced switch statement
        switch (swithValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3, a 4, a 5");
                System.out.println("Actually it was a " + swithValue);
            }
            default -> System.out.println("was not 1,2,3,4 or 5");
        }

        String month = "JANUARY";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month){
        return switch (month){
            case "JANUARY" -> { yield  "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
