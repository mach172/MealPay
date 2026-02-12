import java.util.*;

public class Student {
    private String name;
    private double balance;
    private int id;
    private static int idGen = 1;
    private static ArrayList<Purchase> purchaseHistory;

    public Student(String nameIn){
        name = nameIn;
        balance = 0;
        id = idGen;
        idGen++;
        purchaseHistory = new ArrayList<Purchase>();
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

    public ArrayList<Purchase> getPurchaseHistory(){
        return purchaseHistory;
    }

    public void printPurchaseHistoryDay(int monthIn, int dayIn){
        for(Purchase a : purchaseHistory){
            if((a.getDay() == dayIn) && (a.getMonth() == monthIn)){
                System.out.println(a.toString());
            }
        }
    }

    public void addPurchase(Student student, int month, int day){
        purchaseHistory.add(new Purchase(student, month, day));
    }
}
