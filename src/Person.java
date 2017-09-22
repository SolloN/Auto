/**
 * Created by macbook on 9/16/17.
 */
public class Person {

    private String name;
    private final String skin; // final принимает значения один раз
    private static int count = 0; // static одна на все объекты
    private int age;
    private int bankID;

    public Person(String name, int age, int bankID, String skin) {
        this.name = name;
        // this.name = ""; ПЛОХО
        this.age = age;
        this.bankID = bankID;
        this.skin = skin;
        count++;
    }

    public int getBankID(String whoIsAsking) {
        if (whoIsAsking.equals("Police")) {
            return bankID;
        } if (whoIsAsking.equals("Badguy")) {
            System.out.print("Access denied. You are toooo BadGuy!");
            return -1;
        } else {
            System.out.print("Access denied.");
            return -1;
        }
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkin() {
        return skin;
    }

    public static void main(String[] args) {
        Person person = new Person("Artem", 23, 777, "black");
        System.out.println(person.getBankID("Badguy"));
    }
}
