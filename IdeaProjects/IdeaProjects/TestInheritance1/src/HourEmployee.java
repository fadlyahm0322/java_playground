public class HourEmployee extends Employee{
    private double hourlyPayRate;

    public HourEmployee(String name, String birthDay, String hireDate, double hourlyPayRate){
        super(name, birthDay, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }

    public double getDoublePayRate(){
        return 2 * collectPay();
    }
}
