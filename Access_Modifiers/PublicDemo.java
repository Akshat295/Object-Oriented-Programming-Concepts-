class Employee {
    public String name;

    public void displayName() {
        System.out.println("Employee Name: " + name);
    }
}

public class PublicDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "John Doe";
        emp.displayName();
    }
}

