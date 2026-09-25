package COLLECTION.List.ArrayList.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SizeEx1 {
    static void main(String[] args) {
        List<String> monthList ;
        monthList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i <= 4 ; i++){
            System.out.println("Enter Month Name : ");
            String month = sc.next();
            monthList.add(month);
        }
        for(int i = monthList.size()-1;i>=0;i--){
            System.out.println(monthList.get(i));
        }

    }
}
