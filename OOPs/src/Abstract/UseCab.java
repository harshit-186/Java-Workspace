package Abstract;
abstract class Cab{
    private String name ;
    private double km ;
    double fare;
    public Cab(String name , double km){
        this.name=name;
        this.km=km;
    }
    public double getKm(){
        return km;
    }
    public abstract void calFare();

    public void show(){
        System.out.println("Name="+name+", Km="+km+", Fare="+fare);
        System.out.println();
    }
}

class Mini extends Cab{
    public Mini(String name , double km){
        super(name,km);
    }
    public void calFare(){
        fare= super.getKm()*20;
    }
}

class Sedan extends Cab{
    public Sedan (String name , double km){
        super(name,km);
    }
    public void calFare(){
        fare= super.getKm()*30;
    }
}
class Luxury extends Cab{
    public Luxury (String name , double km){
        super(name,km);
    }
    public void calFare(){
        fare= super.getKm()*50;
    }
}
public class UseCab {
    static void main() {

        Cab cab ;

        cab = new Mini("MINI",40.0);
        cab.calFare();
        cab.show();

        cab = new Sedan("SEDAN",40.0);
        cab.calFare();
        cab.show();

        cab = new Luxury("LUXURY",40.0);
        cab.calFare();
        cab.show();
    }
}
