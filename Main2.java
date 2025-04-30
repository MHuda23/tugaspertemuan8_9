/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person("Andi", "Jl. Merdeka", "081234567890", "andi@email.com");
        Student student = new Student("Budi", "Jl. Proklamasi", "081298765432", "budi@email.com", Student.SENIOR);
        Employee employee = new Employee("Citra", "Jl. Kebangsaan", "081276543210", "citra@email.com",
                "Ruang 101", 6000000, new MyDate(1, 1, 2020));
        Faculty faculty = new Faculty("Dedi", "Jl. Akademik", "081234567123", "dedi@email.com",
                "Ruang 202", 8000000, new MyDate(15, 3, 2015), 10, "Lektor");
        Staff staff = new Staff("Eka", "Jl. Administrasi", "081212345678", "eka@email.com",
                "Ruang 303", 5000000, new MyDate(10, 6, 2018), "Sekretaris");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

// KELAS MyDate
class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

// KELAS Person 
class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

// KELAS Student
class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + name + ", Status: " + status;
    }
}

// KELAS Employee 
class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + name + ", Office: " + office + ", Salary: " + salary + ", Hired: " + dateHired;
    }
}

//  KELAS Faculty 
class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email,
                   String office, double salary, MyDate dateHired,
                   int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + name + ", Rank: " + rank + ", Office Hours: " + officeHours;
    }
}

//  KELAS Staff
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + name + ", Title: " + title;
    }
}
