import java.util.Arrays;
import java.util.Scanner;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    // setter
    public void setTrickLevel(int trickLevel) {
        if (trickLevel > 100 || trickLevel < 0) {
            //System.out.println("Trick level should be between 0 and 100");
            this.trickLevel = Integer.parseInt("");
            return;
        }
        this.trickLevel=trickLevel;
    }

    // getter
    public int getTrickLevel() {
        return this.trickLevel;
    }

    // Constructor with all the fields
    public Pet(String species, String nickname, int age, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    // Constructor with two fields
    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    // an empty constructor
    public Pet() {

    }

    // methods of Pet class
    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am %s. I miss you!", this.nickname);
        System.out.println("");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    Scanner sc = new Scanner(System.in);
    @Override
    public String toString() {
        this.setTrickLevel(sc.nextInt());
        return this.species +"{" +
                "nickname='" + this.nickname +
                "', age=" + this.age +
                ", trickLevel=" + this.getTrickLevel() +
                ", habits=[" + Arrays.toString(this.habits) +
                "]}";
    }
}
