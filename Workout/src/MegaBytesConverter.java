import java.sql.SQLOutput;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        double calculateMegaByte = (double) kiloBytes / 1024;
        int intPart = (int) calculateMegaByte;
        int megaByte = (int) Math.floor(calculateMegaByte);
        int kiloByte = (int) ((calculateMegaByte - intPart) * 1024);

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + kiloByte + " KB");
        }
    }
}
