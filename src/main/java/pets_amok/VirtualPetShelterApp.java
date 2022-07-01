package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter myShelter = new VirtualPetShelter();
        VirtualPetShelter PetsToAdopt = new VirtualPetShelter();

        VirtualPet organicCat1 = new OrganicCat("Dusty ", "organicCat", 10, 15, 20, 25, 30, 35);
        VirtualPet organicCat2 = new OrganicCat("Bruiser ", "organicCat", 15, 20, 25, 30, 35, 40);
        VirtualPet organicCat3 = new OrganicCat("Sky ", "organicCat", 20, 25, 30, 35, 40, 45);
        VirtualPet organicDog1 = new OrganicDog("Mia ", "organicDog", 25, 30, 35, 40, 45, 50);
        VirtualPet organicDog2 = new OrganicDog("Patsy ", "organicDog", 30, 35, 40, 45, 50, 55);
        VirtualPet organicDog3 = new OrganicDog("Casper ", "organicDog", 40, 45, 50, 55, 65, 70);
        VirtualPet roboticCat1 = new RoboticCat("Blue ", "roboticCat", 45, 50, 55, 60);
        VirtualPet roboticCat2 = new RoboticCat("Grey ", "roboticCat", 50, 55, 60, 65);
        VirtualPet roboticCat3 = new RoboticCat("Midnight ", "roboticCat", 55, 65, 70, 75);
        VirtualPet roboticDog1 = new RoboticDog("Pudge ", "roboticDog", 60, 65, 70, 75);
        VirtualPet roboticDog2 = new RoboticDog("Red ", "roboticDog", 65, 70, 75, 80);
        VirtualPet roboticDog3 = new RoboticDog("Guru ", "roboticDog", 70, 75, 80, 85);

        myShelter.addPet(organicCat1);
        myShelter.addPet(organicCat2);
        myShelter.addPet(organicDog1);
        myShelter.addPet(organicDog2);
        myShelter.addPet(roboticCat1);
        myShelter.addPet(roboticCat2);
        myShelter.addPet(roboticDog1);
        myShelter.addPet(roboticDog2);

        PetsToAdopt.addPet(organicCat3);
        PetsToAdopt.addPet(organicDog3);
        PetsToAdopt.addPet(roboticCat3);
        PetsToAdopt.addPet(roboticDog3);


        int userChoice;
        int loop =0;
        int loop2 = 0;

        while(loop==0){
            System.out.println("Welcome to your Pet Shelter!");
            myShelter.getStatusAll();
            System.out.println("");

            System.out.println("Press 1 to feed/charge all pets");
            System.out.println("Press 2 to water/oil all pets");
            System.out.println("Press 3 to to play with pets");
            System.out.println("Press 4 to to walk with pets");
            System.out.println("Press 5 to add a pet");
            System.out.println("Press 6 to let your sister adopt a pet");
            System.out.println("Press 7 to let the pets outside to go potty");
            System.out.println("Press 9 to exit");
            System.out.println("");


            userChoice = input.nextInt();
            input.nextLine();

            if (userChoice == 1) {
                myShelter.feedChargeAll();
                System.out.println("You fed all your pets");

            } else if (userChoice == 2) {
                myShelter.waterAll();
                System.out.println("You gave water to all your pets");


            } else if (userChoice == 3) {
                myShelter.playAll();
                System.out.println("You played with all your pets");

            } else if (userChoice == 4) {
                myShelter.walkAll();
                System.out.println("You have walked your dogs");

            } else if (userChoice == 5) {

                System.out.println("You went to the pound and found some animals to adopt");
                PetsToAdopt.getStatusAll();
                System.out.println("Which pet would you like to adopt");

                while(loop2 ==0) {
                    System.out.println("Press 1 to adopt Sky");
                    System.out.println("Press 2 to adopt Casper");
                    System.out.println("Press 3 to adopt Midnight");
                    System.out.println("Press 4 to adopt Guru");
                    System.out.println("Press 5 to go back");

                    if (userChoice == 1) {

                        System.out.println("Thank you for adopting Sky");
                        myShelter.addPet(organicCat3);
                        PetsToAdopt.removePet("Sky");
                        loop2 ++;

                    } else if (userChoice == 2) {

                        System.out.println("Thank you for adopting Casper");
                        myShelter.addPet(organicDog3);
                        PetsToAdopt.removePet("Casper");
                        loop2 ++;

                    } else if (userChoice == 3) {

                        System.out.println("Thank you for adopting Midnight");
                        myShelter.addPet(roboticCat3);
                        PetsToAdopt.removePet("Midnight");
                        loop2 ++;

                    } else if (userChoice == 4) {

                        System.out.println("Thank you for adopting Guru");
                        myShelter.addPet(roboticDog3);
                        PetsToAdopt.removePet("Guru");
                        loop2 ++;
                    }
                    else{
                        System.out.println("Try again");
                }

                }

                }
                else if (userChoice == 6) {
                    System.out.println("Which pet would you like to remove");
                    System.out.println("Your current pets are ");
                    myShelter.getStatusAll();
                    System.out.println("Type the name of the pet you want to let go");
                    Scanner sc = new Scanner(System.in);
                    String petName = input.nextLine();
                    myShelter.removePet(petName);
                    System.out.println("You let your sister adopts " + petName);
                } else if (userChoice == 7) {
                    myShelter.wasteAll();
                    System.out.println("You let the pets outside to go potty");
                }
                else if(userChoice==9){
                    loop++;
            }
                else{
                System.out.println("Try again");
            }
            myShelter.TickAll();



        }
    }
}

