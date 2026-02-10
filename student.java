import java.util.*;

public class Student {
    private String name;
    private double balance;
    private int id;
    private static int idGen = 1;
    private static ArrayList<Student> studentList = new ArrayList<Student>();

    public Student(String nameIn){
        name = nameIn;
        balance = 0;
        id = idGen;
        idGen++;
        studentList.add(this);
    }

    public String toString(){
        return "Student name: " + name + ", ID number: " + id + ", Balance: $" + balance;
    }

    public void addFunds(double fundsAdded){
        balance += fundsAdded;
    }

    public void makePurchaseStudent(){
        balance -= 7;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public static void printStudentList(){
        for(Student a : studentList){
            System.out.println(a.toString());
        }
    }

    public static void printNegativeStudents(){
        for(Student a : studentList){
            if(a.getBalance() < 0){
                System.out.println(a.toString());
            }
        }
    }
}
