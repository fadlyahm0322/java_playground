// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Object{
    public static void main(String[] args) {
        Student student = new Student("fadly", 20);
        System.out.println("Student: " + student);
        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("jimmy", 17, "lina");
        System.out.println(jimmy);
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
      /*  return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';*/
    }

}

class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}