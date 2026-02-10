public class Student {
    private String name;
    private double balance;
    private int id;
    private static int idGen = 1;

    public Student(String nameIn){
        name = nameIn;
        balance = 0;
        id = idGen;
        idGen++;
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
}
