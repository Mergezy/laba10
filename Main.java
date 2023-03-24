// Абстрактный класс с именем Person
abstract class Person {
    String name;
    int yearOfBirth;
    double salary;

    public Person(String name, int yearOfBirth, double salary) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    //Абстрактные методы
    abstract void display();
}

// Три класса с именами Director, Head of Department и Employee, которые наследуются от класса Person
class Director extends Person {
    public Director(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth, salary);
    }

    //  Абстрактные методы
    void display() {
        System.out.println("Director Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Salary: " + salary);
    }
}

class HeadOfDepartment extends Person {
    public HeadOfDepartment(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth, salary);
    }
    void display() {
        System.out.println("Head of Department Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Person {
    public Employee(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth, salary);
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Director director = new Director("John", 1980, 5000);
        HeadOfDepartment hod = new HeadOfDepartment("Sarah", 1985, 4000);
        Employee emp = new Employee("Mike", 1990, 3000);

        director.display();
        hod.display();
        emp.display();
    }
}
