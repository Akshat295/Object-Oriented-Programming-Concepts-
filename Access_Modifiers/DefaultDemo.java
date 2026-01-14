class Student {
    String name = "Akshat";   // default variable

    void display() {          // default method
        System.out.println("Name: " + name);
    }
}

class DefaultDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);  // Allowed
        s.display();                 // Allowed
    }
}
