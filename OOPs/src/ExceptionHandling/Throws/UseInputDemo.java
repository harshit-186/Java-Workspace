package ExceptionHandling.Throws;

import java.io.IOException;

public class UseInputDemo {
    static void main(String[] args) throws IOException {
        InputDemo hex = new InputDemo();
        hex.acceptInt();
        hex.acceptChar();//handle the Exception or use throws Keyword with Exception class
    }
}
