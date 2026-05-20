package Loops;
public class CharTriangle {
    public static void main(String[] args) {
        for (char a = 'A'; a <= 'D'; a++) {
            for(char i ='A'; i<=a; i++){
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }

}
