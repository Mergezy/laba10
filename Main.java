// Абстрактный класс с именем Person
abstract class Person {
    private String name;
    private int yearOfBirth;
    private double salary;

    public Person(String name, int yearOfBirth, double salary) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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
        System.out.println("Director Name: " + getName());
        System.out.println("Year of Birth: " + getYearOfBirth());
        System.out.println("Salary: " + getSalary());
    }
}

class HeadOfDepartment extends Person {
    public HeadOfDepartment(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth, salary);
    }
    void display() {
        System.out.println("Head of Department Name: " + getName());
        System.out.println("Year of Birth: " + getYearOfBirth());
        System.out.println("Salary: " + getSalary());
    }
}

class Employee extends Person {
    public Employee(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth, salary);
    }
    void display() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Year of Birth: " + getYearOfBirth());
        System.out.println("Salary: " + getSalary());
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
