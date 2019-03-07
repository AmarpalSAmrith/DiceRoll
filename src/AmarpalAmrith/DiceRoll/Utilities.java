package AmarpalAmrith.DiceRoll;

public class Utilities {
    public static void welcomeMsg(String msg) {
        System.out.println(msg);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            s.append("=");
        }
        System.out.println(s.toString());
    }
}
