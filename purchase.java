public class Purchase {
    private Student purchaser;
    private int month;
    private int day;

    public Purchase(Student studentIn, int monthIn, int dayIn){
        purchaser = studentIn;
        month = monthIn;
        day = dayIn;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public Student getStudent(){
        return purchaser;
    }
}
