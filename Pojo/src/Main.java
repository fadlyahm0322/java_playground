public class Main {
    public static void main(String[] args) {
       /* for (int i = 1; i<5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Marry";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006","Ann", "05/11/1985",
                "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1085",
                "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());*/

        Wall wall = new Wall(-1.25,-1.25);
        System.out.println("Area: " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width: " + wall.getWidth());
        System.out.println("height: " + wall.getHeight());

        System.out.println("Area: " + wall.getArea());


    }
}