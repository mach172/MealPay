public class purchase {
    private student purchaser;
    private int month;
    private int day;

    public purchase(student studentIn, int monthIn, int dayIn){
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

    public student getStudent(){
        return purchaser;
    }
}
