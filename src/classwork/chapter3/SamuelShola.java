package classwork.chapter3;

public class SamuelShola {
    private int date;
    private int month;
    private int currentYear;

    public void setCurrentDate(int currentDate, int currentMonth, int currentYear){

        this.date = currentDate;
        this.month = currentMonth;
        this.currentYear = currentYear;


    }public String getCurrentDate(int date, int month, int year){

        this.date = date;
        this.month = month;
        this.currentYear = year;
        return ("registration date is : "+date+"\n" +
                "registration month is : "+month+"\n" +
                "registration year is : "+year);


    }
    public void setBirthInformation(int birthDate, int birthMonth, int birthYear){
        this.date = birthDate;
        this.month = birthMonth;

            birthYear = currentYear - birthYear;


    }
    public String getBirthInformation(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.currentYear = year;

        return ("registration date is : "+date+"\n" +
                "registration month is : "+month+"\n" +
                "registration year is : "+year);


    }
    public  void displayCurrentDate(int birthYear){
        System.out.println(birthYear);

    }

    public static void main(String[] args) {
        SamuelShola age = new SamuelShola();
    }


}
