import java.util.Calendar;
import java.util.Date;
public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean leapYear = false;
        int maxYearLimit = 9999;

        if((year <= 0) || (year > maxYearLimit)){
            leapYear = false;
        }else{
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if (((year % 400) == 0)) {
                        System.out.println("Year: " + year);
                        leapYear = true;
                    }
                }
            }
        }
        return leapYear;
    }

    public static int getDaysInMonth(int month, int year){
        System.out.println("month: " + month + " Year: " + year);

        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        date.setMonth(month);
        date.setYear(year);
        cal.setTime(date);

        int daysInMonth = ((month < 1 || month > 12)  || (year < 1 || year > 9999)) ? -1 : cal.get(Calendar.DAY_OF_MONTH);
        return daysInMonth;
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));

        System.out.println(isLeapYear(1600));
    }
}
