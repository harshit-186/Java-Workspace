package String_Methods;

public class RepalceFirstAll {
    static void main(String[] args) {

        String ctr = "BLUEBLUE";

        System.out.println(ctr.replaceFirst("UE" , "ACK"));

        System.out.println(ctr.replaceAll("UE" , "ACK"));
    }
}
