
public class Thisconcept {
    public static void main(String[] args) {
        System.out.println("Count = " + Employee.getCount());

        // Create employees
        Employee emp1 = new Employee(1, "Vijay", 10035.35);
        Employee emp2 = new Employee(2, "John", 20000.0);

        // Display count after creating employees
        System.out.println("Count = " + Employee.getCount());

        // Display employee details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;
    private static int count = 0; // Static variable to keep track of total employees

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        count++; // Increment count when a new employee is created
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Static method to get the total count of employees
    public static int getCount() {
        return count;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }
}

/*
 * Write constructor (default + parameterized), setters and getters for below
 * mentioned classes and data members.
 * Define class 'Student' with following data members
 * - Roll number (generate this automatically using static data member)
 * - Name
 * - English
 * - mathematics
 * - science
 * - Total
 * - percentage
 * Define a class 'Batsman' with the following specifications - Name, innings,
 * notouts, runs, average.
 * Define a class 'Book' with the following specifications : Id, Title, price,
 * author, publisher
 * Write the definition for a class called Rectangle that has floating point
 * data members length and width.
 */