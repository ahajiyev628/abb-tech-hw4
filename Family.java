import java.util.Scanner;

public class Family {
    public static void main(String[] args){
        Pet p = new Pet("dog", "Rock", 5, new String[]{"eat", "drink", "sleep"});

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter trick level between 1-100 for the pet: ");

        System.out.println(p.toString());
        p.eat();
        p.foul();
        p.respond();

        Human mother = new Human("Jane", "Karleone", 1950, new Human("Allahverdi", "Hajiyev"), new Human("Allahverdi", "Hajiyev"));
        System.out.print("Enter IQ between 1-100 for the mother: ");
        mother.setIq(sc.nextInt());
        System.out.print("Enter trick level between 1-100 for the pet: ");
        System.out.println(mother.toString());

        Human father = new Human("Vito", "Karleone", 1945, new Human("Allahverdi", "Hajiyev"), new Human("Allahverdi", "Hajiyev"));
        System.out.print("Enter IQ between 1-100 for the father: ");
        father.setIq(sc.nextInt());
        System.out.print("Enter trick level between 1-100 for the pet: ");
        System.out.println(father.toString());

        Human child = new Human("Micheal", "Karleone", 1977, new Human(mother.name, mother.surname), new Human(father.name, father.surname));
        System.out.print("Enter IQ between 1-100 for the child: ");
        child.setIq(sc.nextInt());
        System.out.print("Enter trick level between 1-100 for the pet: ");
        System.out.println(child.toString());

        child.greetPet();
        child.describePet();
    }
}
