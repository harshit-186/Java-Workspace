package MAP.TreeMap.Custom;

import java.util.Map;
import java.util.TreeMap;

public class UseStudent {
    static void main(String[] args) {
        Map<Integer,Student> stMap = new TreeMap<>();
        Student s1 = new Student("Rahul", 156 , 86.89);
        Student s2 = new Student("Amit", 106 , 89.80);
        Student s3 = new Student("Ketan", 136 , 75.09);
        Student s4 = new Student("Sahil", 166 , 86.65);
        Student s5 = new Student("Ashish", 126 , 86.58);

        stMap.put(s1.getRoll(), s1);
        stMap.put(s2.getRoll(),s2);
        stMap.put(s3.getRoll(),s3);
        stMap.put(s4.getRoll(),s4);
        stMap.put(s5.getRoll(),s5);

        for(Map.Entry<Integer,Student> st : stMap.entrySet()){
            System.out.println("Roll : "+st.getKey()+"\t Student : "+st.getValue());
            // sorted output
        }


    }
}
