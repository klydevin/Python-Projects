import java.io.IOException;
import java.util.Scanner;

public class AnimalClassification {

    String[] animal;

    String[] animalClass = {"Vertebrates", "Invertebrates"};
    String[] vertebratesClass = {"Warm Blooded", "Cold Blooded"};
    String[] invertebratesClass = {"Jointed legs", "Without legs"};

    String[] warmBlooded = {"Mammals", "Birds"};
    String[] coldBlooded = {"Fish", "Reptiles", "Amphibians"};
    String[] jointedLegs = {"3 pair of legs", "more than 3 pair of legs"};
    String[] withoutLegs = {"Segmented body", "Non segmented body"};

    public AnimalClassification(String[] Animal) {
        animal = Animal;
        AnimalType();
    }

    void AnimalType() {
        if (animal[0].equalsIgnoreCase(animalClass[0])) {
            System.out.println("Vertebrates Type");
            VertebratesType();
        } else if (animal[0].equalsIgnoreCase(animalClass[1])) {
            System.out.println("Invertebrates Type");
            InvertebratesType();
        } else {
            System.out.println("Animal Type Not Found");
        }
    }

    void VertebratesType() {
        if (animal[1].equalsIgnoreCase(vertebratesClass[0])) {
            System.out.println("Warm Blooded Type");
            WarmBloodedType();
        } else if (animal[1].equalsIgnoreCase(vertebratesClass[1])) {
            System.out.println("Cold Blooded Type");
            ColdBloodedType();
        } else {
            System.out.println("Animal Vertebrate Type Not Found");
        }
    }

    void InvertebratesType() {
        if (animal[1].equalsIgnoreCase(invertebratesClass[0])) {
            System.out.println("Jointed Legs Type");
            JointedLegs();
        } else if (animal[1].equalsIgnoreCase(invertebratesClass[1])) {
            System.out.println("Without Jointed Legs");
            WithoutJointedLegs();
        } else {
            System.out.println("Animal Invertebrate Type Not Found");
        }

    }

    void WarmBloodedType() {
        if (animal[2].equalsIgnoreCase(warmBlooded[0])) {
            System.out.println("Mammals");
        } else if (animal[2].equalsIgnoreCase(warmBlooded[1])) {
            System.out.println("Birds");
        } else {
            System.out.println("Animal Warm Blood Type Not Found");
        }

    }

    void ColdBloodedType() {
        if (animal[2].equalsIgnoreCase(coldBlooded[0])) {
            System.out.println("Fish");
        } else if (animal[2].equalsIgnoreCase(coldBlooded[1])) {
            System.out.println("Reptiles");
        } else if (animal[2].equalsIgnoreCase(coldBlooded[2])) {
            System.out.println("Amphibians");
        } else {
            System.out.println("Animal Cold Blooded Type Not Found");
        }

    }

    void JointedLegs() {
        if (animal[2].equalsIgnoreCase(jointedLegs[0])) {
            System.out.println("Animal have 3 pair of legs");
        } else if (animal[2].equalsIgnoreCase(jointedLegs[1])) {
            System.out.println("Animal have more than 3 pair of legs");
        } else {
            System.out.println("Animal Type Not Found");
        }
    }

    void WithoutJointedLegs() {
        if (animal[2].equalsIgnoreCase(withoutLegs[0])) {
            System.out.println("Segmented Body Animal");
        } else if (animal[2].equalsIgnoreCase(withoutLegs[1])) {
            System.out.println("Non-Segmented Body Animal");
        } else {
            System.out.println("Animal Type Not Found");
        }

    }

    public static void main(String[] args) {
        String[] Horse = {"Vertebrates", "Warm Blooded", "Mammals"};
        String[] Bear = {"Vertebrates", "Warm Blooded", "Mammals"};
        String[] Tiger = {"Vertebrates", "Warm Blooded", "Mammals"};
        String[] Whale = {"Vertebrates", "Warm Blooded", "Mammals"};

        String[] Eagle = {"Vertebrates", "Warm Blooded", "Birds"};
        String[] Peacock = {"Vertebrates", "Warm Blooded", "Birds"};
        String[] Ostrich = {"Vertebrates", "Warm Blooded", "Birds"};

        String[] Salmon = {"Vertebrates", "Cold Blooded", "Birds"};
        String[] Goldfish = {"Vertebrates", "Cold Blooded", "Birds"};
        String[] Guppy = {"Vertebrates", "Cold Blooded", "Birds"};

        String[] Turtle = {"Vertebrates", "Cold Blooded", "Reptiles"};
        String[] Crocodile = {"Vertebrates", "Cold Blooded", "Reptiles"};
        String[] Snake = {"Vertebrates", "Cold Blooded", "Reptiles"};

        String[] Frog = {"Vertebrates", "Cold Blooded", "Amphibians"};
        String[] Toad = {"Vertebrates", "Cold Blooded", "Amphibians"};
        String[] Newt = {"Vertebrates", "Cold Blooded", "Amphibians"};

        String[] Ant = {"Invertebrates", "Jointed Legs", "3 Pairs of Legs"};
        String[] Cockroach = {"Invertebrates", "Jointed Legs", "3 Pairs of Legs"};
        String[] Ladybug = {"Invertebrates", "Jointed Legs", "3 Pairs of Legs"};

        String[] Scorpio = {"Invertebrates", "Jointed Legs", "more than 3 Pairs of Legs"};
        String[] Spider = {"Invertebrates", "Jointed Legs", "more than 3 Pairs of Legs"};
        String[] Millpede = {"Invertebrates", "Jointed Legs", "more than 3 Pairs of Legs"};

        String[] Earthworm = {"Invertebrates", "Without Legs", "Segmented Body"};
        String[] Leech = {"Invertebrates", "Without Legs", "Segmented Body"};
        String[] Flukeworm = {"Invertebrates", "Without Legs", "Non Segmented Body"};
        String[] Tapeworm = {"Invertebrates", "Without Legs", "Non Segmented Body"};

        AnimalClassification animal = new AnimalClassification(Tapeworm);

    }
}
