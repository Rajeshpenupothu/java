// Base class
class Animal {
    public void sound() {
        System.out.println("Some sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the sound method
        myDog.sound(); // Output: Bark
        myCat.sound(); // Output: Meow

        // Array of Animal references
        Animal[] animals = { new Dog(), new Cat() };

        // Looping through the array and calling sound()
        for (Animal animal : animals) {
            animal.sound(); // Output: Bark and Meow
        }
    }
}
