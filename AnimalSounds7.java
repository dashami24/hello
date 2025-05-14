// Superclass: Animal
class Animal {
    // Method to make a generic sound
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass: Dog (inherits from Animal)
class Dog extends Animal {
    // Override makeSound method to print dog-specific sound
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass: Cat (inherits from Animal)
class Cat extends Animal {
    // Override makeSound method to print cat-specific sound
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to demonstrate method overriding
public class AnimalSounds7 {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal dog = new Dog();  // Reference of type Animal, object of Dog
        Animal cat = new Cat();  // Reference of type Animal, object of Cat

        // Demonstrating method overriding with Animal reference type
        System.out.println("Dog sound:");
        dog.makeSound();  // Calls the Dog's overridden makeSound method

        System.out.println("Cat sound:");
        cat.makeSound();  // Calls the Cat's overridden makeSound method
    }
}
