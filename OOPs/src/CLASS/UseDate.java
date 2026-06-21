package CLASS;

import java.util.Scanner;

class Date{
    private int day , year;
    private String month;
    public Date(int d , int y , String m){
        day = d ;
        year=y;
        month=m;
    }
    public void showDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}
public class UseDate {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Day : ");
//        int d = sc.nextInt();
//        System.out.print("Enter month : ");
//        String m = sc.next();
//        System.out.print("Enter year : ");
//        int y = sc.nextInt();
        Date today = new Date(13 , 2026 , "June");
        System.out.print("Today's date is : ");
        today.showDate();
        Date birthDay= new Date(00,0000,"Aug");
        System.out.print("Your birthday is coming on : ");
        birthDay.showDate();
    }
}
