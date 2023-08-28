public class Main {
    public static void main(String[] args) {
        Employee fad = new Employee("fadly", "22/03/2001", "22/03/2023");
        System.out.println("Employee 1: " + fad);
        System.out.println("age: " + fad.getAge());

/*        Employee joe = new Employee("joe", "22/03/2000", "22/03/2023");
        System.out.println("Employee 2: " + joe);
        System.out.println("age: " + joe.getAge());*/

        SalariedEmployee joeSalary = new SalariedEmployee("joe", "22/03/2000", "22/03/2023",35000);
        System.out.println("Employee 2: " + joeSalary);
        System.out.println("age: " + joeSalary.collectPay());
        System.out.println("joe paycheck $" + joeSalary.collectPay());

        joeSalary.isRetire();
        System.out.println("joe paycheck $" + joeSalary.collectPay());

        HourEmployee mary = new HourEmployee("mary", "27/08/1990", "20/09/2020", 15);
        System.out.println(mary);
        System.out.println("mary paycheck $" + mary.collectPay());
        System.out.println("mary holiday pay $" + mary.getDoublePayRate());
    }
}