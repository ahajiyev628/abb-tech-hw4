public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule = new String[7][2];

    public void setIq(int iq) {
        if (iq > 100 || iq < 0) {
            //System.out.println("Trick level should be between 0 and 100");
            this.iq = Integer.parseInt("");
            return;
        }
        this.iq=iq;
    }

    public int getIq() {
        return iq;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human() {
    }

    public static String tLevel(int a) {
        if (a > 50) {
            return "very sly";
        } else {
            return "almost not sly";
        }
    }

    Pet p = new Pet("dog", "Rock", 5,  new String[]{"eat", "drink", "sleep"});

    public void describePet() {
        p.setTrickLevel(75);
        System.out.println("I have a " + p.species + ", he is " + p.age + " years old, he is " + Human.tLevel(p.getTrickLevel()));
    }

    public void greetPet() {
        System.out.println("Hello, " + p.nickname);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + this.name +
                ", surname='" + this.surname +
                ", year=" + this.year +
                ", iq=" + this.getIq() +
                ", mother=" + this.mother.name + " " + this.mother.surname +
                ", father=" + this.father.name + " " + this.father.surname +
                ", pet=" + p.toString() +
                '}';
    }
}
