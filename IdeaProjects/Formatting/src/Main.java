public class Main {
    public static void main(String[] args) {
       /* String bulletIt = "Print a bullet list: \n" +
                "\t\u2022 first point\n" +
                "\t\u2022 sub point";
        System.out.println(bulletIt);

        String textBlock = """
                print a bullet list:
                \u2022 first point
                    \u2022 sub point
                """;

        System.out.println(textBlock);*/

        int age = 35;
        System.out.printf("your age is %d%n", 35);

        int yearOfBirth = 2023 - age;
        System.out.printf("age %d and birth year %d%n", age, yearOfBirth);

        System.out.printf("your age is %.2f%n", (float) 35);

        for(int i=1; i<=100000; i*=10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("your age is %d", age);
        System.out.println(formattedString);

        formattedString = "your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}