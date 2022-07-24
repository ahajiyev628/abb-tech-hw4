import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Pet pet = new Pet("dog", "Rock", 5, new String[]{"eat", "drink", "sleep"});

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter trick level between 1-100 for the pet: ");
        pet.setTrickLevel(sc.nextInt());
        System.out.println(pet.toString());
        pet.eat();
        pet.foul();
        pet.respond();

        Human child = new Human("Micheal", "Karleone", 1977, new Human("Jane", "Karleone"), new Human("Vito", "Karleone"));
        System.out.print("Enter IQ between 1-100 for the child: ");
        child.setIq(sc.nextInt());
        System.out.println(child.toString());

        Human mother = new Human("Jane", "Karleone", 1950, new Human("Allahverdi", "Hajiyev"), new Human("Allahverdi", "Hajiyev"));
        System.out.print("Enter IQ between 1-100 for the mother: ");
        mother.setIq(sc.nextInt());
        System.out.println(mother.toString());

        Human father = new Human("Vito", "Karleone", 1945, new Human("Allahverdi", "Hajiyev"), new Human("Allahverdi", "Hajiyev"));
        System.out.print("Enter IQ between 1-100 for the father: ");
        father.setIq(sc.nextInt());
        System.out.println(father.toString());

        child.greetPet();
        child.describePet();
    }
}
