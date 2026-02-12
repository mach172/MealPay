import java.util.ArrayList;
/*
public class PurchaseHistory {
    private ArrayList<ArrayList<Purchase>> history;

    public PurchaseHistory(){
        history = new ArrayList<ArrayList<Purchase>>();
    }

    public void makePurchase(Student studentIn, int monthIN, int dayIN){
        studentIn.makePurchaseStudent();
        boolean isUsed = false;
        for(int i = 0; i < history.size(); i++){
            if((history.get(i).get(0).getMonth() == monthIN) && (history.get(i).get(0).getDay() == dayIN)){
                history.get(i).add(new Purchase(studentIn, monthIN, dayIN));
                isUsed = true;
            }
        }
        if(!isUsed){
            int a = history.size();
            history.add(new ArrayList<Purchase>());
            history.get(a).add(new Purchase(studentIn, monthIN, dayIN));
        }
    }

    public void printPurchasesDay(int monthIN, int dayIN){
        System.out.println("Purchases on " + monthIN + "/" + dayIN + ":");
        for(ArrayList<Purchase> b : history){
            for(Purchase a : b){
                if((a.getMonth() == monthIN) && (a.getDay() == dayIN)){
                    System.out.println("Student: " + a.getStudent().getName() + ", ID: " + a.getStudent().getID() + " -$7 from account");
                }
            }
        }
    }

    public void printPurchasesStudent(Student studentIn){
        System.out.println("Purchases by " + studentIn.getName() + " (ID: " + studentIn.getID() + "):");
        for(ArrayList<Purchase> b : history){
            for(Purchase a : b){
                if(a.getStudent().equals(studentIn)){
                    System.out.println("Date: " + a.getMonth() + "/"  + a.getDay()+ ", -$7 from account");
                }
            }
        }
    }
}
*/
