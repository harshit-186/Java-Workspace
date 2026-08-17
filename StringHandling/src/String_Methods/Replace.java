package String_Methods;

public class Replace {
    static void main(String[] args) {

        String str = "DOVE";
        System.out.println(str.replace('D','L'));

        String ctr = "BLUEBLUE";

        System.out.println(ctr.replaceFirst("UE" , "ACK"));

        System.out.println(ctr.replaceAll("UE" , "ACK"));
    }
}
