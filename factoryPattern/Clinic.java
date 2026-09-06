package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true) {
        System.out.println("\n[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nChoose your pet number: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet = null;

        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepherd");
                break;
                
            case 2: pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                break;

            case 3: 
                System.out.println("Program finished. Thank you for using!");
                break;
        }

        if (choice == 3) {
             break; }

        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());

         if ( pet instanceof Dog) {
            Dog dog = (Dog) pet;
            System.out.println("Dog breed: " + dog.getBreed());
        } else if ( pet instanceof Cat) {
            Cat cat = (Cat) pet;
             System.out.println("Number of lives: " + cat.getNoOfLives());
        }

    }
        input.close();
      
    }
    
}
