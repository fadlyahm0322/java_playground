import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        Date now = new Date();
        int yearNow = now.getYear() + 1900;
        int birthDt = Integer.parseInt(birthDate.substring(6, 10));
        return yearNow - birthDt;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
