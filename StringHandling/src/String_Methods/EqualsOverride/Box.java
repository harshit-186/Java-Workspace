package String_Methods.EqualsOverride;

public class Box {
    private int l , b , h ;

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public String toString(){
        return "Box{"+ "l ="+l+", b ="+b+", h ="+h+"}";
    }
    public boolean equals (Object o) {
        Box p = (Box) o;
        if(this.l==p.l && this.b==p.b && this.h==p.h)
            return true;
        return false;
    }
}
