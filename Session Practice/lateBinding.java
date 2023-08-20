class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The lion roars loudly!");
    }
}

class Elephant extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The elephant trumpets with its trunk!");
    }
}

class Giraffe extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The giraffe makes a unique sound!");
    }
}

public class lateBinding {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal giraffe = new Giraffe();

        lion.makeSound(); // Outputs: The lion roars loudly!
        elephant.makeSound(); // Outputs: The elephant trumpets with its trunk!
        giraffe.makeSound(); // Outputs: The giraffe makes a unique sound!

        Animal animal = getRandomAnimal();
        animal.makeSound(); // Outputs: Late binding - Specific animal sound!
    }

    public static Animal getRandomAnimal() {
        // Generate a random number to simulate the selection of an animal
        int random = (int) (Math.random() * 3);

        switch (random) {
            case 0:
                return new Lion();
            case 1:
                return new Elephant();
            case 2:
                return new Giraffe();
            default:
                return null;
        }
    }
}