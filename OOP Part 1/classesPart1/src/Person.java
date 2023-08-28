package classesPart1.src;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        if((age < 0) || (age > 100)) age=0;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen(){
        return ((getAge() > 12) && (getAge() < 20));
    }

    public String getFullName(){
        if(getFirstName().equals("") && getLastName().equals("")){
            return "";
        }else if(getFirstName().equals("") && !getLastName().equals("")){
            return getLastName();
        }else if(getLastName().equals("") && !getFirstName().equals("")){
            return getFirstName();
        }else{
            return getFirstName() + " " + getLastName();
        }
    }

}
