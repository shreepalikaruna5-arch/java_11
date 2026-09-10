/* Create an Employee class with:
id
name
salary
create a parameterized constructor to initialize all three values 
create a method displayEmployee() to diaplay the employee information 
create three employee objects in main()
*/
class Main{
    int id;
    String name;
    double salary;

    public Main(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary= salary;
    }

    public void displayEmployee(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: "+salary);
    }
}
public class Employee{
    public static void main(String[] args){
        Main emp1 = new Main(1, "Jimmy",20000.00);
        emp1.displayEmployee();
        Main emp2 = new Main(2,"Aou",25000.00);
        emp2.displayEmployee();
        Main emp3 = new Main(3, "Joong",30000.00);
        emp3.displayEmployee();
    }
}
