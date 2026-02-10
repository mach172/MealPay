import java.util.ArrayList;

public class purchaseHistory {
    private ArrayList<ArrayList<purchase>> history;

    public purchaseHistory(){
        history = new ArrayList<ArrayList<purchase>>();
    }

    public void makePurchase(student studentIn, int monthIN, int dayIN){
        studentIn.makePurchaseStudent();
        //history.add(new purchase(studentIn, monthIN, dayIN)); FIX TS
    }

    public void printPurchases(int monthIN, int dayIN){
        System.out.println("Purchases on " + monthIN + "/" + dayIN + ":");
        for(ArrayList<purchase> b : history){
            for(purchase a : b){
                if((a.getMonth() == monthIN) && (a.getDay() == dayIN)){
                    System.out.println("Student: " + a.getStudent().getName() + ", ID: " + a.getStudent().getID() + " -$7 from account");
                }
            }
        }
    }

    public void printPurchasesStudent(student studentIn){
        System.out.println("Purchases by " + studentIn.getName() + " (ID: " + studentIn.getID() + "):");
        for(ArrayList<purchase> b : history){
            for(purchase a : b){
                if(a.getStudent().equals(studentIn)){
                    System.out.println("Date: " + a.getMonth() + "/"  + a.getDay()+ ", -$7 from account");
                }
            }
        }
    }
}
