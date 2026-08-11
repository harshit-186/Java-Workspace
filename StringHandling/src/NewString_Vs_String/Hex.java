package NewString_Vs_String;

public class Hex {
    static void main(String[] args) {

        // It creates the new object for every new keyword and stores the Bhopal at different references
        String city1 = new String("Bhopal");
        String city2 = new String("Bhopal");
        System.out.println(city1==city2);


        // It refers the same Bhopal which is in SCP area (Only applicabe when that String is already exists in SCP)
        //Better than new String bcoz it saves memory and increase readability
        String str = "Bhopal";
        String ctr = "Bhopal";
        System.out.println(str==ctr);

    }
}
