package Polymorphism;
class Language{
//    public static void show(){
//        System.out.println("Hello HEX");
//    }
    public void greeting(){

    }
}
 class English extends Language{
//    public static void show(){
//        System.out.println("Show of English");
//    }
    public void greeting(){
        System.out.println("Good Morning");
    }
}
class Hindi extends Language{
    public void greeting(){
        System.out.println("Suprabhat");
    }
        }
        class French extends Language{
    public void greeting(){
        System.out.println("Bon Jour!");
    }
        }
public class UseLanguage {
    static void main() {
        Language lng ;

        lng = new English();
        lng.greeting();
//        lng.show();

        lng = new Hindi();
        lng.greeting();//Same Syntax But Different Body = POLYMORPHISM

        lng = new French();
        lng.greeting();
    }
}
