package classesPart1.src;

public class Main {
    public static void main(String[] args) {

        /*Car car = new Car();
        car.setMake("Maserati");
        car.setModel("carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(true);
        targa.setColor("black");

        targa.describeCar();*/

        /*Account bobAccount = new Account("12345",1000.00, "Bob Black", "myemail@Bob.com",
                "(021) - 858533");*/

        /*Account bobAccount = new Account();

        System.out.println(bobAccount.getNumber());
        System.out.println(bobAccount.getBalance());
*/
        /*bobAccount.setNumber("12345");
        bobAccount.setBalance(1000.00);
        bobAccount.setCustomerName("Bob Black");
        bobAccount.setCustomerEmail("myemail@bob.com");
        bobAccount.setCustomerPhone("(021) - 858533");*/

        /*bobAccount.withdrawFunds(100.00);
        bobAccount.depositFunds(250);
        bobAccount.withdrawFunds(50);
        bobAccount.withdrawFunds(200);

        bobAccount.depositFunds(100);
        bobAccount.withdrawFunds(45.55);
        bobAccount.withdrawFunds(54.46);

        bobAccount.withdrawFunds(54.45);*/

        /*Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());*/

        /*Account timsAccount = new Account("Tim", "tim@email.com", "123456");
        System.out.println("Account no: " + timsAccount.getNumber() +
                "; name " + timsAccount.getCustomerName());*/

        Customer customer = new Customer("Tim", 1000, "tims@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());

        Customer thirdCustomer = new Customer("Joe", "Joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());
    }
}