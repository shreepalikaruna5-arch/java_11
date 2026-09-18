/*Question 1 — Student

Create a Student class with:
id
name
age
Create the following overloaded constructors:
Constructor with no arguments
Constructor with id and name
Constructor with id, name, and age
Create three Student objects using the three different constructors and display their information.*/

class Student1 {
    int id;
    String name;
    int age;
    Student1() {
        id = 1;
        name = "Karuna";
        age = 15;
    }
    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void displayInformation() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1(1, "Karuna");
        Student1 s3 = new Student1(2, "karu", 15);
        s1.displayInformation();
        s2.displayInformation();
        s3.displayInformation();
    }
}