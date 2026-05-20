
package Loops;
public class NestedTri {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= (4 - i); k++) {
                System.out.print("  ");
            }
            for (int n = (4-i+1); n <= 4; n++) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }

}
