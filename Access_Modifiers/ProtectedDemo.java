class Animal {
    protected String sound = "Animal sound";

    protected void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void display() {
        System.out.println(sound);   // Accessing protected variable
        makeSound();                 // Accessing protected method
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
