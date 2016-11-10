package lab11;

class Person {
    String name = "unknown";
    public Person() {
        System.out.println("(person)");
    }

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "person : " + name;
    }
}

class Employee extends Person {
    public Employee() {
        System.out.println("(employee)");
    }
    public String toString() {
        return "employee : " + name;
    }
}

class Faculty extends Employee {
    public Faculty() {
        this("no name faculty");
        System.out.println("(faculty)");
    }
    public Faculty(String name) {
        this.name = name;
    }
    public String toString() {
        return "faculty : " + name;
    }
}

class Student extends Person {

    public Student() {
        // automatically calling parent's default constructor
        // super();
        System.out.println("(student)");
    }

    public Student(String name) {
        super(name);
    }

    public String toString() {
        return "student : " + name;
    }
}

public class Inheritence {

    public static void p( Employee x ) {
        System.out.println("e");
        System.out.println(x);
    }

    public static void p( Person x ) {
        System.out.println("p");
        System.out.println(x);
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println( student ); // automatically calls student.toString();
        System.out.println( new Student("bob") );
        System.out.println( new Faculty() ) ;

        p( new Student("anand") );
        p( new Faculty("john") );
        p( new Person("donut") );
    }
}

