package String;

public class Immutable {
    static void main(String[] args) {
        String city = "Bhopal";//Bhopal still exists
        System.out.println(city);

        //String class are not to be changeable

        city = "Indore";//now city refer the indore
        System.out.println(city);

        System.out.println(city==city);//true
    }
}
