public class AreaCalculator {
    public static double area(double radius){
        double v = (radius < 0) ? -1 : (radius * radius * Math.PI);
        return v;
    }

    public static double area(double x, double y){
        double v = ((x < 0) || (y < 0)) ? -1 : (x * y);
        return v;
    }
}
